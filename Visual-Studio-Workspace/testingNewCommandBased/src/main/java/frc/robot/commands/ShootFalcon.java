/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.ShooterDesiredSpeedFalcon1;
import frc.robot.subsystems.ShooterDesiredSpeedFalcon2;

public class ShootFalcon extends CommandBase {
  private final Shooter shooter;
  private final ShooterDesiredSpeedFalcon1 pidF1;
  private final ShooterDesiredSpeedFalcon2 pidF2;
  /**
   * Creates a new Shoot.
   */
  public ShootFalcon(Shooter subsystem, ShooterDesiredSpeedFalcon1 pIDF1, ShooterDesiredSpeedFalcon2 pIDF2) {
    // Use addRequirements() here to declare subsystem dependencies.
    shooter = subsystem;
    pidF1 = pIDF1;
    pidF2 = pIDF2;
    addRequirements(shooter);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    pidF1.setSetpoint(-Robot.rpmFalcon1);
    pidF2.setSetpoint(Robot.rpmFalcon2);
    pidF1.enable();
    pidF2.enable();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // SmartDashboard.putNumber("output", pidF1.currOutput);
    shooter.shoot(pidF1.currOutput, pidF2.currOutput);

  } 

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    shooter.shoot(0,0);
    pidF1.disable();
    pidF2.disable();
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
