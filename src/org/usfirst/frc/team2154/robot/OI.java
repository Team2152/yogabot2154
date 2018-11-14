package org.usfirst.frc.team2154.robot;



import org.usfirst.frc.team2154.robot.commands.LauncherUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

		public final static int POV_0 = 0;
		public final static int POV_90 = 90;
		public final static int POV_180 = 180;
		public final static int POV_270 = 270;

		// ===Joystick IDs
		public final static int OPERATOR_JOYSTICK = 1;
		public final static int DRIVER_JOYSTICK = 0;

		// === Axis ids; they are the same for each joystick
		public final static int LEFT_STICK_X = 0;
		public final static int LEFT_STICK_Y = 1;
		public final static int RIGHT_STICK_X = 2;
		public final static int RIGHT_STICK_Y = 3;
		public final static int DPAD_X = 5;
		public final static int DPAD_Y = 6;//????????
		public final static int LEFT_TRIGGER = 2;
		public final static int RIGHT_TRIGGER = 3;

		// === Define the various components of a joystick.
		// === Note: stronghold does not use all of these. Once the code ported
		// === we can remove the unused ones.

		public Joystick driverJoystick;
		private Button dButtonA;
		private Button dButtonB;
		private Button dButtonX;
		private Button dButtonY;
		private Button dButtonBumpL;
		private Button dButtonBumpR;
		private Button dButtonBack;
		private Button dButtonStart;
		private Button dButtonTriggerL;
		private Button dButtonTriggerR;
		final private int dButtonXid = 1;
		final private int dButtonAid = 2;
		final private int dButtonBid = 3;
		final private int dButtonYid = 4;
		final private int dButtonBumpLid = 5;
		final private int dButtonBumpRid = 6;
		final private int dButtonTriggerLid = 7;// 7;
		final private int dButtonTriggerRid = 8;// 8;

		public OI() {
			try {
				driverJoystick = new Joystick(DRIVER_JOYSTICK);
				dButtonA = new JoystickButton(driverJoystick, dButtonAid);
				dButtonB = new JoystickButton(driverJoystick, dButtonBid);
				dButtonX = new JoystickButton(driverJoystick, dButtonXid);
				dButtonY = new JoystickButton(driverJoystick, dButtonYid);
				dButtonBumpL = new JoystickButton(driverJoystick, dButtonBumpLid);
				dButtonBumpR = new JoystickButton(driverJoystick, dButtonBumpRid);
				dButtonTriggerL = new JoystickButton(driverJoystick, dButtonTriggerLid);
				dButtonTriggerR = new JoystickButton(driverJoystick, dButtonTriggerRid);
				setupDriverButtons();
				
				//dButtonY.whileHeld(new ServoMove((int) SmartDashboard.getNumber("Servo Value", 0)));				
				// dButtonTriggerL = new JoystickButton(driverJoystick,
				// dButtonTriggerLid);
				// dButtonTriggerR = new JoystickButton(driverJoystick,
				// dButtonTriggerRid);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private void setupDriverButtons() {
			//dButtonA.whileHeld(new LauncherUp());
		}
		
	}
