import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot superobot=new Robot();
		superobot.penDown();
		for (int i = 0; i < 4; i++) {
			superobot.move(100);
			superobot.turn(90);
		}  
		superobot.penUp();
		
	}
}
