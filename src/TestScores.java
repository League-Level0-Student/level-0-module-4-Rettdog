import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String scor = JOptionPane.showInputDialog("What did you get on your test?");
int score = Integer.parseInt(scor);

if(score <60) {
	JOptionPane.showMessageDialog(null, "You got an F");
}else if(score <63) {
	JOptionPane.showMessageDialog(null, "You got an D-");
}else if(score <66) {
	JOptionPane.showMessageDialog(null, "You got an D");
}else if(score <70) {
	JOptionPane.showMessageDialog(null, "You got an D+");
}else if(score <73) {
	JOptionPane.showMessageDialog(null, "You got an C-");
}else if(score <76) {
	JOptionPane.showMessageDialog(null, "You got an C");
}else if(score <80) {
	JOptionPane.showMessageDialog(null, "You got an C+");
}else if(score <83) {
	JOptionPane.showMessageDialog(null, "You got an B-");
}else if(score <86) {
	JOptionPane.showMessageDialog(null, "You got an B");
}else if(score <90) {
	JOptionPane.showMessageDialog(null, "You got an B+");
}else if(score <93) {
	JOptionPane.showMessageDialog(null, "You got an A-");
}else if(score <96) {
	JOptionPane.showMessageDialog(null, "You got an A");
}else if(score <100) {
	JOptionPane.showMessageDialog(null, "You got an A+");
}else if(score >=100) {
	JOptionPane.showMessageDialog(null, "You got an A++");
}else {
	JOptionPane.showMessageDialog(null, "That isn't a score");
}
}
}
