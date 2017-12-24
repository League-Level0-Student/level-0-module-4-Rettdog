//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {
static double value = 0;

	public static void main(String[] args) {

		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 
changeCalc("nickel",5);
changeCalc("dime",10);
changeCalc("quater",25);
changeCalc("fifty cent coin",50);
changeCalc("dollar coin",100);
		// Tell the user how much money they have
value = value/100;
DecimalFormat d = new DecimalFormat("$#.00");

JOptionPane.showMessageDialog(null, "You have "+d.format(value)+".");
	}
	public static void changeCalc(String change, int val) {
		String answer = JOptionPane.showInputDialog("How many "+change+"s do you have?");
		value = Integer.parseInt(answer)*val+value;
	}
}

