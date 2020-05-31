package no.inlea.puzzletask2.runtime.http;


import no.hal.pg.http.AppConfig;
import no.inlea.puzzletask2.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

@Component(
		service= {PuzzleTask2ViewConfig.class, AppConfig.class},
		property= {
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/puzzle-task2",
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/puzzle-task2/*"
		}
		)
public class PuzzleTask2ViewConfig implements AppConfig {
	@Override
	public String getMainLocation() {
		return "/puzzle-task2/PuzzleTaskView.html";
	}

	@Override
	public EClass getEClass() {
		return RuntimePackage.eINSTANCE.getPuzzleTaskView();
	}
}
