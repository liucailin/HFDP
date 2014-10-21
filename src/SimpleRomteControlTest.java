import CP6.Command.CarageDoorCommand;
import CP6.Command.Command;
import CP6.Command.LightCommand;
import CP6.Command.SimpleRemoteControl;
import CP6.Device.CarageDoor;
import CP6.Device.Light;

public class SimpleRomteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl control = new SimpleRemoteControl();
		Command lightCommand = new LightCommand(new Light());
		control.setCommand(lightCommand);
		control.buttonPress();

		Command carageDoorCommand = new CarageDoorCommand(new CarageDoor());
		control.setCommand(carageDoorCommand);
		control.buttonPress();
	}

}
