package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Drive extends CommandBase {
  private Drivetrain drivetrain;
  private double leftSpeed, rightSpeed;

  public Drive(Drivetrain drivetrain, double leftSpeed, double rightSpeed) {
    this.drivetrain = drivetrain;
    this.leftSpeed = leftSpeed;
    this.rightSpeed = rightSpeed;
    addRequirements(drivetrain);
  }

  @Override
  public void execute(){
    drivetrain.drive(leftSpeed, rightSpeed);
  }
}