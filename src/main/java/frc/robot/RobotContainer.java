// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.elevatorCmd;
import frc.robot.commands.pivotCmd;
import frc.robot.commands.elevatorPidCmd;
import frc.robot.commands.intakeCmd;
import frc.robot.commands.outtakeCmd;
import frc.robot.subsystems.elevatorSubsystems;
import frc.robot.subsystems.intakeSubsystems;
import frc.robot.subsystems.outtakeSubsystems;
import frc.robot.subsystems.pivotSubsystems;

public class RobotContainer {

  private final elevatorSubsystems elevatorSubsystems = new elevatorSubsystems();
  private final pivotSubsystems pivotSubsystems = new pivotSubsystems();
  private final intakeSubsystems intakeSubsystems = new intakeSubsystems();
  private final outtakeSubsystems outtakeSubsystems = new outtakeSubsystems();
  private final PS5Controller joy1 = new PS5Controller(7);
  private final PIDController pid = new PIDController(1.2, 0.4, 0.2);

    public RobotContainer() {
      elevatorSubsystems.setDefaultCommand(new elevatorCmd(elevatorSubsystems, 0));
      pivotSubsystems.setDefaultCommand(new pivotCmd(pivotSubsystems, 0));
      intakeSubsystems.setDefaultCommand(new intakeCmd(intakeSubsystems, 0));
      outtakeSubsystems.setDefaultCommand(new outtakeCmd(outtakeSubsystems, 0));

    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(joy1, 8).whileTrue(new elevatorCmd(elevatorSubsystems, 0.7)); // rastgele sayı
    new JoystickButton(joy1, 9).whileTrue(new pivotCmd(pivotSubsystems, 0.7));
    new JoystickButton(joy1, 1).whileTrue(new elevatorPidCmd(pid, 0.3, elevatorSubsystems));
    new JoystickButton(joy1, 2).whileTrue(new intakeCmd(intakeSubsystems, 0.7));
    new JoystickButton(joy1, 3).whileTrue(new outtakeCmd(outtakeSubsystems, 0.7));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
