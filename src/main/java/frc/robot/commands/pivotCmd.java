package frc.robot.commands;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.pivotSubsystems;

public class pivotCmd extends CommandBase{
    
    double speed;
    private final Spark motor = new Spark(1);
    private final pivotSubsystems pivotSubsystems;
    
    public pivotCmd(pivotSubsystems pivotSubsystems, double speed) {
        this.pivotSubsystems = pivotSubsystems;
        this.speed = speed;
        addRequirements(pivotSubsystems);
    }
    @Override 
    public void execute() {
        pivotSubsystems.setMotor(speed);
    }
    @Override
    public void end(boolean interrupted) {
        pivotSubsystems.setMotor(0);
    }
}
