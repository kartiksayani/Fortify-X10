/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.example.domainmodel.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.example.domainmodel.ui.internal.DomainmodelActivator;

public class DomainModelUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DomainmodelActivator.getInstance().getInjector("org.example.domainmodel.DomainModel");
	}

}
