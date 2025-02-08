// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.RollerSubsystem;
import frc.robot.commands.AutonomousCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.RollerCommand;
import edu.wpi.first.wpilibj.Joystick;


public class RobotContainer {
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  private final RollerSubsystem rollerSubsystem = new RollerSubsystem();
  private final Joystick joystick = new Joystick(0);


  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);


  public RobotContainer() {

    driveSubsystem.setDefaultCommand(new DriveCommand(driveSubsystem, joystick));
    rollerSubsystem.setDefaultCommand(new RollerCommand(rollerSubsystem, joystick));
    
    configureBindings();
  }

 
  private void configureBindings() {
    
    new Trigger(m_exampleSubsystem::exampleCondition)
        .onTrue(new ExampleCommand(m_exampleSubsystem));

   
    m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  }

  
  public Command getAutonomousCommand() {
    return new AutonomousCommand(driveSubsystem, rollerSubsystem);
    
  }
}
