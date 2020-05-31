package config.actions;

import config.ConfigPackage;
import no.hal.pg.config.actions.AddConfigObjectToolbarAction;

public class AddPuzzleTask2ConfigToolbarAction extends AddConfigObjectToolbarAction {

	public AddPuzzleTask2ConfigToolbarAction() {
		super(ConfigPackage.eINSTANCE.getPuzzleTask2Config(), no.hal.pg.config.ConfigPackage.eINSTANCE.getGameConfig_Tasks());
	}
}
