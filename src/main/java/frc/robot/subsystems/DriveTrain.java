// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.math.controller.RamseteController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  CANSparkMax frontLeft;
  CANSparkMax frontRight;

  MotorControllerGroup leftMotors = new MotorControllerGroup(frontLeft);
  MotorControllerGroup rightMotors = new MotorControllerGroup(frontLeft);

  DifferentialDrive differentialDrive = new DifferentialDrive(leftMotors, rightMotors);

  RamseteController controller1 = new RamseteController();
  RamseteController controller2 = new RamseteController(2.1, 0.8);

  public DriveTrain() {}

  public void ManualControl(Double forwardSpeed, Double turnSpeed){
    differentialDrive.arcadeDrive(forwardSpeed, turnSpeed);
  }  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
