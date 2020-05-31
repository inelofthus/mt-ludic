package no.inlea.puzzletask3.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.app.View;

import no.hal.pg.app.util.IViewFactory;
import no.inlea.puzzletask3.runtime.PuzzleTask3;
import no.inlea.puzzletask3.runtime.RuntimeFactory;

@Component
public class PuzzleTask3ViewFactory implements IViewFactory {

	@Override
	public View<?> createView(EObject user, EObject eObject) {
		if (eObject instanceof PuzzleTask3) {
			return RuntimeFactory.eINSTANCE.createPuzzleTaskView();
		}
		return null;
	}
}
