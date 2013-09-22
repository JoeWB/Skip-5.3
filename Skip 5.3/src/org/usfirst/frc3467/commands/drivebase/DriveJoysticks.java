package org.usfirst.frc3467.commands.drivebase;

import org.usfirst.frc3467.OI;
import org.usfirst.frc3467.commands.CommandBase;

public class DriveJoysticks extends CommandBase{

	public DriveJoysticks() {
		requires(driveBase);
	}
	
	protected void end() {
		
	}

	protected void execute() {
		double left= 0.0;
		double right= 0.0;
		left = OI.leftJoystick.getY();
		right = OI.rightJoystick.getY();
		driveBase.drive(left, right);
	}

	protected void initialize() {
		
	}

	protected void interrupted() {
		
	}

	protected boolean isFinished() {
		return false;
	}

}
