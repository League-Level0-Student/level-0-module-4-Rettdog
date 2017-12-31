//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
static int petHappiness = 0;
static String pet = "";
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
pet = JOptionPane.showInputDialog("What animal do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	for(int i = 0;i<5;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Pet Game", "Options", 0, JOptionPane.INFORMATION_MESSAGE, null,new String[] { "Cuddle", "Feed", "Water", "Take a Walk", "Groomm","Clean Up Poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	cuddle();
}else if(task==1) {
	feed();
}else if(task==2) {
	water();
}else if(task==3) {
	walk();
}else if(task==4) {
	groom();
}else if(task==5) {
	poo();
}
	
			// 6. If you determine the happiness level is large enough, tell the
	if(petHappiness>20) {		//    user that he loves his pet and use break; to exit for loop.
break;
	}
	}
	JOptionPane.showMessageDialog(null, "Your pet is happy!!!!! You win!!!!!!");
	}


	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle() {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Purr");
			petHappiness = petHappiness + 3;
		}else if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Bark");
			petHappiness = petHappiness + 1;
		}else if(pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "Tweet");
			petHappiness = petHappiness + 1;
		}else {
			JOptionPane.showMessageDialog(null, "I like that");
			petHappiness = petHappiness + 1;
		}
	}
	static void feed() {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Purr");
			petHappiness = petHappiness + 1;
		}else if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Bark");
			petHappiness = petHappiness + 1;
		}else if(pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "Tweet");
			petHappiness = petHappiness + 2;
		}else {
			JOptionPane.showMessageDialog(null, "I like that");
			petHappiness = petHappiness + 2;
		}
	}
	static void water() {
		if(pet.equals("frog")) {
			JOptionPane.showMessageDialog(null, "Croak");
			petHappiness = petHappiness + 3;
		}else if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Bark");
			petHappiness = petHappiness + 1;
		}else if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Purr");
			petHappiness = petHappiness + 1;
		}else {
			JOptionPane.showMessageDialog(null, "I like that");
			petHappiness = petHappiness + 1;
		}
	}
	static void walk() {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Purr");
			petHappiness = petHappiness + 2;
		}else if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Bark");
			petHappiness = petHappiness + 3;
		}else if(pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "I don't walk");
			petHappiness = petHappiness + 0;
		}else {
			JOptionPane.showMessageDialog(null, "I like that");
			petHappiness = petHappiness + 1;
		}
	}
	static void groom() {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Purr");
			petHappiness = petHappiness + 2;
		}else if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Bark");
			petHappiness = petHappiness + 1;
		}else if(pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "Tweet!");
			petHappiness = petHappiness + 4;
		}else {
			JOptionPane.showMessageDialog(null, "I like that");
			petHappiness = petHappiness + 2;
		}
	}
	static void poo() {
		if(pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Purr");
			petHappiness = petHappiness + 1;
		}else if(pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Bark");
			petHappiness = petHappiness + 1;
		}else if(pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "Tweet");
			petHappiness = petHappiness + 1;
		}else {
			JOptionPane.showMessageDialog(null, "I like that");
			petHappiness = petHappiness + 3;
		}
	}
	
}