package org.usfirst.frc.team2154.robot.subsystems;


import org.usfirst.frc.team2154.robot.Robot;
import org.usfirst.frc.team2154.robot.RobotMap;
import org.usfirst.frc.team2154.robot.commands.Drive;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrainSubsystem extends Subsystem {
	public static final double FORWARD_GAIN = 0.8;
	public static final double TURN_GAIN = 0.8;
	
	private Jaguar frontLeftMotor;
	private Jaguar frontRightMotor;
	private Jaguar backLeftMotor;
	private Jaguar backRightMotor;
	private SpeedControllerGroup leftMotors;
	private SpeedControllerGroup rightMotors;
	private DifferentialDrive drive;
	
	public DriveTrainSubsystem() {
		frontLeftMotor = new Jaguar(RobotMap.FRONT_LEFT);
		frontLeftMotor.setSafetyEnabled(false);
		frontLeftMotor.setInverted(true);
		
		frontRightMotor = new Jaguar(RobotMap.FRONT_RIGHT);
		frontRightMotor.setSafetyEnabled(false);
		frontRightMotor.setInverted(true);
		
		backLeftMotor = new Jaguar(RobotMap.BACK_LEFT);
		backLeftMotor.setSafetyEnabled(false);
		backLeftMotor.setInverted(true);
		
		backRightMotor = new Jaguar(RobotMap.BACK_RIGHT);
		backRightMotor.setSafetyEnabled(false);
		backRightMotor.setInverted(true);
		
		leftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
		rightMotors  = new SpeedControllerGroup(frontRightMotor, backLeftMotor);
		drive = new DifferentialDrive(leftMotors, rightMotors);
		
	}
	public void tankDrive(double leftSpeed, double rightSpeed) { 
		drive.tankDrive(leftSpeed, rightSpeed);
	}
	
	public void arcadeDrive(double throttle, double turn) {
		drive.arcadeDrive(throttle, turn);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Drive());
	}

}