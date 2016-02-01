package org.usfirst.frc.team5737.robot.subsystems;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.usfirst.frc.team5737.robot.Robot;
import org.usfirst.frc.team5737.robot.RobotMap;
import org.usfirst.frc.team5737.robot.commands.ShootBoulder;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;

/**
 
 */
public class BoulderShooter extends Subsystem {
	private VictorSP boulderEaterL,boulderEaterR;
	private DigitalInput optSwitchBall;
	
	public BoulderShooter(){
		 boulderEaterL = new VictorSP(RobotMap.boulderEaterL);
		 boulderEaterR = new VictorSP(RobotMap.boulderEaterR);
		 optSwitchBall = new DigitalInput(RobotMap.optSwitchBall);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ShootBoulder());
    }
    public void boulderShoot(double eaterLSpeed, double eaterRSpeed) {
		   boulderEaterL.set(eaterLSpeed);
    	   boulderEaterR.set(eaterRSpeed);
    } 
    public void stopShoot() {
    	boulderEaterL.set(0);
    	boulderEaterR.set(0);
    }
    
    public boolean getOptSwitchBall(){
    	return optSwitchBall.get();
    }
}

