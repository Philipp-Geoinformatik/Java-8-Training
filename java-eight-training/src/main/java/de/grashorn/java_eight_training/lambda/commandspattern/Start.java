package de.grashorn.java_eight_training.lambda.commandspattern;

public class Start {

	
	
	public static void main(String[] args) {
		Process p= new WriterProcess();
		
		ProcessManager manager = new ProcessManager();
		manager.addCommand(p::suspend);
		manager.addCommand(p::kill);
		manager.execute();
	}
	
}
