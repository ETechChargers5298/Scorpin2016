package org.usfirst.frc.team5298.robot.subsystems;

import org.usfirst.frc.team5298.robot.commands.DrivetrainTankDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Talon frontRight;
	private Talon frontLeft;
	private Talon rearRight;
	private Talon rearLeft;
	private RobotDrive drive;

	public Drivetrain() {
		frontRight = new Talon(0);
		frontLeft = new Talon(1);
		rearRight = new Talon(2);
		rearLeft = new Talon(3);
		drive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
	}

	public void tankDrive(double leftSpeed, double rightSpeed) {
		drive.tankDrive(leftSpeed, rightSpeed);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DrivetrainTankDriveCommand());
    }
}

