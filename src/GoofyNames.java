

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = ""; 
		// 1. Ask the user to enter their name
		String i = JOptionPane.showInputDialog("what is your name in lower case");
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.
		System.out.println(i.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.
		for (int s = 0; s < i.length(); s++) {

			// 4. Create a String variable to store the next character of the name
			// using .substring(start, end)
			// HINT: replace 'start' and 'end' to get String with character at s
			String sam = i.substring(s, 1 + s);
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			// and lower case for ODD characters.
			if (s % 2 == 0) {
				sam = sam.toUpperCase();
			} else {
				sam = sam.toLowerCase();
			}
			// 6. ADD this String (containing 1 char) to the goofyName String
		goofyName = goofyName + sam;
		
		}
		// 7. Use pop-up to show user their Goofy name
		JOptionPane.showMessageDialog(null, "your goofy name is "+goofyName);
	}
}