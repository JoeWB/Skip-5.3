package org.usfirst.frc3467.commands.shooter;

import org.usfirst.frc3467.commands.CommandBase;

public class SetShooterSpeed extends CommandBase {
	double speed = 0.0;

	public SetShooterSpeed(double shooterSpeed) {
		requires(shooter);
		speed = shooterSpeed;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		
		shooter.setSpeed(speed);

	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
