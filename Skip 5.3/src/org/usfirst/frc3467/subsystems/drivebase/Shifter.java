package org.usfirst.frc3467.subsystems.drivebase;

import org.usfirst.frc3467.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shifter extends Subsystem {
	Solenoid sole1;
	Solenoid sole2;
	public boolean isUp = false;

	public Shifter() {
		sole1 = new Solenoid(RobotMap.shifterShiftUp);
		sole2 = new Solenoid(RobotMap.shifterShiftDown);
	}

	public void shifterShiftUp() {
		sole1.set(true);
		sole2.set(false);
		isUp = true;
	}

	public void ShifterShiftDown() {
		sole1.set(false);
		sole2.set(true);
		isUp = false;
	}

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
