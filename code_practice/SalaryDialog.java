// Filename SalaryDialog.java
// Written by Mfadhili Gitau
// Written on 28th Feb 2022

import javax.swing.JOptionPane;

public class SalaryDialog
{
	public static void main(String args[])
	{
		String wageString, dependentString;
		double wage, weeklyPay;
		int dependents;
		final double HOURS_IN_WEEK = 37.5;
		
		wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage ", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		
		weeklyPay = Double.parseDouble(wageString)*HOURS_IN_WEEK; // Conversion of string to Double
		
		dependentString = JOptionPane.showInputDialog(null, "How many dependents? ", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
		
		dependents = Integer.parseInt(dependentString); // Conversion of string to Integer
		
		JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
		
	}
}
