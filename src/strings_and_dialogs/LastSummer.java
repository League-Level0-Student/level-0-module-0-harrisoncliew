package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your name?");
		String cool = JOptionPane.showInputDialog("What did you do in the summer? (past tense)");
		JOptionPane.showMessageDialog(null, "I know that you " + cool + " last summer, " + answer + ". Muhahaha!");

	}

}
