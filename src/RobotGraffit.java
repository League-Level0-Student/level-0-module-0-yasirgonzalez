import org.jointheleague.graphical.robot.Robot;

public class RobotGraffit {
public static void main(String[] args) {
	Robot boom=new Robot();
	boom.setSpeed(200);
	boom.penDown();
	boom.move(200);
	boom.turn(45);
	boom.move(100);
	boom.turn(180);
	boom.move(100);
	boom.setAngle(315);
	boom.move(100);
	boom.penUp();
	boom.move(200);
}
}
