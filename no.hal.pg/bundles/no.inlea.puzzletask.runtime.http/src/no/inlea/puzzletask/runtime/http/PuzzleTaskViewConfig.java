package no.inlea.puzzletask.runtime.http;

import no.hal.pg.http.AppConfig;
import no.inlea.puzzletask.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

@Component(
		service= {PuzzleTaskViewConfig.class, AppConfig.class},
		property= {
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/puzzle-task",
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/puzzle-task/*"
		}
		)
public class PuzzleTaskViewConfig implements AppConfig {
	@Override
	public String getMainLocation() {
		return "/puzzle-task/PuzzleTaskView.html";
	}

	@Override
	public EClass getEClass() {
		return RuntimePackage.eINSTANCE.getPuzzleTaskView();
	}
}
