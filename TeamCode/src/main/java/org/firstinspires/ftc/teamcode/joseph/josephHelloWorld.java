package org.firstinspires.ftc.teamcode.joseph;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class josephHelloWorld extends OpMode {

    String lastbuttonpressed = "";

    @Override
    public void init() {
        telemetry.addData("lebron","goat");
    }

    @Override
    public void loop() {
        telemetry.addData("lastbuttonpressed",lastbuttonpressed);

        telemetry.addData("messi","goat");
        telemetry.addData("cr7","ucl champion");
        telemetry.addData("ronaldihno","best dribbler");

        if (gamepad1.b){
            telemetry.addData("messi","lebron");
            lastbuttonpressed="b";
        }
        if (gamepad1.a){
            telemetry.addData("lebron", "the goat");
            lastbuttonpressed="a";
        }
        if (gamepad1.right_trigger>0.5){
            telemetry.addData("messi", "idk");
            lastbuttonpressed="right_trigger";
        }
        if (gamepad1.left_trigger>0.5){
            telemetry.addData("joseph", "idk");
            lastbuttonpressed="left_trigger";
        }
        telemetry.addData("right trigger", gamepad1.right_trigger);
    }
 }