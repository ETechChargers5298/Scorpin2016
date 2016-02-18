package org.usfirst.frc.team5298.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 */
public class RobotLifter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Solenoid lifterLeft;
	Solenoid lifterRight;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	
    }
    
    public void manualgearShift(boolean extend) {
    	lifterLeft.set(extend);
		lifterRight.set(extend);
	}
}

