package org.usfirst.frc.team5298.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RobotLifter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Solenoid lifterSolenoid;
	Talon liftMotor;

	public RobotLifter() {
		lifterSolenoid = new Solenoid(0);
		liftMotor = new Talon(8);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	
    }
    
    public void extend() {
    	lifterSolenoid.set(true);
	}
    public void retract() {
    	lifterSolenoid.set(false);
    }
}

