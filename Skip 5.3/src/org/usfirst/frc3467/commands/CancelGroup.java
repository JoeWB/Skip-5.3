package org.usfirst.frc3467.commands;

import org.usfirst.frc3467.commands.shooter.loader.LoaderPop;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CancelGroup extends CommandBase {
	CommandGroup groupCancel;
	public CancelGroup(CommandGroup group) {
		groupCancel = group;
	}
	protected void initialize() {
		if (LoaderPop.cancel) {
			groupCancel.cancel();
		}
	}

	protected void execute() {
		// TODO Auto-generated method stub

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
