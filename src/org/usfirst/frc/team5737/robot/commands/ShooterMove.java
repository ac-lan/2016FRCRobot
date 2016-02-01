package org.usfirst.frc.team5737.robot.commands;

import org.usfirst.frc.team5737.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterMove extends Command {

    public ShooterMove() {
        // Use requires() here to declare subsystem dependencies
       requires(Robot.MoveShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//shooterUp
    	if(Robot.oi.moveShooterUpButton.get() == true && Robot.oi.moveShooterDownButton.get() == false){
    		if(Robot.MoveShooter.getLimitSwitchUp() == true){
    			Robot.MoveShooter.moveShooterStop();
    		}
    		else{
    			Robot.MoveShooter.moveShooterUp(0.3);
    		}
    	}
    	else{
    		Robot.MoveShooter.moveShooterStop();
    	}
     
        //shooterDown
        if(Robot.oi.moveShooterDownButton.get() == true && Robot.oi.moveShooterUpButton.get() == false){
        	if(Robot.MoveShooter.getLimitSwitchDown() == true){
        		Robot.MoveShooter.moveShooterStop();
        	}
        	else{
        		Robot.MoveShooter.moveShooterDown(0.3);
        	}
        }
        else {
        	Robot.MoveShooter.moveShooterStop();
			}
        }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.MoveShooter.moveShooterStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
