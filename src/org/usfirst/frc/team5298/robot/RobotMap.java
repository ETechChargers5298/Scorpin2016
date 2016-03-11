package org.usfirst.frc.team5298.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public interface RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
	
    public static int FrontLeftMotor = 1;
    public static int FrontRightMotor = 2;
    public static int RearLeftMotor = 3;
    public static int RearRightMotor = 4;
    
    
    public static int liftMotor = 5;
    public static int shooterMotor = 6;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
// Aquire ports
	
	int TALON_AQUIRE = 8;
	
	
	

}
