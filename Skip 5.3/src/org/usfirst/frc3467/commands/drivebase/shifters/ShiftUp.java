package org.usfirst.frc3467.commands.drivebase.shifters;

import org.usfirst.frc3467.commands.CommandBase;

public class ShiftUp extends CommandBase {
	public ShiftUp() {
		requires(shifter);
		setTimeout(0.1);
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		shifter.shifterShiftUp();

	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
