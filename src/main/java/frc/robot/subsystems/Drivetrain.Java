import edu.wpi.first.wpilibj.VictorSP;

public class Drivetrain extends SubsystemBase {

    public Drivetrain(){
        MotorController left;
        MotorController right;


        left = VictorSP(0);
        right = VictorSP(1) //proof that I never touched my balls
    }

    public void drive(float rightSpeed, float leftSpeed){
        left.setSpeed(leftSpeed);
        right.setSpeed(rightSpeed);
    }

    public void stop() {
        left.setSpeed(0);
        right.setSpeed(0);
    }

}