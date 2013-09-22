package org.usfirst.frc3467.commands.shooter;

import org.usfirst.frc3467.commands.CommandBase;
import org.usfirst.frc3467.commands.shooter.loader.LoaderPop;
import org.usfirst.frc3467.subsystems.shooter.Shooter;

public class CheckShooterSpeed extends CommandBase {

	public static boolean ready = false;

	public CheckShooterSpeed() {
		setTimeout(3);
	}

	protected void initialize() {
		LoaderPop.cancel = false;
		ready = false;
	}

	protected void execute() {
		if (System.currentTimeMillis() - Shooter.time > 1500)
			ready = true;
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		if (ready) {
			return true;
		} else if (isTimedOut()) {
			LoaderPop.cancel = true;
			return true;
		} else {
			return false;
		}
	}
	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}
}
