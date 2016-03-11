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
		shooterMotor = new Talon(6);
		 
		 
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		
	}
	
	//public void setAim() {
	//	shooterMotor.set(1.0);
	//}
	
	//public void reverseShooter() {
	//	shooterMotor.set(-0.75);
	//}
	public void shooterUp() {
		aimMotor.set(0.75);
	   
	}

	public void shooterDown() {
		aimMotor.set(-0.75);
        
	}
	
	public void acquire() {
		shooterMotor.set(-0.25);
		
	}
	
	public void shoot() {
		shooterMotor.set(1.0);
		
	}

}
