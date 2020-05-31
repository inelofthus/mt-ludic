package config.actions;

import config.ConfigPackage;
import no.hal.pg.config.actions.AddConfigObjectToolbarAction;

public class AddPuzzleTask3ConfigToolbarAction extends AddConfigObjectToolbarAction {

	public AddPuzzleTask3ConfigToolbarAction() {
		super(ConfigPackage.eINSTANCE.getPuzzleTask3Config(), no.hal.pg.config.ConfigPackage.eINSTANCE.getGameConfig_Tasks());
	}
}
