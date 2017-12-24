import java.util.Scanner;

import javax.swing.JOptionPane;

public class OwnAdventure {

public static void main(String[] args) {
	System.out.println("You are looking at a bridge. There is a troll under the bridge. ");
	System.out.println("There is also a boat to cross the river. Do you want to talk or row.");
	Scanner kb = new Scanner(System.in);
	String word = kb.nextLine();
	if(word.equals("talk")) {
		System.out.println("You talk to the troll and he says,");
		System.out.println("\"You may cross this bridge if you answer my riddle.");
		System.out.println("What is the creature that walks on four legs in the morning, two legs at noon and three in the evening?\"");
		System.out.println("What is the answer?");
		word = kb.nextLine();
		if (word.equals("man")) {
			System.out.println("The troll says, \"You have answered correctly. You may pass\"");
			System.out.println("As you walk across the bridge, you see a yellow brick road and a blue brick road.");
			System.out.println("blue or yellow?");
			word = kb.nextLine();
			if(word.equals("yellow")) {
				System.out.println("On the yellow brick road, the Wicked Witch of the Wild West shows up.");
				System.out.println("What do you tell her");
				word = kb.nextLine();
				System.out.println("She curses you because you were mean to her.");
				System.err.println("Game Over");
			}else if(word.equals("blue")) {
				System.out.println("At the end of the road you see Master Yoda and he teaches you how to use the force.");
				System.out.println("You Win!");
			}
		}else {
			System.out.println("That is not the right answer. The troll throws you into the river and you drown. ");
			System.err.println("Game Over");
		}
	}else if(word.equals("row")) {
		System.out.println("You walk down to the river bank.");
		System.out.println("You untie the rope and get in.");
		System.out.println("As you get to the middle of the river, the river pulls you down the river bank and when you get on the other side,");
		System.out.println("there are two roads. red or blue");
		word = kb.nextLine();
		if(word.equals("red")) {
			System.out.println("When you get to the end of the road,");
			System.out.println("Mitchell Oeth spoils the new Star Wars movie even though he hasn't seen it. ");
			
			System.err.println("Game Over");
		}else if(word.equals("blue")) {
			System.out.println("At the end of the road you see Master Yoda and he teaches you how to use the force.");
			System.out.println("You Win!");
		}
	}else {
		System.out.println("I don't know that word.");
	}
	JOptionPane.showMessageDialog(null, "If you are at this screen,\nthe game has finished or you answered an answer that wasn't a choice.");
}
}
