/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.colorMotor;
import frc.robot.subsystems.ColorSensor;

public class colorMove extends CommandBase {
  private final colorMotor m_colorMotor;

  /**
   * Creates a new colorMove.
   */
  public colorMove(colorMotor colormotor) {
    m_colorMotor = colormotor;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   

    if (ColorSensor.numberOfChange < 3) {
      m_colorMotor.driveFoward(0.2);
      System.out.println("Motor Is Moving");
    } else {
      m_colorMotor.driveFoward(0);
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}