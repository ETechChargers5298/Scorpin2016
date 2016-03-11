package org.usfirst.frc.team5298.robot.commands;

import org.usfirst.frc.team5298.robot.OI;
import org.usfirst.frc.team5298.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DrivetrainTankDriveCommand extends Command {

    public DrivetrainTankDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected  void execute() {
    	//double  leftSpeed = Robot.oi.driverPad.getLeftY();
    	//double rightSpeed = Robot.oi.driverPad.getRightY();
    	double  leftSpeed = OI.driverPad.getLeftY();
    	double rightSpeed = OI.driverPad.getRightY();
    	Robot.drivetrain.tankDrive(-leftSpeed, -rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
