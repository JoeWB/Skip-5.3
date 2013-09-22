package org.usfirst.frc3467.commands.drivebase.shifters;

import org.usfirst.frc3467.commands.CommandBase;

public class ShiftDown extends CommandBase {
	public ShiftDown() {
		requires(shifter);
		setTimeout(.01);
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		shifter.ShifterShiftDown();

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
