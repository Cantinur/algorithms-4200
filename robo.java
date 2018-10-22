package sanhen17;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Siri - a robot by (your name here)
 */
public class Siri extends Robot{

	/**
	 * run: Siri's default behavior
	 */
	public void run() {
		while(true) {
            move(getRandomNumber());
            turnRadar(getRandomNumber());
            turn(getRandomNumber());
            turnGun(getRandomNumber());
		}
    }

    private void move(double random){
        if (random > 50.0){
            ahead(getRandomNumber());
        } else {
            back(getRandomNumber());
        }
    }

    private void turnRadar(double random){
        if (random > 50.0){
            turnGunRight(getRandomNumber());
        } else {
            turnGunLeft(getRandomNumber());
        }
    }

    private void turn(double random){
        if (random > 50.0){
            turnLeft(getRandomNumber());
        }else{
            turnRight(getRandomNumber());
        }
    }

    private void turnGun(double randum){
        if (random > 50.0){
            turnGunRight(getRandomNumber());
        }else {
            turnGunLeft(getRandomNumber());
        }
    }

    public static double getRandomNumber(){
        double x = Math.random() *100;
        return x;
    }

    // public void onBulletMissed(BulletMissedEvent event){
    //     flee();
    // }

	public void onScannedRobot(ScannedRobotEvent e) {
        fire(e.getDistance());
	}
	
	// public void onHitWall(HitWallEvent e) {
    //     flee();
    // }
}
