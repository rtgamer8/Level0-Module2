import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String input =JOptionPane.showInputDialog("How tall are you in inches?");
	
	int inch = Integer.parseInt(input);
	
	if (inch < 48) {
		JOptionPane.showMessageDialog(null, "You need to grow more");
	}
	else{
		JOptionPane.showMessageDialog(null, "You may ride the rollercoaster!");
	}
}
}
