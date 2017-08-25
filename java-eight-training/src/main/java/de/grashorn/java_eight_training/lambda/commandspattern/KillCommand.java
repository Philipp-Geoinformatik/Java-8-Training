package de.grashorn.java_eight_training.lambda.commandspattern;

public class KillCommand implements Command{
	private Process process;
	
	
	public KillCommand(Process process) {
		this.process = process;
	}

	@Override
	public void execute() {
		this.process.kill();
	}
}
