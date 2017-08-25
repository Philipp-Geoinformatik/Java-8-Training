package de.grashorn.java_eight_training.lambda.commandspattern;

import java.util.ArrayList;
import java.util.List;

public class ProcessManager {

	private List<Command> commands = new ArrayList<>();
	
	
	/**
	 * 
	 * @param c
	 */
	public void addCommand(Command c) {

		this.commands.add(c);

	}
	/**
	 * 
	 */
	public void execute() {
		commands.forEach(Command::execute);
	}
}
