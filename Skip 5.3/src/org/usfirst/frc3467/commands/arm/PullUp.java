package org.usfirst.frc3467.commands.arm;

import org.usfirst.frc3467.commands.CommandBase;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PullUp extends CommandBase {
	
	public PullUp() {
		requires(arm);
	}
	
	long time = 0L;
	
	protected void initialize() {
		time = System.currentTimeMillis();
	}
	
	protected void execute() {
		if (arm.enc.get() >= -200)
			arm.driveWinch(-1.0);// * arm.enc.get() * 0.007);
		else {
			arm.setSetpoint(0);
			arm.enablePID();
		}
		if (System.currentTimeMillis() - time >= 400)
			arm.retractPiston();
	}
	
	protected boolean isFinished() {
		if (!arm.limitSwitch.get()) {
			SmartDashboard.putString("PID Status", "Limit switch");
			// arm.disablePID();
			arm.driveWinch(0);
			return true;
		} /*
		 * else if (arm.getPIDController().onTarget()) { SmartDashboard.putString("PID Status", "On target"); arm.disablePID(); arm.driveWinch(0); return true;{ }
		 */
		else {
			SmartDashboard.putString("PID Status", "Not stopping");
			return false;
		}
	}
	
	protected void end() {
		
	}
	
	protected void interrupted() {
		
	}
	
}
