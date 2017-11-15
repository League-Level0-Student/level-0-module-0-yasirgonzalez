import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
String name=
	JOptionPane.showInputDialog("what is your name");
String age=
JOptionPane.showInputDialog("what is your age");
String hobbie=
JOptionPane.showInputDialog("what is your hobbie");
JOptionPane.showMessageDialog(null, "hello"+name+"you are"+age+"years old, and you like"+hobbie);
}
}
