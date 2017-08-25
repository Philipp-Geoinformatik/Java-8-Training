package de.grashorn.java_eight_training.lambda.commandspattern;

public class WriterProcess implements Process {

	Thread wirterThread;

	public WriterProcess() {
	}

	private void write() {
	}

	@Override
	public void suspend() {
		System.out.println("Suspend");
	}

	@Override
	public void kill() {
		System.out.println("Kill");
	}

}
