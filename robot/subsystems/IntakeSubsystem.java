package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class IntakeSubsystem extends SubsystemBase {

    private SparkMax intakeleftmotor = new SparkMax (5, MotorType.kBrushed);
    private SparkMax intakerightmotor = new SparkMax (6, MotorType.kBrushed);
    
    public IntakeSubsystem(){
   
    }


public void intake() {
    intakeleftmotor.set(0.8);
    intakerightmotor.set(0.8);
}

public void outtake() {
    intakeleftmotor.set(-0.8);
    intakerightmotor.set(-0.8);
}

public void stop() {
    intakeleftmotor.set(0);
    intakerightmotor.set(0);
}

}