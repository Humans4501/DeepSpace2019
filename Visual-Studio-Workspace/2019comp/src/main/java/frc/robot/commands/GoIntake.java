package frc.robot.commands;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GoIntake extends Command {
    public boolean speed1;
    public boolean speed2;
    public double speed;
    public GoIntake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
      requires(Robot.intake);
      
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
    
        // Called repeatedly when this Command is scheduled to run
    protected void execute() {

        if (Robot.oi.getStart2()){
            speed = 1;
        }else{
            speed = Robot.oi.getTriggers2();
        }

        // if(!Robot.oi.getX() && !Robot.oi.getY()){
        //     speed = 0;
        // }else if (Robot.oi.getX()){
        //     speed = 1 ;
        // }else{
        //     speed = -1;
        // }
    	Robot.intake.goIntake(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        // System.out.println("HAS ENDED");
        Robot.intake.goIntake(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
