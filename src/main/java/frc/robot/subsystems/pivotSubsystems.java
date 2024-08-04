package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class pivotSubsystems extends SubsystemBase{
    double speed;
    public final Spark motor = new Spark(1);

    public void setMotor(double distance){
        motor.set(distance);
    }
}
