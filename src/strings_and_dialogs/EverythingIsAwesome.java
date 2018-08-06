package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String cool = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, cool + " is awesome.");

	}

}
