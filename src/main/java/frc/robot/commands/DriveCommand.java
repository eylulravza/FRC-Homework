package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends Command {

    private final DriveSubsystem driveSubsystem;
    private final Joystick joystick;

    public DriveCommand(DriveSubsystem driveSubsystem, Joystick joystick) {
        this.driveSubsystem = driveSubsystem;
        this.joystick = joystick;
        addRequirements(driveSubsystem);
    }

    @Override
    public void execute() {
        double y = -joystick.getY(); 
        double x = joystick.getX();  

        driveSubsystem.tankMode(y, x);
    }
}
