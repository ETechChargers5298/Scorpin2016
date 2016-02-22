package org.usfirst.frc.team5298.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;




/**
 *
 */

public class AquireBall extends Subsystem {
	
	private Talon Aquire;
	
	public AquireBall() {
		
		Aquire = new Talon();
		
	}
	
	public void Aquire() {
		

	}
	
	public void stop() {
		
		
	}
	
	
	
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

