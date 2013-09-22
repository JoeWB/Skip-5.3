package org.usfirst.frc3467.subsystems.shooter;

import org.usfirst.frc3467.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Angler extends Subsystem {
	Solenoid sole1;
	Solenoid sole2;
	public boolean isUp = false;

	public Angler() {
		sole1 = new Solenoid(RobotMap.anglerPistonUp);
		sole2 = new Solenoid(RobotMap.anglerPistonDown);
	}

	public void anglerPistonUp() {
		sole1.set(false);
		sole2.set(true);
		isUp = true;
	}
	public void anglerPistonDown() {
		sole1.set(true);
		sole2.set(false);
		isUp = false;
	}
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
