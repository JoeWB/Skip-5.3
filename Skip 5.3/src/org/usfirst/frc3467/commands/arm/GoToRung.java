package org.usfirst.frc3467.commands.arm;

import org.usfirst.frc3467.RobotMap;
import org.usfirst.frc3467.commands.CommandBase;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class GoToRung extends CommandBase {
	int setPoint = 0;
	
	public GoToRung(int setpoint) {
		requires(arm);
		setPoint = setpoint;
	}
	
	protected void initialize() {
		arm.disablePID();
	}
	
	protected void execute() {
		// if (Math.abs((setPoint - arm.enc.get())) >= 200) {
		if (arm.enc.getRaw() < RobotMap.maxEncCount)
			arm.driveWinch(0.009 * (RobotMap.maxEncCount - arm.enc.getRaw()));
		else
			arm.driveWinch(0.0);
		/*
		 * } else { if (!arm.enabled) { arm.setSetpoint(setPoint); arm.enablePID(); } }
		 */
		if (arm.enc.getRaw() > 1400)
			arm.extendPiston();
	}
	
	protected boolean isFinished() {
		if (setPoint - arm.enc.getRaw() <= 25) {
			return true;
		}
		if (arm.enabled && arm.getPIDController().onTarget()) {
			SmartDashboard.putString("PID Status", "On target");
			arm.disablePID();
			return true;
		} else {
			SmartDashboard.putString("PID Status", "Not stopping");
			return false;
		}
	}
	
	protected void end() {
		
	}
	
	protected void interrupted() {
		
	}
	
}
