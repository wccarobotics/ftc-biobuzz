package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Utility;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;

@Utility
public class FlywheelTest extends OpMode {
    private DcMotorEx launcher = null;

    public int LAUNCHER_TARGET_VELOCITY = 1250;
    public int LAUNCHER_MIN_VELOCITY = 1200;

    @Override
    public void init() {
        launcher = hardwareMap.get(DcMotorEx.class, "launcher");

        launcher.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        launcher.setPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER, new PIDFCoefficients(40, 0, 0, 12.5));
    }

    @Override
    public void loop() {
        if (gamepad1.dpadUpWasPressed()){
            LAUNCHER_TARGET_VELOCITY +=100;
        }
        else if (gamepad1.dpadDownWasPressed()){
            LAUNCHER_TARGET_VELOCITY -=100;
        }
        else if (gamepad1.dpadRightWasPressed()){
            LAUNCHER_TARGET_VELOCITY +=10;
        }
        else if (gamepad1.dpadLeftWasPressed()){
            LAUNCHER_TARGET_VELOCITY -=10;
        }
        LAUNCHER_MIN_VELOCITY = LAUNCHER_TARGET_VELOCITY - 50;

        telemetry.addData("Launcher target", LAUNCHER_TARGET_VELOCITY);

        launcher.setVelocity(LAUNCHER_TARGET_VELOCITY);
    }
}
