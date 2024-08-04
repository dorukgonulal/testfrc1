package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.outtakeSubsystems;

public class outtakeCmd extends CommandBase{
    private final outtakeSubsystems outtakeSubsystems;
    private final double speed;

    public outtakeCmd(outtakeSubsystems outtakeSubsystems, double speed) {
        this.speed = speed;
        this.outtakeSubsystems = outtakeSubsystems;
        addRequirements(outtakeSubsystems);
    }

    @Override
    public void execute() {
        outtakeSubsystems .outtake(speed);
    }

    @Override
    public void end(boolean interrupted) {
        outtakeSubsystems .outtake(0);
    }
}
