package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.elevatorSubsystems;

public class elevatorPidCmd extends CommandBase {
    private final elevatorSubsystems elevatorSubsystems;
    private final double setPoint;
    private final PIDController pid;

    public elevatorPidCmd(PIDController pid, double setPoint, elevatorSubsystems elevatorSubsystems) {
        this.setPoint = setPoint;
        this.elevatorSubsystems = elevatorSubsystems;
        this.pid = new PIDController(1.2, 0.4, 0.2);
        pid.setSetpoint(setPoint);
        addRequirements(elevatorSubsystems);
    }

    @Override
    public void initialize() {
        pid.reset();
    }
    @Override
    public void execute() {
        double speed = pid.calculate(elevatorSubsystems .getEncoder());
        elevatorSubsystems .setMotor(speed);
    }
    @Override
    public void end(boolean interrupted) {
        elevatorSubsystems .setMotor(0);
    }
}
