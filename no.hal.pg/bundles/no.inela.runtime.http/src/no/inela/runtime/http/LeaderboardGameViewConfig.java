package no.inela.runtime.http;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import no.hal.pg.http.AppConfig;
import no.inela.ineruntime.IneruntimePackage;

@Component(
		service= {LeaderboardGameViewConfig.class, AppConfig.class},
		property= {
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/lead-game",
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/lead-game/*"
		}
		)

public class LeaderboardGameViewConfig implements AppConfig {
	
	@Override
	public String getMainLocation() {
		return "/lead-game/LeaderboardGameView.html";
	}
	
	@Override
	public EClass getEClass() {
		return IneruntimePackage.eINSTANCE.getLeaderboardGameView();
	}
	
}
