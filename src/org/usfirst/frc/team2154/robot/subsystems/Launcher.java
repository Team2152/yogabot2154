package org.usfirst.frc.team2154.robot.subsystems;

import org.usfirst.frc.team2154.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Launcher extends Subsystem {

	public static final double UP_SPEED = 0.5;
	public static final double DOWN_SPEED = -UP_SPEED;

	private Jaguar launch;
	private DigitalInput limitSwitch;
	
	public Launcher() { 
		 launch = new Jaguar(RobotMap.LAUNCHER);
		 launch.setInverted(true);
		 limitSwitch = new DigitalInput(RobotMap.BOTTOM_LIMIT_SWITCH);
	 }
	
	public void goUp() {
		launch.set(UP_SPEED);
	}
	
	public void goDown() {
		launch.set(DOWN_SPEED);
	}
	
	public void stop() {
		launch.set(0);
	}
	
	public boolean downSwitchHit() {
		return limitSwitch.get(); 
	}
	
	public boolean upSwitchHit() {
		return false;
	}

	@Override
	protected void initDefaultCommand() {
		
	}
}
