package org.firstinspires.ftc.teamcode.caleb;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp()
public class CalebHelloWorld extends OpMode{

    String lastButtonPressed = "";

    @Override
    public void init() {
        telemetry.addData("brady","goat");
    }

    @Override
    public void loop() {
        telemetry.addData("lastButtonPressed", lastButtonPressed);
        telemetry.addData("mahomes","not goat");
        telemetry.addData("sam darnold","super bowl champion");
        telemetry.addData("micheal vick","best scrambler");

        if (gamepad1.a){
            telemetry.addData("josh allen","best qb");
            lastButtonPressed="a";
        }

        if(gamepad1.b)
            lastButtonPressed="b";

        if (gamepad1.dpad_up){
            telemetry.addData("puka nacua","best wr");
        }

        if (gamepad1.dpad_down){
            telemetry.addData("mr plaisted","mvp");
        }

        if (gamepad1.right_trigger>0.1){
            telemetry.addData("singer","lerbon");
        }
        telemetry.addData("right trigger", gamepad1.right_trigger);
    }

}