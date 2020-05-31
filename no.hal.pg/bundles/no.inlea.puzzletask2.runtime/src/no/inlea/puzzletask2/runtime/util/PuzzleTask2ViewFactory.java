package no.inlea.puzzletask2.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.app.View;

import no.hal.pg.app.util.IViewFactory;
import no.inlea.puzzletask2.runtime.PuzzleTask2;
import no.inlea.puzzletask2.runtime.RuntimeFactory;

@Component
public class PuzzleTask2ViewFactory implements IViewFactory {

	@Override
	public View<?> createView(EObject user, EObject eObject) {
		if (eObject instanceof PuzzleTask2) {
			return RuntimeFactory.eINSTANCE.createPuzzleTaskView();
		}
		return null;
	}
}
