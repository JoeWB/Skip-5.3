package org.usfirst.frc3467.subsystems.shooter;

import org.usfirst.frc3467.RobotMap;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	double batteryBase = 12.00;
	Jaguar jag;
	Relay lights;
	public double lastSpeed = 0;
	public double speedCopy = 0;
	public static long time = 10000000;

	public Shooter() {
		jag = new Jaguar(RobotMap.shooterMotors);
		lights = new Relay(RobotMap.lightsRelay, Relay.Direction.kForward);
	}

	public void setSpeed(double speed) {
		
		speed = ((batteryBase / DriverStation.getInstance().getBatteryVoltage()) * speed);
		if (speed > 1.00)
			speed = 1.00;
		if (speed != lastSpeed) {
			lastSpeed = speed;
		}
		jag.set(speed);
		speedCopy = speed;
		if (speedCopy == 0) 
			time = System.currentTimeMillis();
		if (lastSpeed == 0 && speedCopy != 0) {
			time = System.currentTimeMillis();
		}
		
		if (speed > 0.0) {
			lights.set(Relay.Value.kOn);
		} else {
			lights.set(Relay.Value.kOff);
		}
	}

	public double getSpeed() {
		return speedCopy;
	}

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
}