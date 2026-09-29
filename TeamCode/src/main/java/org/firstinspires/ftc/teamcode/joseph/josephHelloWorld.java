package org.firstinspires.ftc.teamcode.joseph;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class josephHelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("lebron","goat");
    }

    @Override
    public void loop() {
        telemetry.addData("messi","goat");
        telemetry.addData("cr7","ucl champion");
        telemetry.addData("ronaldihno","best dribbler");

        if (gamepad1.a){
            telemetry.addData("messi","lebron");
        }
    }
 }