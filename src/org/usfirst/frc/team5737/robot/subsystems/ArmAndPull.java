package org.usfirst.frc.team5737.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5737.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;

/**
 *
 */
public class ArmAndPull extends Subsystem {
    private VictorSP turnFrontWheel,liftArm;
    
    public ArmAndPull(){
    	turnFrontWheel = new VictorSP(RobotMap.turnFrontWheels);
    	liftArm = new VictorSP(RobotMap.liftArm);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void armUpAndDown(double liftSpeed){
    	liftArm.set(liftSpeed);
    }
    
    public void pull(double pullSpeed){
    	turnFrontWheel.set(pullSpeed);
    }

}
