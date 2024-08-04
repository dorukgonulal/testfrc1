package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class outtakeSubsystems extends SubsystemBase {
    private final Spark motor1 = new Spark(1);
    private final Spark motor2 = new Spark(2);

    double speed;
    public void outtake(double speed) {
        motor1.set(-speed);
        motor2.set(speed);
    }
}