package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intakeSubsystems;

public class intakeCmd extends CommandBase {
    private final intakeSubsystems intakeSubsystems;
    private final double speed;
    public intakeCmd(intakeSubsystems intakeSubsystems, double speed) {
        this.intakeSubsystems = intakeSubsystems;
        this.speed = speed;
        addRequirements(intakeSubsystems);
    }

    @Override
    public void execute() {
        intakeSubsystems .intake(speed);
    }

    @Override
    public void end(boolean interrupted) {
        intakeSubsystems .intake(0);
    }
}
