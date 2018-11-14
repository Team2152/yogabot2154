 package org.usfirst.frc.team2154.robot.commands;

import org.usfirst.frc.team2154.robot.OI;
import org.usfirst.frc.team2154.robot.Robot;
import org.usfirst.frc.team2154.robot.subsystems.DriveTrainSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	
	public Drive() {
		requires(Robot.driveTrain); 
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		double throttle = Robot.oi.driverJoystick.getRawAxis(OI.LEFT_STICK_Y);
		double turn = Robot.oi.driverJoystick.getRawAxis(OI.RIGHT_STICK_X);
		Robot.driveTrain.arcadeDrive(DriveTrainSubsystem.FORWARD_GAIN * throttle, turn * DriveTrainSubsystem.TURN_GAIN);
		
	}
}
 