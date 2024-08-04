package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class intakeSubsystems extends SubsystemBase{
    private final Spark motor1 = new Spark(1);
    private final Spark motor2 = new Spark(2);

    double speed;
    public void intake(double speed) {
        motor1.set(speed);
        motor2.set(-speed);
    }
}
