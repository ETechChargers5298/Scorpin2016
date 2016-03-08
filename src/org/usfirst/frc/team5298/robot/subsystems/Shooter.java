package org.usfirst.frc.team5298.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	
	Talon shooterMotor;
	Talon aimMotor;
	

	public Shooter() {
		shooterMotor = new Talon(5);
		 aimMotor = new Talon(6);
		 
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		
	}
	public void setAim() {
	   
	}

	public void hopper() {
        
	}

}
