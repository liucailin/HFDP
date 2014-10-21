package CP6.Command;

public class MacroCommand implements Command {

	Command commands[];

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void excute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].excute();
		}

	}

	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}

	}

}
