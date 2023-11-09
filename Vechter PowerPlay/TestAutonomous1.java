package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import java.util.Set;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@Autonomous(name="TestAutonomous1", group="Linear Opmode")
public class TestAutonomous1 extends LinearOpMode {
 // Declare OpMode members.
 private ElapsedTime runtime = new ElapsedTime();
 private DcMotor motorKanan1 = null;
 private DcMotor motorKanan2 = null;
 private DcMotor motorKiri1 = null;
 private DcMotor motorKiri2 = null;
 private DcMotor motorTengah = null;
 
 private DcMotor lifterRobot = null;
 
 private CRServo servoClaw = null;

 double speed = 0;
 @Override
 public void runOpMode() {
 telemetry.addData("Status", "Initialized");
 telemetry.update();
 // Initialize the hardware variables. Note that the strings used here as parameters
 // to 'get' must correspond to the names assigned during the robot configuration
 // step (using the FTC Robot Controller app on the phone).
 motorKanan1 = hardwareMap.get(DcMotor.class, "kanan1");
 motorKanan2 = hardwareMap.get(DcMotor.class, "kanan2");
 motorKiri1 = hardwareMap.get(DcMotor.class, "kiri1");
 motorKiri2 = hardwareMap.get(DcMotor.class, "kiri2");
 motorTengah = hardwareMap.get(DcMotor.class, "tengah");
 
 lifterRobot = hardwareMap.get(DcMotor.class, "lifter");
 
 servoClaw = hardwareMap.get(CRServo.class, "servoclaw");
 
 // Most robots need the motor on one side to be reversed to drive forward
 // Reverse the motor that runs backwards when connected directly to the battery
 motorKanan1.setDirection(DcMotor.Direction.REVERSE);
 motorKanan2.setDirection(DcMotor.Direction.REVERSE);
 motorKiri1.setDirection(DcMotor.Direction.FORWARD);
 motorKiri2.setDirection(DcMotor.Direction.FORWARD);
 motorTengah.setDirection(DcMotor.Direction.FORWARD);
 
 // Wait for the game to start (driver presses PLAY)
 waitForStart();
 runtime.reset();
 // run until the end of the match (driver presses STOP)
 
 //Autonomous code
 
 //claw menjepit
 servoClaw.setPower(-1);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.5)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //diem
 SetMotor(0,0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.8)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //lifter naik
 lifterRobot.setPower(1);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 3.2)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //diem
 SetMotor(0,0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 1.3)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //lifter stop
 lifterRobot.setPower(0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 1.0)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //diem
 SetMotor(0,0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.4)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //maju
 SetMotor(-1,-1);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.6)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //diem
 SetMotor(0,0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.4)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //muter
 SetMotor(-0.5,0.5);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.4)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //diem
 SetMotor(0,0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.2)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //maju
 SetMotor(-1,-1);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.8)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //diem
 SetMotor(0,0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.2)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //claw membuka
 servoClaw.setPower(1);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.5)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 //diem
 SetMotor(0,0);
 runtime.reset();
 while (opModeIsActive() && (runtime.seconds() < 0.2)) {
  telemetry.addData("Path", "Leg 1: %4.1f S Elapsed", runtime.seconds());
  telemetry.update();
 }
 }
 void SetMotor(double Leftpower, double Rightpower) {
  motorKanan1.setPower(Rightpower);
  motorKanan2.setPower(Rightpower);
  motorKiri1.setPower(Leftpower);
  motorKiri2.setPower(Leftpower);
 }
}
