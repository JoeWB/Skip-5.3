package org.usfirst.frc3467.subsystems.drivebase;

import org.usfirst.frc3467.RobotMap;
import org.usfirst.frc3467.commands.drivebase.DriveJoysticks;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem {
	private RobotDrive drive;
	private Victor leftVictors, rightVictors;

	public DriveBase() {
		leftVictors = new Victor(RobotMap.leftVictors);
		rightVictors = new Victor(RobotMap.rightVictors);
		drive = new RobotDrive(leftVictors, rightVictors);
		drive.setSafetyEnabled(false);
	}
	public void drive(double left, double right) {
		drive.tankDrive(left, right);
	}
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveJoysticks());
	}
}
