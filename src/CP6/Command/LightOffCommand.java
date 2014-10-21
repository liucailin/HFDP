package CP6.Command;

import CP6.Device.Light;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void excute() {
		light.off();

	}

	@Override
	public void undo() {
		light.on();

	}
}
