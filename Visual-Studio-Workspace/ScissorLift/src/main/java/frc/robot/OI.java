/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static final int TRIGGER = 1, BUTTON_2 = 2, BUTTON_3 = 3, BUTTON_4 = 4, BUTTON_5 = 5, BUTTON_6 = 6,
			BUTTON_7 = 7, BUTTON_8 = 8, BUTTON_9 = 9, BUTTON_10 = 10, BUTTON_11 = 11;

	XboxController controller = new XboxController(0);
	XboxController controller2 = new XboxController(1);

	public OI() {


	}

	public double getTriggers() {
		return controller.getRawAxis(XboxController.TRIGGER_R) - controller.getRawAxis(XboxController.TRIGGER_L);
	}

	public double getLeftXboxX() {
		return controller.getRawAxis(0);
	}

	public double getLeftXboxY() {
		return controller.getRawAxis(1);
	}

	public double getRightXboxX() {
		return controller.getRawAxis(4);
	}

	public double getRightXboxY() {
		return controller.getRawAxis(5);
	}

	public double getTriggers2() {
		return controller2.getRawAxis(XboxController.TRIGGER_R) - controller.getRawAxis(XboxController.TRIGGER_L);
	}

	public double getRightTrigger2() {
		return controller2.getRawAxis(XboxController.TRIGGER_R);

	}

	public double getLeftTrigger2() {
		return controller2.getRawAxis(XboxController.TRIGGER_L);
	}

	public double getLeftXboxX2() {
		return controller2.getRawAxis(0);
	}

	public double getLeftXboxY2() {
		return controller2.getRawAxis(1);
	}

	public double getRightXboxX2() {
		return controller2.getRawAxis(4);
	}

	public double getRightXboxY2() {
		return controller2.getRawAxis(5);
	}
}
