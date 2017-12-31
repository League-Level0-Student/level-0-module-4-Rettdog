

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		
			
		
String number = JOptionPane.showInputDialog("Give me a number");
int num = Integer.parseInt(number);
number = JOptionPane.showInputDialog("Give me a number");
int num2 = Integer.parseInt(number);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Calculator", "Operations", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { " / ", " * ", " - ", " + " },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation == 0) {
	div(num, num2);
} else if (operation == 1) {
	mul(num, num2);
}else if (operation == 2) {
	sub(num, num2);
}else if (operation == 3) {
	add(num, num2);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int a , int b) {
	int ab = a + b;
	JOptionPane.showMessageDialog(null, a +" + "+b+" = "+ ab);
}
static void sub(int a , int b) {
	int ab = a - b;
	JOptionPane.showMessageDialog(null, a +" - "+b+" = "+ ab);
}
static void mul(int a , int b) {
	int ab = a * b;
	JOptionPane.showMessageDialog(null, a +" * "+b+" = "+ ab);
}
static void div(int a , int b) {
	int ab = a / b;
	JOptionPane.showMessageDialog(null, a +" / "+b+" = "+ ab);
}
	// 4. Create similar methods for subtraction, multiplication and division.
}