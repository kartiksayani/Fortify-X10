/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import srf.transpiler.fortxtrans.fortXTrans.Component
import srf.transpiler.fortxtrans.fortXTrans.Import
import srf.transpiler.fortxtrans.fortXTrans.Export
import srf.transpiler.fortxtrans.fortXTrans.Decls
import srf.transpiler.fortxtrans.fortXTrans.Decl
import srf.transpiler.fortxtrans.fortXTrans.FnDecl
import srf.transpiler.fortxtrans.fortXTrans.ValParam
import srf.transpiler.fortxtrans.fortXTrans.FieldDecl
import srf.transpiler.fortxtrans.fortXTrans.Expr
import srf.transpiler.fortxtrans.fortXTrans.ExprFront
import srf.transpiler.fortxtrans.fortXTrans.ExprTail
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExpr
import srf.transpiler.fortxtrans.fortXTrans.Do
import srf.transpiler.fortxtrans.fortXTrans.DoFront
import srf.transpiler.fortxtrans.fortXTrans.BlockElems
import srf.transpiler.fortxtrans.fortXTrans.Binding
import srf.transpiler.fortxtrans.fortXTrans.Elifs
import srf.transpiler.fortxtrans.fortXTrans.LocalVarDecl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FortXTransGenerator extends AbstractGenerator {

	 @Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(c: resource.allContents.toIterable.filter(Component)){
			fsa.generateFile(
                c.fullyQualifiedName.toString("/") + ".x10",
                c.compile)
		}
	}
	
	def compile(Component c)'''
		import x10.io.Console;
		import x10.lang.Math;
		import x10.array.Array_1;
		import x10.array.Array_2;
		import x10.array.Array_3;
		/*needs to import
		«FOR i:c.imports»
			«i.compile»
		«ENDFOR»
		*/
		/*exports
		«FOR e:c.exports»
			«e.compile»
		«ENDFOR»
		*/
		
		public class «c.name»{
			«FOR d:c.decls»
				«d.compile»
			«ENDFOR»
		}
	'''
	
	def compile(Import i)'''
		«IF i.api===null»
			«i.imps» «i.importedNames.impname
			»«IF i.importedNames.asname!==null
				»as «i.importedNames.asname
			»«ELSE
				»«IF i.importedNames.simpList.length !=0
				».{«
					FOR s:0..<(i.importedNames.simpList.length)
						»«IF s===0»«
							i.importedNames.simpList.get(s).orig
						»«ELSE
							», «i.importedNames.simpList.get(s).orig
						»«ENDIF
				
						»«IF i.importedNames.simpList.get(s).asName!==null
							» as «i.importedNames.simpList.get(s).asName
						»«ENDIF
					»«ENDFOR
					»«IF i.importedNames.comma
						» , ... «
					ENDIF
				»}«
				ELSE».{...}«
					IF i.importedNames.except
						» except «
						IF i.importedNames.simp.brack!==null
							»{«
							FOR s:0..<(i.importedNames.simp.nameList.length)
								»«IF s==0»«
									i.importedNames.simp.nameList.get(s).name
								»«ELSE
									», «i.importedNames.simp.nameList.get(s).name
								»«ENDIF
							»«ENDFOR
							»}«
						ELSE
							»«i.importedNames.simp.nameList.get(0).name
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF
		»«ELSE»
			«i.imps» «i.api 
			» «IF i.aliasedimportedNames.brack!==null
				»{«
				FOR s:0..<(i.aliasedimportedNames.nameList.length)
					»«IF s==0
						»«i.aliasedimportedNames.nameList.get(0).orig
					»«ELSE
						», «i.aliasedimportedNames.nameList.get(0).orig
					»«ENDIF
					
					»«IF i.aliasedimportedNames.nameList.get(s).asName!==null
						» as «i.aliasedimportedNames.nameList.get(0).asName
					»«ENDIF
				»«ENDFOR
				»}«
			ELSE
				»«i.aliasedimportedNames.nameList.get(0).orig
				»«IF i.aliasedimportedNames.nameList.get(0).asName!==null
					» as «i.aliasedimportedNames.nameList.get(0).asName
				»«ENDIF
			»«ENDIF
		»«ENDIF»
	'''
	
	def compile(Export e)'''
		«e.exp
		» «IF e.brack!==null
			»{«
			FOR s:0..<(e.exportedName.length)
				»«IF s==0
					»«e.exportedName.get(s)
				»«ELSE
					», «e.exportedName.get(s)
				»«ENDIF
			»«ENDFOR
			»}«
		ELSE
			»«e.exportedName.get(0)
		»«ENDIF»
	'''
	
	def compile(ValParam p)
	'''«IF p.params.length==0
		»«
	ELSE»«
		IF p.brack===null
			»«p.params.get(0)»«
		ELSE»«
			FOR s:0..<p.params.length»«
				IF s==0
					»«p.params.get(s).BId»:«
				ELSE
					», «p.params.get(s).BId
				»:«ENDIF»«
				IF p.params.get(s).istype.type.tname=="ZZ32"
					»Int«
				ELSE»«
					IF p.params.get(s).istype.type.tname=="ZZ64"
						»Long«
					ELSE»«
						IF p.params.get(s).istype.type.tname=="RR32"
							»Float«
						ELSE»«
							IF p.params.get(s).istype.type.tname=="RR64"
								»Double«
							ELSE»«
								IF p.params.get(s).istype.type.tname=="String"
									»String«
								ELSE»«
									p.params.get(s).istype.type.tname									
								»«ENDIF
							»«ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDFOR
		»«ENDIF
	»«ENDIF»'''
	
	def compile(Decls d)'''
		«FOR dec:d.decls»
			«dec.compile»
		«ENDFOR»
	'''
	
	def compile(Decl d)'''
		«IF d.function!==null»
			«d.function.compile»
		«ELSE» «IF d.field!==null»
			«d.field.compile»
			«ENDIF»
		«ENDIF»
	'''
	
	def compile(FieldDecl f)
	'''«IF f.vars!==null
	»«IF f.vars.single!==null»«IF f.pri!==null
		»private«ENDIF
		»«
		IF f.mut===null
		»«IF f.init.immut!==null»static val «
		ELSE
		»var «
		ENDIF
		»«ELSE»var «ENDIF»«f.vars.single.bid»:«
		IF f.vars.single.istype.type.tname=="ZZ32"
			»Int = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.intg»n«ENDIF»;
			«
		ELSE»«
			IF f.vars.single.istype.type.tname=="ZZ64"
				»Long = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.intg»l«ENDIF»;
				«
			ELSE»«
				IF f.vars.single.istype.type.tname=="RR32"
					»Float = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.flot»f«ENDIF»;
					«
				ELSE»«
					IF f.vars.single.istype.type.tname=="RR64"
						»Double = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.flot»d«ENDIF»;
						«
					ELSE»«
						IF f.vars.single.istype.type.tname=="String"
							»String = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»"«f.init.lit.lit.str»"«ENDIF»;
							«
						ELSE»«
							f.vars.single.istype.type.tname» = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q
								»«ELSE»«IF f.init.lit.lit.str!==null»"«f.init.lit.lit.str»"«
								ELSE»«IF f.init.lit.lit.flot!==null»«f.init.lit.lit.flot»f«
								ELSE»«f.init.lit.lit.intg»n«ENDIF»«ENDIF»«ENDIF»;
							«
						ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF
		»«ENDIF
	»«ELSE
		»«FOR m:0..<f.vars.multiple.length»
			«IF f.pri!==null
				»private«ENDIF
				»«
				IF f.mut===null
				»«IF f.init.immut!==null»static val «
				ELSE
				»var «
				ENDIF
		»«ELSE»var «ENDIF»«f.vars.multiple.get(m).bid»:«
				IF f.vars.multiple.get(m).istype.type.tname=="ZZ32"
					»Int = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»;
					«
				ELSE»«
					IF f.vars.multiple.get(m).istype.type.tname=="ZZ64"
						»Long = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»l«ENDIF»;
						«
					ELSE»«
						IF f.vars.multiple.get(m).istype.type.tname=="RR32"
							»Float = « IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»f«ENDIF»;
							«
						ELSE»«
							IF f.vars.multiple.get(m).istype.type.tname=="RR64"
								»Double = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»d«ENDIF»;
								«
							ELSE»«
								IF f.vars.multiple.get(m).istype.type.tname=="String"
									»String = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»"«f.init.lit.lits.get(m).str»"«ENDIF»;
									«
								ELSE»«
									f.vars.multiple.get(m).istype.type.tname» = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q
										»«ELSE»«IF f.init.lit.lits.get(m).str!==null»"«f.init.lit.lits.get(m).str»"«
										ELSE»«IF f.init.lit.lits.get(m).flot!==null»«f.init.lit.lits.get(m).flot»f«
										ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»«ENDIF»«ENDIF»;
								«ENDIF
							»«ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDFOR»
	«ENDIF
	»«ELSE
	»«IF f.type!==null
	»«FOR m:0..<f.idtup.bid.length»
		«IF f.pri!==null
			»private«ENDIF
			»«
			IF f.mut===null
			»«IF f.init.immut!==null»static val «
			ELSE
			»var «ENDIF
		»«ELSE»var «ENDIF»«f.idtup.bid.get(m)»: «
			IF f.type.tname=="ZZ32"
				»Int = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»;
				«
			ELSE»«
				IF f.type.tname=="ZZ64"
					»Long = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»f«ENDIF»;
					«
				ELSE»«
					IF f.type.tname=="RR32"
						»Float = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»f«ENDIF»;
						«
					ELSE»«
						IF f.type.tname=="RR64"
							»Double = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»d«ENDIF»;
							«
						ELSE»«
							IF f.type.tname=="String"
								»String = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»"«f.init.lit.lits.get(m).str»"«ENDIF»;
								«
							ELSE»«
								f.type.tname» = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q
								»«ELSE»«IF f.init.lit.lits.get(m).str!==null»"«f.init.lit.lits.get(m).str»"«
								ELSE»«IF f.init.lit.lits.get(m).flot!==null»«f.init.lit.lits.get(m).flot»f«
								ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»«ENDIF»«ENDIF»;
								«
							ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF
		»«ENDFOR»
	«ELSE»«IF f.tuptype!==null
	»«FOR m:0..<f.idtup.bid.length»
		«IF f.pri!==null
			»private«
		ENDIF
			»«
		IF f.mut===null
			»«IF f.init.immut!==null»static val «
		ELSE
			»var «ENDIF
		»«ELSE»var «ENDIF»«f.idtup.bid.get(m)»: «
		IF f.tuptype.types.get(m).tname=="ZZ32"
			»Int = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»;
			«
		ELSE»«
			IF f.tuptype.types.get(m).tname=="ZZ64"
				»Long = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»l«ENDIF»;
				«
			ELSE»«
				IF f.tuptype.types.get(m).tname=="RR32"
					»Float = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»f«ENDIF»;
					«
				ELSE»«
					IF f.tuptype.types.get(m).tname=="RR64"
						»Double = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»d«ENDIF»;
						«
					ELSE»«
						IF f.tuptype.types.get(m).tname=="String"
						»String = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»"«f.init.lit.lits.get(m).str»"«ENDIF»;
							«
						ELSE»«
							f.tuptype.types.get(m).tname» = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«
							ELSE»«IF f.init.lit.lits.get(m).str!==null»"«f.init.lit.lits.get(m).str»"«
							ELSE»«IF f.init.lit.lits.get(m).flot!==null»«f.init.lit.lits.get(m).flot»f«
							ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»«ENDIF»«ENDIF»;
							«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF
		»«ENDIF»
	«ENDFOR»
	«ELSE
	»«IF f.litTup!==null
		»«IF f.idtup.bid.length==1
			»«IF f.pri!==null
				»private«
			ENDIF
				» static val «
				f.idtup.bid.get(0)» = «
				IF f.litTup.lit.q!==null»
					«f.litTup.lit»«
				ELSE»«
				IF f.litTup.lit.flot!==null
					»«f.litTup.lit.flot»f«
				ELSE»«IF f.litTup.lit.str!==null
					»"«f.litTup.lit.str»"«
				ELSE
					»«f.litTup.lit.intg
				»n«ENDIF»«ENDIF»«ENDIF
			»;
			«
		ELSE
		»«FOR m:0..<f.idtup.bid.length
			»«IF f.pri!==null
				»private«
			ENDIF
				» static val «
			f.idtup.bid.get(m)» = «
							IF f.litTup.lits.get(m).q!==null»
								«f.litTup.lits.get(m)»«
							ELSE»«
							IF f.litTup.lits.get(m).flot!==null
								»«f.litTup.lits.get(m).flot»f«
							ELSE»«IF f.litTup.lits.get(m).str!==null
								»"«f.litTup.lits.get(m).str»"«
							ELSE
								»«f.litTup.lits.get(m).intg
							»n«ENDIF»«ENDIF»«ENDIF
						»;
						«
		ENDFOR
	»«ENDIF»«ENDIF»«ENDIF»«ENDIF»«ENDIF»
	'''
	
	def compile(FnDecl f)'''
		«IF f.name=='run'»
		public static def main(args:Rail[String])«
		ELSE
		»«IF f.mods!==null
			»«FOR mod:f.mods.mods
				»«mod.modtype
			»«ENDFOR
		»«ENDIF» static def «f.name»(«IF f.params!==null»«f.params.compile»«ENDIF»)«
		IF f.retVal!==null»:«
			IF f.retVal.empty=='('
				»void«
			ELSE
				»«IF f.retVal.type.tname=="ZZ32"
					»Int«
				ELSE»«
					IF f.retVal.type.tname=="ZZ64"
						»Long«
					ELSE»«
						IF f.retVal.type.tname=="RR32"
							»Float«
						ELSE»«
							IF f.retVal.type.tname=="RR64"
								»Double«
							ELSE»«
								IF f.retVal.type.tname=="String"
									»String«
								ELSE»«
									f.retVal.type.tname
								»«ENDIF
							»«ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF
		»«ENDIF
		»«ENDIF»{	
		«IF f.body»
				«f.fnItself.compile»
		«ENDIF»
		}
		'''
	
	def compile(LocalVarDecl f)'''«IF f.vars!==null
		»«IF f.vars.single!==null»«IF f.mut===null
			»«IF f.init.immut!==null» val «
			ELSE
			»var «
			ENDIF
			»«ELSE»var «ENDIF»«f.vars.single.bid»:«
			IF f.vars.single.istype.type.tname=="ZZ32"
				»Int = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.intg»n«ENDIF»;
				«
			ELSE»«
				IF f.vars.single.istype.type.tname=="ZZ64"
					»Long = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.intg»l«ENDIF»;
					«
				ELSE»«
					IF f.vars.single.istype.type.tname=="RR32"
						»Float = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.flot»f«ENDIF»;
						«
					ELSE»«
						IF f.vars.single.istype.type.tname=="RR64"
							»Double = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»«f.init.lit.lit.flot»d«ENDIF»;
							«
						ELSE»«
							IF f.vars.single.istype.type.tname=="String"
								»String = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q»«ELSE»"«f.init.lit.lit.str»"«ENDIF»;
								«
							ELSE»«
								f.vars.single.istype.type.tname» = «IF f.init.lit.lit.q!==null»«f.init.lit.lit.q
									»«ELSE»«IF f.init.lit.lit.str!==null»"«f.init.lit.lit.str»"«
									ELSE»«IF f.init.lit.lit.flot!==null»«f.init.lit.lit.flot»f«
									ELSE»«f.init.lit.lit.intg»n«ENDIF»«ENDIF»«ENDIF»;
								«
							ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF
		»«ELSE
			»«FOR m:0..<f.vars.multiple.length»
				«IF f.mut===null
					»«IF f.init.immut!==null»val «
					ELSE
					»var «
					ENDIF
			»«ELSE»var «ENDIF»«f.vars.multiple.get(m).bid»:«
					IF f.vars.multiple.get(m).istype.type.tname=="ZZ32"
						»Int = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»;
						«
					ELSE»«
						IF f.vars.multiple.get(m).istype.type.tname=="ZZ64"
							»Long = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»l«ENDIF»;
							«
						ELSE»«
							IF f.vars.multiple.get(m).istype.type.tname=="RR32"
								»Float = « IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»f«ENDIF»;
								«
							ELSE»«
								IF f.vars.multiple.get(m).istype.type.tname=="RR64"
									»Double = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»d«ENDIF»;
									«
								ELSE»«
									IF f.vars.multiple.get(m).istype.type.tname=="String"
										»String = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»"«f.init.lit.lits.get(m).str»"«ENDIF»;
										«
									ELSE»«
										f.vars.multiple.get(m).istype.type.tname» = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q
											»«ELSE»«IF f.init.lit.lits.get(m).str!==null»"«f.init.lit.lits.get(m).str»"«
											ELSE»«IF f.init.lit.lits.get(m).flot!==null»«f.init.lit.lits.get(m).flot»f«
											ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»«ENDIF»«ENDIF»;
									«ENDIF
								»«ENDIF
							»«ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDFOR»
		«ENDIF
		»«ELSE
		»«IF f.type!==null
		»«FOR m:0..<f.idtup.bid.length»
			«IF f.mut===null
				»«IF f.init.immut!==null»val «
				ELSE
				»var «ENDIF
			»«ELSE»var «ENDIF»«f.idtup.bid.get(m)»: «
				IF f.type.tname=="ZZ32"
					»Int = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»;
					«
				ELSE»«
					IF f.type.tname=="ZZ64"
						»Long = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»f«ENDIF»;
						«
					ELSE»«
						IF f.type.tname=="RR32"
							»Float = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»f«ENDIF»;
							«
						ELSE»«
							IF f.type.tname=="RR64"
								»Double = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»d«ENDIF»;
								«
							ELSE»«
								IF f.type.tname=="String"
									»String = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»"«f.init.lit.lits.get(m).str»"«ENDIF»;
									«
								ELSE»«
									f.type.tname» = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q
									»«ELSE»«IF f.init.lit.lits.get(m).str!==null»"«f.init.lit.lits.get(m).str»"«
									ELSE»«IF f.init.lit.lits.get(m).flot!==null»«f.init.lit.lits.get(m).flot»f«
									ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»«ENDIF»«ENDIF»;
									«
								ENDIF
							»«ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDFOR»
		«ELSE»«IF f.tuptype!==null
		»«FOR m:0..<f.idtup.bid.length»
			«IF f.mut===null
				»«IF f.init.immut!==null»val «
			ELSE
				»var «ENDIF
			»«ELSE»var «ENDIF»«f.idtup.bid.get(m)»: «
			IF f.tuptype.types.get(m).tname=="ZZ32"
				»Int = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»;
				«
			ELSE»«
				IF f.tuptype.types.get(m).tname=="ZZ64"
					»Long = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).intg»l«ENDIF»;
					«
				ELSE»«
					IF f.tuptype.types.get(m).tname=="RR32"
						»Float = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»f«ENDIF»;
						«
					ELSE»«
						IF f.tuptype.types.get(m).tname=="RR64"
							»Double = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»«f.init.lit.lits.get(m).flot»d«ENDIF»;
							«
						ELSE»«
							IF f.tuptype.types.get(m).tname=="String"
							»String = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«ELSE»"«f.init.lit.lits.get(m).str»"«ENDIF»;
								«
							ELSE»«
								f.tuptype.types.get(m).tname» = «IF f.init.lit.lits.get(m).q!==null»«f.init.lit.lits.get(m).q»«
								ELSE»«IF f.init.lit.lits.get(m).str!==null»"«f.init.lit.lits.get(m).str»"«
								ELSE»«IF f.init.lit.lits.get(m).flot!==null»«f.init.lit.lits.get(m).flot»f«
								ELSE»«f.init.lit.lits.get(m).intg»n«ENDIF»«ENDIF»«ENDIF»;
								«ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF»
		«ENDFOR»
		«ELSE
		»«IF f.litTup!==null
			»«IF f.idtup.bid.length==1
				» val «
					f.idtup.bid.get(0)» = «
					IF f.litTup.lit.q!==null»
						«f.litTup.lit»«
					ELSE»«
					IF f.litTup.lit.flot!==null
						»«f.litTup.lit.flot»f«
					ELSE»«IF f.litTup.lit.str!==null
						»"«f.litTup.lit.str»"«
					ELSE
						»«f.litTup.lit.intg
					»n«ENDIF»«ENDIF»«ENDIF
				»;
				«
			ELSE
			»«FOR m:0..<f.idtup.bid.length
				» val «
				f.idtup.bid.get(m)» = «
								IF f.litTup.lits.get(m).q!==null»
									«f.litTup.lits.get(m)»«
								ELSE»«
								IF f.litTup.lits.get(m).flot!==null
									»«f.litTup.lits.get(m).flot»f«
								ELSE»«IF f.litTup.lits.get(m).str!==null
									»"«f.litTup.lits.get(m).str»"«
								ELSE
									»«f.litTup.lits.get(m).intg
								»n«ENDIF»«ENDIF»«ENDIF
							»;
							«
			ENDFOR
		»«ENDIF»«ENDIF»«ENDIF»«ENDIF»«ENDIF»'''
		
	def String compile(Expr e)
	'''«IF e.locVar!==null
	»«e.locVar.compile»«
	ELSE
	»«e.front.compile»«IF e.tails!==null»«
		FOR t:e.tails
			»«t.compile
		»«ENDFOR»«ENDIF»«ENDIF»'''	
	
	def compile(ExprTail t)''' as «t.type»'''
	
	def compile(ExprFront ef)'''«IF ef.id!==null
		»«ef.id
		»«ELSE
			»«IF ef.delim!==null
				»«ef.delim.compile
			»«ENDIF»«
		ENDIF»'''
	
	def compile(DelimitedExpr d)'''
«««				THE DO BLOCK
		«IF d.dod!==null
			»«d.dod.compile
		»«ELSE»
«««				THE WHILE PART
			«IF d.awhile!==null
			»while(«d.expr.compile»)«d.whiledod.compile»
			«ELSE»
«««				THE FOR PART
				«IF d.afor!==null
					»«IF d.gen.binding.seq===null»
					finish «ENDIF»for(«d.gen.binding.compile» in «d.gen.binding.expr.compile
						»)«IF d.gen.binding.seq===null»
						async «ENDIF»«
					IF d.gen.clause!==null
					»«FOR c:d.gen.clause»{
					«IF c.binding.seq===null»
					finish «ENDIF
					»for(«c.binding.compile» in «c.binding.expr.compile
					»)«IF c.binding.seq===null»
					async «ENDIF»«ENDFOR»«d.dofront.compile
					
					»«FOR c:0..<d.gen.clause.length»
					}«ENDFOR»«
					ELSE»«d.dofront.compile
					»«ENDIF»
«««				THE IF ELSE IF PART
				«ELSE
					»«IF d.anif!==null
					»if(«d.cond.compile») «d.block.compile
					»«IF d.elifs!==null
					»«d.elifs.compile»«
					ENDIF
					»«IF d.els!==null»
					else 
						«d.els.block.compile»
					«ENDIF»
					«ELSE»
						«IF d.par!==null»(«d.par.exp»)
						«ENDIF»
					«ENDIF»
«««				«ELSE
«««					»«IF d.»«ENDIF»
				«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	def compile(Elifs el)
	'''
	«FOR e:el.e»
		else if(«e.expr.compile»)«e.block.compile»
	«ENDFOR»
	'''
	
	def compile(Binding b)
	'''«IF b.idtup.bid.length==1
			»«b.idtup.bid.get(0)
		»«ELSE
			»«b.idtup.bid»«ENDIF»'''
	
	def compile(Do dobox)
	'''
	«FOR d:0..<dobox.dofs.length
		»«IF d!=0»
			async «
		ENDIF
		»«dobox.dofs.get(d).compile
	»«ENDFOR»
	'''

	def compile(DoFront dof)
		'''«IF dof.at
			»at(«dof.exp.compile») «
		ENDIF
		»«
		IF dof.atom
			»atomic «
		ENDIF
		»«dof.block.compile»'''
	
    def compile(BlockElems bs)
    '''
    {
   		«FOR b:0..<bs.block.length»
		    «bs.block.get(b).exp.compile»
		«ENDFOR»}
	'''
   
}
