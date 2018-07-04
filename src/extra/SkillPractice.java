package extra;
import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("how many dimes do you have?");
		// Tell them how many cents they have (hint multiply by 10)
		int x = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "you have " + (x * 10) + " cents");
		// Ask the user how tall they are (inches)
		String inch = JOptionPane.showInputDialog("how tall are you?");
		int z = Integer.parseInt(inch);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (z < 36) {
			JOptionPane.showMessageDialog(null, "eat your wheaties *crazy farmers eye twitches*");
		}
	}

	void skill2() {
		// Write a loop to print every third number between 1 and 30 to the console
		for (int i = 3; i < 31; i+=3) {
			System.out.println(i);
		}
	}

	void skill3() {
		// Get a random number that is less than 20 and print it to the console
		int randomChoice = 0;
		Random rand = new Random();
		randomChoice = rand.nextInt(20);
		System.out.println(randomChoice);
		// Get another random number that is less than 10 and print it to the console
		int random = 0;
		Random r = new Random();
		random = r.nextInt(10);
		System.out.println(random);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, "skill 3 difference is " + (randomChoice - random));
	}

	void skill4() {
		// In a pop-up, ask the user for the city they live in
		String home = JOptionPane.showInputDialog("what city do you live in");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (home.equalsIgnoreCase("san diego")) {
			JOptionPane.showMessageDialog(null, "you live in America's Finest City");
		} else {
			// Otherwise, tell them to move to San Diego
			JOptionPane.showMessageDialog(null, "you need to move to San Diego");
		}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		String s = JOptionPane.showInputDialog("how many cars u have?");
		int cars = Integer.parseInt(s);
		if (cars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car
		if (cars == 1) {
			JOptionPane.showInputDialog("what make is your car");
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
		if (cars > 1) {
			JOptionPane.showInputDialog("your cars have " + (cars * 4) + "wheels");
		}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String a = JOptionPane.showInputDialog("what is the name of your school?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, "you are at " + a);
	}
}