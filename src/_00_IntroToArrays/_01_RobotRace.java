package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	Random ran = new Random();
	
	 Robot[] robots = new Robot[5];
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i] = new Robot();
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < robots.length; i++) {
		robots[i].moveTo(200 + i*110, 500);
	}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
	Boolean hasWon = false;
    while(!hasWon) {	
	for (int i = 0; i < robots.length; i++) {
    		int r = ran.nextInt(50);
    		robots[i].move(r);
    		if (robots[i].getY() <= 0) {
				hasWon = true;
				break;
			}
		}
    }
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
}
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}	
}
