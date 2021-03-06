package CP6.Command;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;

		for (int i = 0; i < 7; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].excute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].excute();
		undoCommand = offCommands[slot];
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------ Remote Control ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "]"
					+ onCommands[i].getClass().getName() + "   "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuffer.toString();
	}

}
