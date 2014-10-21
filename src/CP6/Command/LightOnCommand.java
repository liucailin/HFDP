package CP6.Command;

import CP6.Device.Light;

public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void excute() {
		light.on();

	}

}
