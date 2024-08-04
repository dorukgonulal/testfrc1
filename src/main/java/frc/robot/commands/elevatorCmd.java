package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.elevatorSubsystems;

public class elevatorCmd extends CommandBase{
    private final elevatorSubsystems elevatorSubsystems;
    private final double speed;

    public elevatorCmd(elevatorSubsystems elevatorSubsystems, double speed) {
        this.speed = speed;
        this.elevatorSubsystems = elevatorSubsystems;

        addRequirements(elevatorSubsystems);
    }

    @Override
    public void execute() {
        elevatorSubsystems.setMotor(speed);
    }
    public void end(boolean interrupted) {
        elevatorSubsystems.setMotor(0);
    }
}
