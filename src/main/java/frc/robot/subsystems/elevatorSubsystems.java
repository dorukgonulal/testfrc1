package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class elevatorSubsystems extends SubsystemBase{
    double speed;

    private final Spark motor = new Spark(0);
    private final Encoder encoder = new Encoder(1,2);
    private final double kEncoderTick2Meter = 1.0 / 4096 * 0.1 * Math.PI;

    public void setMotor(double speed) {
        motor.set(speed);
    }

    public double getEncoder() {
        return encoder.get() * kEncoderTick2Meter;
    }
}
