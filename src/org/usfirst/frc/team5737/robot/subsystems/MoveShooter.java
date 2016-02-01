package org.usfirst.frc.team5737.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.usfirst.frc.team5737.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
/**
 *
 */
public class MoveShooter extends Subsystem {
	private VictorSP moveShooter;
	private DigitalInput limitSwitchUp,limitSwitchDown;
	
	
	public MoveShooter(){
		moveShooter = new VictorSP(RobotMap.moveShooter);
		limitSwitchUp = new DigitalInput(RobotMap.limitSwitchUp);
		limitSwitchDown = new DigitalInput(RobotMap.limitSwitchDown);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveShooterUp(double moveShooterUpSpeed){
    	moveShooter.set(moveShooterUpSpeed);
    }
    	
    public void moveShooterDown(double moveShooterDownSpeed){
		moveShooter.set(moveShooterDownSpeed);
		}
    
    public void moveShooterStop(){
    	moveShooter.set(0);
    }
    
    public boolean getLimitSwitchUp(){
    	return limitSwitchUp.get();
    }
    
    public boolean getLimitSwitchDown(){
    	return limitSwitchDown.get();
    }
 }


