package org.usfirst.frc.team5737.robot.subsystems;

import org.usfirst.frc.team5737.robot.Robot;
import org.usfirst.frc.team5737.robot.RobotMap;
import org.usfirst.frc.team5737.robot.commands.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveWithJoystick extends Subsystem {
	 private RobotDrive driveTrain;
	 private VictorSP MotorLF,MotorLB,MotorRF,MotorRB;
	 
	 
	 public DriveWithJoystick() {
		 MotorLF = new VictorSP(RobotMap.MotorLF);
		 MotorLB = new VictorSP(RobotMap.MotorLB);
		 MotorRF = new VictorSP(RobotMap.MotorRF);
		 MotorRB = new VictorSP(RobotMap.MotorRB);
		 
		 MotorLF.setInverted(true);
		 MotorLB.setInverted(true);
		 MotorRF.setInverted(true);
		 MotorRB.setInverted(true);
		 driveTrain = new RobotDrive(MotorLB,MotorLF,MotorRB,MotorRF);
		 driveTrain.setSafetyEnabled(true);
	}
	 
    
	 public void ArcadeDrive(Joystick driveStick,int axisForward,int axisRotate){
		 driveTrain.arcadeDrive(driveStick,axisForward, driveStick, axisRotate,true);
	 }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new DriveTrain());
    }
    
    /*public void tankDrive() {
    	driveTrain.arcadeDrive(Robot.oi.getJoystick());
    }*/
    
    public void stop() {
		driveTrain.tankDrive(0, 0);
	}
	
}


