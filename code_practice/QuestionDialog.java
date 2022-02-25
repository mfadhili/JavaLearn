// File QuestionDialog.Java
// Written by Mfadhili Gitau
// Written on 25th Feb 2022

import javax.swing.JOptionPane;

public class QuestionDialog
{
	public static void main(String[] args)
	{
		// Custom button text
		Object[] options = { "Yes, please", "No, thanks", "No eggs, no ham"};
		String question = "Would you like some eggs to go";
		String question2 = " with that ham";
		String title = "Breakfast menu"; 
		
		int n = JOptionPane.showOptionDialog(null,question + question2, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		
	}
}
