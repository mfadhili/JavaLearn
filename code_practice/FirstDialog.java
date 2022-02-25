// File FirstDialog.Java
// Written by Mfadhili Gitau
// Written on 25th Feb 2022

import javax.swing.JOptionPane;

public class FirstDialog
{
	public static void main(String[] args)
	{
		String eggs = "Eggs are not supposed to be green";
		String title = "My title";
		// default title and icon
		JOptionPane.showMessageDialog(null, "First Java Dialog.");
		
		//custom title , warning icon
		JOptionPane.showMessageDialog(null, eggs,title,JOptionPane.WARNING_MESSAGE);
		
		//Custom title, error icon
		JOptionPane.showMessageDialog(null, eggs, title, JOptionPane.ERROR_MESSAGE);
		
		//Custom title, no icon
		JOptionPane.showMessageDialog(null, eggs,title, JOptionPane.PLAIN_MESSAGE);
	}
}
