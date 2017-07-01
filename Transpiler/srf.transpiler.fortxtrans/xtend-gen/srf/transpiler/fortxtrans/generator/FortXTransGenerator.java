/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import srf.transpiler.fortxtrans.fortXTrans.AddExpr;
import srf.transpiler.fortxtrans.fortXTrans.BindId;
import srf.transpiler.fortxtrans.fortXTrans.BlockElem;
import srf.transpiler.fortxtrans.fortXTrans.BlockElems;
import srf.transpiler.fortxtrans.fortXTrans.Component;
import srf.transpiler.fortxtrans.fortXTrans.Decl;
import srf.transpiler.fortxtrans.fortXTrans.Decls;
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExpr;
import srf.transpiler.fortxtrans.fortXTrans.DivExpr;
import srf.transpiler.fortxtrans.fortXTrans.Do;
import srf.transpiler.fortxtrans.fortXTrans.DoFront;
import srf.transpiler.fortxtrans.fortXTrans.ExponentExpr;
import srf.transpiler.fortxtrans.fortXTrans.Export;
import srf.transpiler.fortxtrans.fortXTrans.Expr;
import srf.transpiler.fortxtrans.fortXTrans.ExprList;
import srf.transpiler.fortxtrans.fortXTrans.FCall;
import srf.transpiler.fortxtrans.fortXTrans.FieldDecl;
import srf.transpiler.fortxtrans.fortXTrans.FnDecl;
import srf.transpiler.fortxtrans.fortXTrans.Import;
import srf.transpiler.fortxtrans.fortXTrans.LocalVarDecl;
import srf.transpiler.fortxtrans.fortXTrans.MultExpr;
import srf.transpiler.fortxtrans.fortXTrans.Param;
import srf.transpiler.fortxtrans.fortXTrans.QualifiedName;
import srf.transpiler.fortxtrans.fortXTrans.Stmnt;
import srf.transpiler.fortxtrans.fortXTrans.Stmnts;
import srf.transpiler.fortxtrans.fortXTrans.SubExpr;
import srf.transpiler.fortxtrans.fortXTrans.ValParam;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class FortXTransGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Component> _filter = Iterables.<Component>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Component.class);
    for (final Component c : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(c).toString("/");
      String _plus = (_string + ".x10");
      fsa.generateFile(_plus, 
        this.compile(c));
    }
  }
  
  public String compile(final Component c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import x10.io.Console;");
    _builder.newLine();
    _builder.append("import x10.lang.Math;");
    _builder.newLine();
    _builder.append("import x10.array.Array_1;");
    _builder.newLine();
    _builder.append("import x10.array.Array_2;");
    _builder.newLine();
    _builder.append("import x10.array.Array_3;");
    _builder.newLine();
    _builder.append("/*needs to import");
    _builder.newLine();
    {
      EList<Import> _imports = c.getImports();
      for(final Import i : _imports) {
        CharSequence _compile = this.compile(i);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/");
    _builder.newLine();
    _builder.append("/*exports");
    _builder.newLine();
    {
      EList<Export> _exports = c.getExports();
      for(final Export e : _exports) {
        CharSequence _compile_1 = this.compile(e);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Decls> _decls = c.getDecls();
      for(final Decls d : _decls) {
        _builder.append("\t");
        CharSequence _compile_2 = this.compile(d);
        _builder.append(_compile_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public CharSequence compile(final Import i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _api = i.getApi();
      boolean _tripleEquals = (_api == null);
      if (_tripleEquals) {
        String _imps = i.getImps();
        _builder.append(_imps);
        _builder.append(" ");
        QualifiedName _impname = i.getImportedNames().getImpname();
        _builder.append(_impname);
        {
          String _asname = i.getImportedNames().getAsname();
          boolean _tripleNotEquals = (_asname != null);
          if (_tripleNotEquals) {
            _builder.append("as ");
            String _asname_1 = i.getImportedNames().getAsname();
            _builder.append(_asname_1);
          } else {
            {
              int _length = ((Object[])Conversions.unwrapArray(i.getImportedNames().getSimpList(), Object.class)).length;
              boolean _notEquals = (_length != 0);
              if (_notEquals) {
                _builder.append(".{");
                {
                  int _length_1 = ((Object[])Conversions.unwrapArray(i.getImportedNames().getSimpList(), Object.class)).length;
                  ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_1, true);
                  for(final Integer s : _doubleDotLessThan) {
                    {
                      if (((s).intValue() == 0)) {
                        String _orig = i.getImportedNames().getSimpList().get((s).intValue()).getOrig();
                        _builder.append(_orig);
                      } else {
                        _builder.append(", ");
                        String _orig_1 = i.getImportedNames().getSimpList().get((s).intValue()).getOrig();
                        _builder.append(_orig_1);
                      }
                    }
                    {
                      String _asName = i.getImportedNames().getSimpList().get((s).intValue()).getAsName();
                      boolean _tripleNotEquals_1 = (_asName != null);
                      if (_tripleNotEquals_1) {
                        _builder.append(" as ");
                        String _asName_1 = i.getImportedNames().getSimpList().get((s).intValue()).getAsName();
                        _builder.append(_asName_1);
                      }
                    }
                  }
                }
                {
                  boolean _isComma = i.getImportedNames().isComma();
                  if (_isComma) {
                    _builder.append(" , ... ");
                  }
                }
                _builder.append("}");
              } else {
                _builder.append(".{...}");
                {
                  boolean _isExcept = i.getImportedNames().isExcept();
                  if (_isExcept) {
                    _builder.append(" except ");
                    {
                      String _brack = i.getImportedNames().getSimp().getBrack();
                      boolean _tripleNotEquals_2 = (_brack != null);
                      if (_tripleNotEquals_2) {
                        _builder.append("{");
                        {
                          int _length_2 = ((Object[])Conversions.unwrapArray(i.getImportedNames().getSimp().getNameList(), Object.class)).length;
                          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_2, true);
                          for(final Integer s_1 : _doubleDotLessThan_1) {
                            {
                              if (((s_1).intValue() == 0)) {
                                String _name = i.getImportedNames().getSimp().getNameList().get((s_1).intValue()).getName();
                                _builder.append(_name);
                              } else {
                                _builder.append(", ");
                                String _name_1 = i.getImportedNames().getSimp().getNameList().get((s_1).intValue()).getName();
                                _builder.append(_name_1);
                              }
                            }
                          }
                        }
                        _builder.append("}");
                      } else {
                        String _name_2 = i.getImportedNames().getSimp().getNameList().get(0).getName();
                        _builder.append(_name_2);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.newLineIfNotEmpty();
        String _imps_1 = i.getImps();
        _builder.append(_imps_1);
        _builder.append(" ");
        String _api_1 = i.getApi();
        _builder.append(_api_1);
        _builder.append(" ");
        {
          String _brack_1 = i.getAliasedimportedNames().getBrack();
          boolean _tripleNotEquals_3 = (_brack_1 != null);
          if (_tripleNotEquals_3) {
            _builder.append("{");
            {
              int _length_3 = ((Object[])Conversions.unwrapArray(i.getAliasedimportedNames().getNameList(), Object.class)).length;
              ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _length_3, true);
              for(final Integer s_2 : _doubleDotLessThan_2) {
                {
                  if (((s_2).intValue() == 0)) {
                    QualifiedName _orig_2 = i.getAliasedimportedNames().getNameList().get(0).getOrig();
                    _builder.append(_orig_2);
                  } else {
                    _builder.append(", ");
                    QualifiedName _orig_3 = i.getAliasedimportedNames().getNameList().get(0).getOrig();
                    _builder.append(_orig_3);
                  }
                }
                {
                  String _asName_2 = i.getAliasedimportedNames().getNameList().get((s_2).intValue()).getAsName();
                  boolean _tripleNotEquals_4 = (_asName_2 != null);
                  if (_tripleNotEquals_4) {
                    _builder.append(" as ");
                    String _asName_3 = i.getAliasedimportedNames().getNameList().get(0).getAsName();
                    _builder.append(_asName_3);
                  }
                }
              }
            }
            _builder.append("}");
          } else {
            QualifiedName _orig_4 = i.getAliasedimportedNames().getNameList().get(0).getOrig();
            _builder.append(_orig_4);
            {
              String _asName_4 = i.getAliasedimportedNames().getNameList().get(0).getAsName();
              boolean _tripleNotEquals_5 = (_asName_4 != null);
              if (_tripleNotEquals_5) {
                _builder.append(" as ");
                String _asName_5 = i.getAliasedimportedNames().getNameList().get(0).getAsName();
                _builder.append(_asName_5);
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Export e) {
    StringConcatenation _builder = new StringConcatenation();
    String _exp = e.getExp();
    _builder.append(_exp);
    _builder.append(" ");
    {
      String _brack = e.getBrack();
      boolean _tripleNotEquals = (_brack != null);
      if (_tripleNotEquals) {
        _builder.append("{");
        {
          int _length = ((Object[])Conversions.unwrapArray(e.getExportedName(), Object.class)).length;
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
          for(final Integer k : _doubleDotLessThan) {
            {
              if (((k).intValue() == 0)) {
                String _compile = this.compile(e.getExportedName().get((k).intValue()));
                _builder.append(_compile);
              } else {
                _builder.append(", ");
                String _compile_1 = this.compile(e.getExportedName().get((k).intValue()));
                _builder.append(_compile_1);
              }
            }
          }
        }
        _builder.append("}");
      } else {
        QualifiedName _get = e.getExportedName().get(0);
        _builder.append(_get);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String compile(final QualifiedName q) {
    StringConcatenation _builder = new StringConcatenation();
    String s = _builder.toString();
    int _length = ((Object[])Conversions.unwrapArray(q.getS(), Object.class)).length;
    boolean _equals = (_length == 1);
    if (_equals) {
      String _name = q.getS().get(0).getName();
      String _plus = (s + _name);
      s = _plus;
    } else {
      String _name_1 = q.getS().get(0).getName();
      String _plus_1 = (s + _name_1);
      s = _plus_1;
      int _length_1 = ((Object[])Conversions.unwrapArray(q.getS(), Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _length_1, true);
      for (final Integer ss : _doubleDotLessThan) {
        String _name_2 = q.getS().get((ss).intValue()).getName();
        String _plus_2 = ((s + ".") + _name_2);
        s = _plus_2;
      }
    }
    String _dots = q.getDots();
    boolean _tripleNotEquals = (_dots != null);
    if (_tripleNotEquals) {
      String _dots_1 = q.getDots();
      String _plus_3 = (s + _dots_1);
      s = _plus_3;
    }
    return s;
  }
  
  public CharSequence compile(final ValParam p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(p.getParams(), Object.class)).length;
      boolean _equals = (_length == 0);
      if (_equals) {
      } else {
        {
          String _brack = p.getBrack();
          boolean _tripleEquals = (_brack == null);
          if (_tripleEquals) {
            Param _get = p.getParams().get(0);
            _builder.append(_get);
          } else {
            {
              int _length_1 = ((Object[])Conversions.unwrapArray(p.getParams(), Object.class)).length;
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_1, true);
              for(final Integer s : _doubleDotLessThan) {
                {
                  if (((s).intValue() == 0)) {
                    BindId _bId = p.getParams().get((s).intValue()).getBId();
                    _builder.append(_bId);
                    _builder.append(":");
                  } else {
                    _builder.append(", ");
                    BindId _bId_1 = p.getParams().get((s).intValue()).getBId();
                    _builder.append(_bId_1);
                    _builder.append(":");
                  }
                }
                {
                  String _name = p.getParams().get((s).intValue()).getIstype().getType().getName();
                  boolean _equals_1 = Objects.equal(_name, "ZZ32");
                  if (_equals_1) {
                    _builder.append("Int");
                  } else {
                    {
                      String _name_1 = p.getParams().get((s).intValue()).getIstype().getType().getName();
                      boolean _equals_2 = Objects.equal(_name_1, "ZZ64");
                      if (_equals_2) {
                        _builder.append("Long");
                      } else {
                        {
                          String _name_2 = p.getParams().get((s).intValue()).getIstype().getType().getName();
                          boolean _equals_3 = Objects.equal(_name_2, "RR32");
                          if (_equals_3) {
                            _builder.append("Float");
                          } else {
                            {
                              String _name_3 = p.getParams().get((s).intValue()).getIstype().getType().getName();
                              boolean _equals_4 = Objects.equal(_name_3, "RR64");
                              if (_equals_4) {
                                _builder.append("Double");
                              } else {
                                {
                                  String _name_4 = p.getParams().get((s).intValue()).getIstype().getType().getName();
                                  boolean _equals_5 = Objects.equal(_name_4, "String");
                                  if (_equals_5) {
                                    _builder.append("String");
                                  } else {
                                    String _name_5 = p.getParams().get((s).intValue()).getIstype().getType().getName();
                                    _builder.append(_name_5);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Decls d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Decl> _decls = d.getDecls();
      for(final Decl dec : _decls) {
        CharSequence _compile = this.compile(dec);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Decl d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      FnDecl _function = d.getFunction();
      boolean _tripleNotEquals = (_function != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(d.getFunction());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        {
          FieldDecl _field = d.getField();
          boolean _tripleNotEquals_1 = (_field != null);
          if (_tripleNotEquals_1) {
            CharSequence _compile_1 = this.compile(d.getField());
            _builder.append(_compile_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final FieldDecl f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//FieldDecl");
    return _builder;
  }
  
  public CharSequence compile(final FnDecl f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//FnDecl");
    _builder.newLine();
    {
      boolean _isBody = f.isBody();
      if (_isBody) {
        String _compile = this.compile(f.getFnItself());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String compile(final Stmnts st) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Statements");
    _builder.newLine();
    {
      Stmnt _front = st.getFront();
      boolean _tripleNotEquals = (_front != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(st.getFront());
        _builder.append(_compile);
      } else {
        {
          LocalVarDecl _locVar = st.getLocVar();
          boolean _tripleNotEquals_1 = (_locVar != null);
          if (_tripleNotEquals_1) {
            CharSequence _compile_1 = this.compile(st.getLocVar());
            _builder.append(_compile_1);
          } else {
            _builder.newLineIfNotEmpty();
            {
              Expr _exp = st.getExp();
              boolean _tripleNotEquals_2 = (_exp != null);
              if (_tripleNotEquals_2) {
                String _compile_2 = this.compile(st.getExp());
                _builder.append(_compile_2);
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public CharSequence compile(final Stmnt s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Statement");
    CharSequence _compile = this.compile(s.getDelim());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final DelimitedExpr d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//DelimExpr");
    CharSequence _compile = this.compile(d.getDod());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Do d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Do");
    CharSequence _compile = this.compile(d.getDofs().get(0));
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final DoFront df) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//DoFront");
    CharSequence _compile = this.compile(df.getBlock());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final BlockElems bs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//BlockElems");
    _builder.newLine();
    {
      EList<BlockElem> _block = bs.getBlock();
      for(final BlockElem b : _block) {
        CharSequence _compile = this.compile(b);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final BlockElem b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//BlockElem");
    String _compile = this.compile(b.getSt());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final LocalVarDecl d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//LocalVar ");
    String _compile = this.compile(d.getInit());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String compile(final Expr e) {
    String s = "";
    boolean _matched = false;
    if (e instanceof AddExpr) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      String _compile = this.compile(((AddExpr)e).getLeft());
      _builder.append(_compile);
      _builder.append("+");
      String _compile_1 = this.compile(((AddExpr)e).getRight());
      _builder.append(_compile_1);
      _builder.append(")");
      String _plus = (s + _builder);
      s = _plus;
    }
    if (!_matched) {
      if (e instanceof SubExpr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _compile = this.compile(((SubExpr)e).getLeft());
        _builder.append(_compile);
        _builder.append("-");
        String _compile_1 = this.compile(((SubExpr)e).getRight());
        _builder.append(_compile_1);
        _builder.append(")");
        String _plus = (s + _builder);
        s = _plus;
      }
    }
    if (!_matched) {
      if (e instanceof DivExpr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _compile = this.compile(((DivExpr)e).getLeft());
        _builder.append(_compile);
        _builder.append("/");
        String _compile_1 = this.compile(((DivExpr)e).getRight());
        _builder.append(_compile_1);
        _builder.append(")");
        String _plus = (s + _builder);
        s = _plus;
      }
    }
    if (!_matched) {
      if (e instanceof MultExpr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _compile = this.compile(((MultExpr)e).getLeft());
        _builder.append(_compile);
        _builder.append("*");
        String _compile_1 = this.compile(((MultExpr)e).getRight());
        _builder.append(_compile_1);
        _builder.append(")");
        String _plus = (s + _builder);
        s = _plus;
      }
    }
    if (!_matched) {
      if (e instanceof ExponentExpr) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(Math.pow(");
        String _compile = this.compile(((ExponentExpr)e).getLeft());
        _builder.append(_compile);
        _builder.append(",");
        String _compile_1 = this.compile(((ExponentExpr)e).getRight());
        _builder.append(_compile_1);
        _builder.append("))");
        String _plus = (s + _builder);
        s = _plus;
      }
    }
    if (!_matched) {
      if (e instanceof FCall) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("yolo(");
        String _compile = this.compile(((FCall)e).getRight().getExps());
        _builder.append(_compile);
        _builder.append(")");
        String _plus = (s + _builder);
        s = _plus;
      }
    }
    return s;
  }
  
  public String compile(final ExprList e) {
    String s = "";
    return s;
  }
}
