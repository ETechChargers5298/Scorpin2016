
import org.usfirst.frc.team5298.robot.commands.AquireBall;
import org.usfirst.frc.team5298.robot.commands.RobotLifterDown;
import org.usfirst.frc.team5298.robot.commands.RobotLifterExtend;
import org.usfirst.frc.team5298.robot.commands.RobotLifterRetract;
import org.usfirst.frc.team5298.robot.commands.RobotLifterUp;
import org.usfirst.frc.team5298.robot.commands.Shoot;
import org.usfirst.frc.team5298.robot.commands.ShooterAcquire;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team5298.utils.Gamepad;
import org.usfirst.frc.team5298.robot.commands.ExampleCommand;

/*
 * This class is the glue that binds the controls on the physical operator
@@ -45,30 +41,6 @@ */
public class OI {
	
	public OI() {
		driverPad = new Gamepad(0);
		/*the commands below commented out are the analog buttons set for different
		functions*/
		//driverPad.getLeftAnalogueButton().whenpressed(new RobotlifterExtend());
		//driverPad.getRightAnalogueButton().whenpressed(new RobotLifterRetract());
		//driverPad.getLeftAnalogButton().whenPressed(new RobotLifterExtend());
		//driverPad.getRightAnalogButton().whenPressed(new RobotLifterRetract());
		
		/*the command below takes the right bumper button and when pressed turns the 
		*servo in the reverse direction a .set amount of degrees at a certain speed
		*/
		driverPad.getRightBumper().whenPressed(new servoReversedAngle());
		/*the command below takes the left button and when pressed turns the servo
		 * in the forward direction a .set amount of degrees at a certain speed
		 */
		driverPad.getLeftBumper().whenPressed(new servoAngle());
		/*the command below takes the left bumper button and whileheld runs the shooter 
		 * motor in reverse to 'acquire' the ball
		 */
		driverPad.getLeftTrigger().whileHeld(new ShooterAcquire());
		/*the command below takes the right bumper button and whileheld runs the
		 * shooter motor forward to 'shoot' the ball
		 */
		driverPad.getRightTrigger().whileHeld(new Shoot());
		
	}
}