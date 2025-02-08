package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Encoder;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

public class RollerSubsystem extends SubsystemBase {

    private final SparkMax rollerMotor = new SparkMax(4, MotorType.kBrushed);
     private Encoder rollerEncoder = new Encoder(5, 6, false);
    SparkMaxConfig rollerConfig = new SparkMaxConfig();
     private PIDController pidController = new PIDController(0.1, 0.0, 0.0);

    public RollerSubsystem() {
        rollerEncoder.reset();

        rollerConfig.inverted(false);
        rollerConfig.idleMode(IdleMode.kCoast);
        rollerMotor.configure(rollerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    public void setSpeed(double targetSpeed){

        pidController.setSetpoint(targetSpeed);
        double output = pidController.calculate(rollerEncoder.getRate());
        rollerMotor.set(output);
    }

    public void stop() {
        rollerMotor.set(0);
    }

}
