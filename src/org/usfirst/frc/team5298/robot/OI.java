package org.usfirst.frc.team5298.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team5298.utils.Gamepad;
import org.usfirst.frc.team5298.robot.commands.ExampleCommand;

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
	
	public static Gamepad driverPad;
	
	public OI() {
		driverPad = new Gamepad(0);
		
		driverGamepad.getStartButton().whenPressed(new EnableAutoGearShiftCommand());
        driverGamepad.getSelectButton().whenPressed(new DisableAutoGearShiftCommand());
        driverGamepad.getLeftTrigger().whileHeld(new JionDriveCommand());
        driverGamepad.getLeftTrigger().whenReleased(new HighGearCommand());
        driverGamepad.getRightBumper().whenPressed(new FlashlightToggleCommand());
        driverGamepad.getLeftBumper().whenPressed(new FlashlightToggleCommand());
        driverGamepad.getLeftTrigger().whileHeld(new HopperRunCommand(true));
        driverGamepad.getLeftBumper().whileHeld(new HopperRunCommand(false));
        driverGamepad.getRightTrigger().whileHeld(new AcquirerAcquireCommand());
        driverGamepad.getRightBumper().whileHeld(new AcquirerDeacquireCommand());
        driverGamepad.getDPadUp().whenPressed(new ShooterSetHighCommand());
        driverGamepad.getDPadLeft().whenPressed(new ShooterSetLayupCommand());
        driverGamepad.getDPadRight().whenPressed(new ShooterSetMaxSpeed());
        driverGamepad.getDPadDown().whenPressed(new ShooterStopCommand());
        driverGamepad.getTopButton().whenPressed(new HoodUpCommand());
        driverGamepad.getRightButton().whenPressed(new HoodDownCommand());
        driverGamepad.getRightAnalogButton().whenPressed(new DropDownMoveToAngleCommand(40));

	
	}
}

