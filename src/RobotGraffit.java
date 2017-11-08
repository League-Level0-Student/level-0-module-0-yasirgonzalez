import org.jointheleague.graphical.robot.Robot;

public class RobotGraffit {
public static void main(String[] args) {
	Robot boom=new Robot();
	boom.penDown();
	boom.move(200);
	boom.turn(120);
	boom.move(50);
	boom.turn(180);
	boom.move(50);
	boom.turn(220);
}
}
