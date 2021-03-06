///*----------------------------------------------------------------------------*/
///* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
///* Open Source Software - may be modified and shared by FRC teams. The code   */
///* must be accompanied by the FIRST BSD license file in the root directory of */
///* the project.                                                               */
///*----------------------------------------------------------------------------*/
//
package frc.robot;

//
///**
// * The RobotMap is a mapping from the ports sensors and actuators are wired into
// * to a variable name. This provides flexibility changing wiring, makes checking
// * the wiring easier and significantly reduces the number of magic numbers
// * floating around.
// */
public class RobotMap {
	// // For example to map the left and right motors, you could define the
	// // following variables to use with your drivetrain subsystem.
	// // public static int leftMotor = 1;
	// // public static int rightMotor = 2;
	//
	// // If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	// DRIVE
	public static final int TALON_1 = 0;
	public static final int TALON_2 = 1;
	public static final int TALON_3 = 2;
	public static final int TALON_4 = 3;
	public static final int ARM2 = 4;  
	public static final int ARM1 = 5;
	public static final int INTAKE = 6;
	public static final int WINCH = 7;

	public static final int[] HATCHSOL1 = {0,1};
	public static final int[] HATCHSOL2 = {2,3};
	public static final int[] WHINCHSOL = {4,5};

	public static final int[] ENCL = {2,3};
	public static final int[] ENCR = {0,1};
	public static final int POT = 0;
	public static final int LIMITSWITCHTOP = 5;
	public static final int LIMITSWITCHBOT = 4;
}
