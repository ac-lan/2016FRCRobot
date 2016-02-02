package org.usfirst.frc.team5737.robot.commands;

import org.usfirst.frc.team5737.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class ArmUpDown extends Command {

    public ArmUpDown() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.ArmAndPull);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.armUpButton.get()){
    		Robot.ArmAndPull.armUpAndDown(0.85);
    	}
    	else{
    		Robot.ArmAndPull.armUpAndDown(0);
    	}
    	
    	if(Robot.oi.armDownButton.get()){
    		Robot.ArmAndPull.pull(0.85);
    	}
    	else{
    		Robot.ArmAndPull.pull(0);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ArmAndPull.armUpAndDown(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
