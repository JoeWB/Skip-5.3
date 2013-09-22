package org.usfirst.frc3467.commands.shooter.loader;

import org.usfirst.frc3467.commands.CommandBase;

public class LoadOut extends CommandBase {
	public LoadOut() {
		requires(harpoon);
		setTimeout(0.1);
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		if (LoaderPop.cancel == false)
			harpoon.loadOut();
	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	protected boolean isFinished() {
		if (LoaderPop.cancel)
			return true;
		else
			return isTimedOut();
	}
}
