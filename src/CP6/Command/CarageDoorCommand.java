package CP6.Command;

import CP6.Device.CarageDoor;

public class CarageDoorCommand implements Command {

	CarageDoor carageDoor;

	public CarageDoorCommand(CarageDoor carageDoor) {
		this.carageDoor = carageDoor;
	}

	@Override
	public void excute() {
		carageDoor.up();
		carageDoor.lightOn();
	}

	@Override
	public void undo() {

	}

}
