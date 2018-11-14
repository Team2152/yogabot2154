package org.usfirst.frc.team2154.robot.commands;

import org.usfirst.frc.team2154.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LauncherUp extends Command {
	private static int PRINT_NUM = 0;
	
	public LauncherUp() {
		requires(Robot.launcher); 
		
	}
	
	@Override
	protected void initialize() {
		
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void execute() {
		System.out.printf("(%d) hey im running (;%n", ++PRINT_NUM);
		Robot.launcher.goUp();
	}

	protected void end() {
		Robot.launcher.stop();
	}
	
}
