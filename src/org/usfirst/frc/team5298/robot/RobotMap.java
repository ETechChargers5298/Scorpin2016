package org.usfirst.frc.team5298.robot;
public interface RobotMap {
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
	
	public static int FrontLeftMotor = 1;
    public static int FrontRightMotor = 2;
    public static int RearLeftMotor = 3;
    public static int RearRightMotor = 4;
    public static int liftMotorUp = 5;
    public static int liftMotorDown = 6;
    public static int Servo = 7;
    public static int Shooter = 8;
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
// Aquire ports
	
	int TALON_AQUIRE = 8;
	}
}