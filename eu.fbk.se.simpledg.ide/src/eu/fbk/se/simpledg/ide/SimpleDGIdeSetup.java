/*
 * generated by Xtext 2.31.0
 */
package eu.fbk.se.simpledg.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import eu.fbk.se.simpledg.SimpleDGRuntimeModule;
import eu.fbk.se.simpledg.SimpleDGStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SimpleDGIdeSetup extends SimpleDGStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SimpleDGRuntimeModule(), new SimpleDGIdeModule()));
	}
	
}
