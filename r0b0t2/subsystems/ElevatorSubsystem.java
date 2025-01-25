package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class ElevatorSubsystem extends SubsystemBase{
    private SparkMax elevatorMotor1 = new SparkMax(3, MotorType.kBrushed);
    private SparkMax elevatorMotor2 = new SparkMax(4, MotorType.kBrushed);
    private Encoder elevatorEncoder1;
    private Encoder elevatorEncoder2;
    elevatorEncoder1 = elevatorMotor1.getEncoder();
    elevatorEncoder2 = elevatorMotor2.getEncoder();

    private PIDController pidController;
    
    private static final double kP = 0.1;
    private static final double kI = 0.0;
    private static final double kD = 0.0;

    elevatorMotor2.follow(elevatorMotor1);

    private double targetPosition;  
    private double currentPosition1;
    private double currentPosition2;

    private final double kEncoderTick2Meter = 1.0 / 4096.0 * 0.128 * Math.PI;


    public ElevatorSubsystem() {
        targetPosition = 0.0;
        pidController = new PIDController(kP, kI, kD);
    }

    public double getElevatorPosition() {
        double position1 = elevatorEncoder1.getDistance() * kEncoderTick2Meter;
        double position2 = elevatorEncoder2.getDistance() * kEncoderTick2Meter;
        return (position1 + position2) / 2;
    }

    public void updatePID() {
        double currentPosition = getElevatorPosition();  
        double pidOutput = pidController.calculate(currentPosition, targetPosition);  
        setMotors(pidOutput);
    }
    
    public void setMotors(double speed) {
        elevatorMotor1.set(speed);
    }

    public void setTargetPosition(double position) {
        targetPosition = position;
        pidController.setSetpoint(targetPosition);  
    }

   
    public void moveUp(double speed) {
        setMotors(speed);
    }


    public void moveDown(double speed) {
        setMotors(-speed);
    }

   
    public void stopElevator() {
        setMotors(0);
    }

   @Override 
    public void periodic() {
        updatePID();
        SmartDashboard.putNumber("Elevator Position", getElevatorPosition());
        SmartDashboard.putNumber("Elevator Target", targetPosition);
    }
}
