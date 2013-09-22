package org.usfirst.frc3467.subsystems.shooter;

import org.usfirst.frc3467.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Harpoon extends Subsystem {
	public static Solenoid sole1;
	public static Solenoid sole2;

	public Harpoon() {
		sole1 = new Solenoid(RobotMap.solenoidLoadIn);
		sole2 = new Solenoid(RobotMap.solenoidLoadOut);
	}

	public void loadIn() {
		sole1.set(false);
		sole2.set(true);
	}

	public void loadOut() {
		sole1.set(true);
		sole2.set(false);
	}

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
