package frc.robot.commands;

import frc.robot.Constants;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LEFTSIDE extends CommandGroup {

	public LEFTSIDE() {
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
		addSequential(new DriveAutoTimed2(Constants.PART_1));
		addSequential(new Delay(0.25));
		addSequential(new GyroTurn(90));
		addSequential(new DriveUntilCollision());
		addSequential(new RunEverything(10));
	}
}
