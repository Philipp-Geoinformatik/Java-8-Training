package de.grashorn.java_eight_training.lambda;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

import javax.swing.JButton;

public class SimpleLambdaTests {

	public static void main(String[] args) {
		// Runnable
		Runnable lambdaRunnable = () -> System.out.println("Hallo");;
		lambdaRunnable.run();
		// Comparator
		Comparator<String> lenghtComp = (o1, o2) -> Integer.compare(o1.length(), o2.length());
		lenghtComp.compare("sd", "sdsaf");
		// Sort with length-Comparator
		LinkedList<String> list = new LinkedList<String>(Arrays.asList("666666","1", "22", "333", "4444", "55555"));
		System.out.println(list);
		list.sort(lenghtComp);
		System.out.println(list);
		//ActionListener
		JButton button = new JButton();
		button.addActionListener(e -> System.out.println("sdfdsf"));
	}
}
