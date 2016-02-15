package org.usfirst.frc.team5737.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import javax.swing.JOptionPane;

import org.usfirst.frc.team5737.robot.commands.ExampleCommand;
import org.usfirst.frc.team5737.robot.commands.ShootBoulder;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    public Joystick driveStick = new Joystick(0);
    public JoystickButton shootBoulderButton = new JoystickButton(driveStick, 1);
    public JoystickButton eatBoulderButton = new JoystickButton(driveStick, 2);
    public JoystickButton moveShooterUpButton = new JoystickButton(driveStick, 3);
    public JoystickButton moveShooterDownButton = new JoystickButton(driveStick, 4);
    public JoystickButton armUpButton = new JoystickButton(driveStick, 5);
    public JoystickButton armDownButton = new JoystickButton(driveStick, 6);
    public JoystickButton frontBoulderOutButton = new JoystickButton(driveStick, 8);
    public JoystickButton frontBoulderInButton = new JoystickButton(driveStick, 10);
    
    public OI() {
  
    }
    
    public Joystick getJoystick() {
    	return driveStick;
    }
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public Joystick getJoystick(){
    	return driveStick;
    }
     
    public int getDrivePOV(int POV){
    	return driveStick.getPOV(POV);
    }
    
    public boolean getButtonState(){
    	return shootBoulderButton.get();
    }
    
    public double getJoystickLeftRightAngle(){
    	return driveStick.getAxis(AxisType.kX);
    }
    
    public double getJoystickForwardAngle(){
    	return driveStick.getAxis(AxisType.kY);
    }
   
    public double getJoystickThrottle(){
    	return -driveStick.getAxis(AxisType.kThrottle);
    }
    
    public double getMappedJoystickThrottle(){    	
    	double Throttle;
    	Throttle = (getJoystickThrottle()+1)/2;
    	return Throttle;
    }
 }