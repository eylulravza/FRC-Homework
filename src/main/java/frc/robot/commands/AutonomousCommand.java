package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.RollerSubsystem;

public class AutonomousCommand extends Command {
    private final DriveSubsystem driveSubsystem;
    private final RollerSubsystem rollersubsystem;
    private final Timer timer = new Timer();

    public AutonomousCommand(DriveSubsystem driveSubsystem, RollerSubsystem rollerSubsystem){
        this.driveSubsystem = driveSubsystem;
        this.rollersubsystem = rollerSubsystem;
        addRequirements(driveSubsystem, rollerSubsystem);
    }

    @Override
    public void initialize() {
        timer.reset();
        timer.start();
    }

    @Override
    public void execute() {
        if (timer.get() < 10) {
            driveSubsystem.tankMode(0.5, 0.5);
        } else if (timer.get() < 12) {
            driveSubsystem.tankMode(0, 0);
            rollersubsystem.setSpeed(0.5);
        } else if (timer.get() < 14) {
            driveSubsystem.tankMode(0.5, 0.5);
        } else {
            driveSubsystem.tankMode(0, 0);
            rollersubsystem.stop();
        }
    }

    @Override
    public void end(boolean interrupted) {
        driveSubsystem.tankMode(0, 0);  
       rollersubsystem.stop();
    }

}
