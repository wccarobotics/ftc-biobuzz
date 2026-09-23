package org.firstinspires.ftc.teamcode.krisly;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class KrislyHelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","ftc");
    }
    @Override
    public void loop() {
        telemetry.addData("tony","stark");

        telemetry.addData("hello","krisly");

        if (gamepad1.a){
            telemetry.addData("iron","man");
        }
    }

}