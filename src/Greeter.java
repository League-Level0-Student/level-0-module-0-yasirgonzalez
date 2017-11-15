import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null,"Please enter your name to continue");
	
	String superobot=JOptionPane.showInputDialog("what is your name"); 
	System.out.println(superobot);
JOptionPane.showMessageDialog(null,"Hello"+superobot);
}
}
