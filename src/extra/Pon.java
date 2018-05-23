package extra;

import javax.swing.JOptionPane;

public class Pon {
public static void main(String[] args) {
	String madre = JOptionPane.showInputDialog("what is your number");
	int cx = Integer.parseInt(madre);
	for (int i = 2; i < cx-1; i++) {
		if(cx % i == 0) {
			JOptionPane.showMessageDialog(null, "your number is compsite");
		System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "your number is prime");
}
}