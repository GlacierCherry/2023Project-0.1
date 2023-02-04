// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.sensors.CANCoder;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.math.trajectory.TrapezoidProfile.Constraints;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  public final VictorSPX intakeMotor = new VictorSPX(?);
  public final CANSparkMax wristMotor;
  public final CANCoder wristCANCoder = new CANCoder(?);

  public double wristPosition = 0;
  public final double maxWristVelocity = 15;
  public final double maxWristAcceleration = 15;

  public final SimpleMotorFeedforward feedForward = new SimpleMotorFeedforward(?, ?);
  final ProfiledPIDController wristPID = new ProfiledPIDController(0.1, 0.0, 0.0, new Constraints(15, 100));
  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {

  }

  public void WristPosition() {

  }

  public void IntakeIn() {
    wristMotor.set(0.9);
  }

  public void IntakeOut() {
    wristMotor.set(-0.9);
  }

  public void IntakeStop() {
    wristMotor.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
