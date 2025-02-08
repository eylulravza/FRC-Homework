package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// import edu.wpi.first.math.controller.PIDController;


public class DriveSubsystem extends SubsystemBase{

    // identify
    private SparkMax leftMotor1 = new SparkMax(0, MotorType.kBrushed);
    private SparkMax leftMotor2 = new SparkMax(1, MotorType.kBrushed);
    
    private SparkMax rightMotor1 = new SparkMax(2, MotorType.kBrushed);
    private SparkMax rightMotor2 = new SparkMax(3, MotorType.kBrushed);
    
    private  RelativeEncoder leftFrontEncoder = leftMotor1.getEncoder();
    private  RelativeEncoder rightFrontEncoder = rightMotor1.getEncoder();
   
    // private PIDController leftPID = new PIDController(0.1, 0.0, 0.0); 
    // private PIDController rightPID = new PIDController(0.1, 0.0, 0.0); 

    DifferentialDrive differentialDrive = new DifferentialDrive(leftMotor1, rightMotor1);

    SparkMaxConfig config = new SparkMaxConfig();

    public DriveSubsystem() {
        
        // to make motors follow each other
        config.follow(leftMotor1);
        leftMotor2.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        config.follow(rightMotor1);
        rightMotor2.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

        rightFrontEncoder.setPosition(0);
        leftFrontEncoder.setPosition(0);

    }

        @Override
        public void periodic() {
            SmartDashboard.putNumber("Right encoder", rightFrontEncoderValue());
            SmartDashboard.putNumber("Left encoder", leftFrontEncoderValue());
        }
    
        public double leftFrontEncoderValue() {
            return leftFrontEncoder.getPosition();
        }
    
        public double rightFrontEncoderValue() {
            return rightFrontEncoder.getPosition();
        }
     
        public void tankMode(double leftSpeed, double rightSpeed) {
            differentialDrive.tankDrive(leftSpeed, -rightSpeed);
             // "-" before the rightSpeed is used because of the removal of setInverted() method.
             // Aim is to make left and right motors work in the opposite direction.
        }
    
        public void stop(){
            differentialDrive.stopMotor();
        }

}

