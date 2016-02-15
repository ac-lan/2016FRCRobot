package org.usfirst.frc.team5737.robot;

import java.awt.color.ICC_ColorSpace;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
	public static int MotorLF = 2;
    public static int MotorLB = 3;
    public static int MotorRF = 0;
    public static int MotorRB = 1;
    public static int boulderEaterL = 4;
    public static int boulderEaterR = 6;
    public static int moveShooter = 5;
    public static int turnFrontWheels = 7;
    public static int liftArm = 8;
    public static int pushBoulder = 9;
    public static int optSwitchBall = 1;
    public static int limitSwitchUp = 2;
    public static int limitSwitchDown = 3;
    
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
