package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.RollerSubsystem;
public class RollerCommand extends Command {

    private final RollerSubsystem rollerSubsystem;
    private final Joystick joystick;

    public RollerCommand(RollerSubsystem rollerSubsystem, Joystick joystick) {
        this.rollerSubsystem = rollerSubsystem;
        this.joystick = joystick;
        addRequirements(rollerSubsystem);
    }

    @Override
    public void execute() {
       
        if (joystick.getRawButton(1)) {  
            rollerSubsystem.setSpeed(0.5);
        } else {
            rollerSubsystem.stop();
        
        }
    }
}