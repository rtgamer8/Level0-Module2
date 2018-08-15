import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String input =JOptionPane.showInputDialog("How old are you in years?");
	
	int age = Integer.parseInt(input);
	
	if (age > 18) {
		JOptionPane.showInputDialog("who do you think will be president");
		JOptionPane.showMessageDialog(null, "nice choice");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
	
	
	
}
}
