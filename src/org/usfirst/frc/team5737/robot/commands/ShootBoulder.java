package org.usfirst.frc.team5737.robot.commands;

import org.usfirst.frc.team5737.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootBoulder extends Command {
	
	boolean switchInstalled = false;

    public ShootBoulder() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.boulderShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//eatBoulder
    	if (switchInstalled == true){
	    	if(Robot.oi.eatBoulderButton.get()){
	    		if(Robot.boulderShooter.getOptSwitchBall()){
	    			Robot.boulderShooter.stopShoot();
	    		}
	    		else{
	    			Robot.boulderShooter.boulderShoot(-1, -1);
	    		}
	    	}
	    	else{
	    		Robot.boulderShooter.stopShoot();
	    	}
    	}
    	else if (switchInstalled == false){
    		if(Robot.oi.eatBoulderButton.get()){
    			Robot.boulderShooter.boulderShoot(-1, -1);
    		}
    		else{
    			Robot.boulderShooter.stopShoot();
    		}
    	}
    	
    	//shootBoulder
    	if(Robot.oi.shootBoulderButton.get()){
    		Robot.boulderShooter.boulderShoot(1, 1);
    	}
    	else{
    		Robot.boulderShooter.stopShoot();
    	}
    	
    	/*pushBoulder
    	if(Robot.oi.shootBoulderButton.get()){
    		Robot.boulderShooter.boulderPush(0.75);
    	}
    	else{
    		Robot.boulderShooter.stopPush();
    	}
    	*/
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.boulderShooter.stopShoot();
    	Robot.boulderShooter.stopPush();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
