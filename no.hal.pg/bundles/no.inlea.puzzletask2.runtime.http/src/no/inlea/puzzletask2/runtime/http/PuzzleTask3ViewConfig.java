package no.inlea.puzzletask2.runtime.http;


import no.hal.pg.http.AppConfig;
import no.inlea.puzzletask3.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

@Component(
		service= {PuzzleTask3ViewConfig.class, AppConfig.class},
		property= {
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/puzzle-task3",
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/puzzle-task3/*"
		}
		)
public class PuzzleTask3ViewConfig implements AppConfig {
	@Override
	public String getMainLocation() {
		return "/puzzle-task3/PuzzleTaskView.html";
	}

	@Override
	public EClass getEClass() {
		return RuntimePackage.eINSTANCE.getPuzzleTaskView();
	}
}
