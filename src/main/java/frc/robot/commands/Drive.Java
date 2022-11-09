package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class Drive extends CommandBase {
    Drivetrain drivetrain;
    Joystick leftJoystick;
    Joystick rightJoystick;


    Drive(Drivetrain dt, double leftj, double rightj){
        drivetrain = dt;
        leftJoystick = leftj;
        rightJoystick = rightj;

        super.addRequirements(drivetrain);
    }

    @Override
    public void execute(){
      drivetrain.drive(leftJoystick.getY(), rightJoystick.getY());
    }

    void initialize() {
        drivetrain.stop();
    }

    boolean isFinished() {
        return false;
    }
    void end(boolean stop){
        drivetrain.stop;
    }
}
