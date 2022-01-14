// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ManualControl extends CommandBase {
  /** Creates a new Drive. */
  DriveTrain dt;
  public ManualControl(DriveTrain passedDriveTrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    dt = passedDriveTrain;
    addRequirements(passedDriveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    dt.ManualControl(Robot.robotContainer.leftStick.getY(), Robot.robotContainer.rightStick.getX());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
