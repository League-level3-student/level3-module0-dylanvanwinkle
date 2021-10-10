package _00_IntroToArrays;

import java.util.HashMap;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	static Random ran = new Random();
	static int move = 10;
	static int rNum = 3;
	static Robot[] robots = new Robot[rNum];
	static Thread[] ts = new Thread[rNum];
	static int rn;
	static boolean winner = false;
static HashMap<Robot, Integer> robotsMap = new HashMap<Robot, Integer>();
	public static void main(String[] args) {

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			Robot robot = robots[i];
			robotsMap.put(robot, i + 1);
			ts[i] = new Thread(() -> run(robot));

		}

		for (int i = 0; i < ts.length; i++) {
			ts[i].start();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

	}
	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
	public static void run(Robot x) {

		x.moveTo(330, 500);
		x.setSpeed(5);

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (!winner) {
			int r = ran.nextInt(5) + 1;
			for (int j = 0; j < r; j++) {
				x.move(50);
				x.turn(move);
				try {
					Thread.sleep(r * 100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (x.getY() == 500 && x.getX() == 330 && !winner) {
					winner = true;
					JOptionPane.showMessageDialog(null, "Robot " + robotsMap.get(x) + " won!!! Lets throw a party!");
					
					break;
				}
			}
		}
	}

}
