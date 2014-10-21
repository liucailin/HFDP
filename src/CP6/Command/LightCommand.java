package CP6.Command;

import CP6.Device.Light;

public class LightCommand implements Command {

	Light light;

	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void excute() {
		light.on();

	}

}
