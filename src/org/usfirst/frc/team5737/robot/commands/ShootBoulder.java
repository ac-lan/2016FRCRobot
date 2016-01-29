package org.usfirst.frc.team5737.robot.commands;

import org.usfirst.frc.team5737.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootBoulder extends Command {

    public ShootBoulder() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.boulderShooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.boulderShooter.boulderShoot(1,1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.boulderShooter.stopShoot();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
