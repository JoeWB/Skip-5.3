package org.usfirst.frc3467;

public class RobotMap {
	
	public static int maxEncCount = 1850;
	
	// PWM Out
	public static final int armTalon = 3;
	public static final int leftTalons = 1;
	public static final int rightTalons = 2;
	public static final int shooterMotors = 4;
	
	// Solenoids
	public static final int shifterShiftDown = 1;
	public static final int shifterShiftUp = 2;
	public static final int armPistonDown = 3;
	public static final int armPistonUp = 4;
	public static final int anglerPistonDown = 5;
	public static final int anglerPistonUp = 6;
	public static final int solenoidLoadOut = 7;
	public static final int solenoidLoadIn = 8;
	
	// relay
	public static final int compressor = 1;
	public static final int lightsRelay = 2; // Relay to turn lights on/off
	
	// Digital IO
	public static final int pressureSwitch = 1;
	public static final int armEncA = 2;
	public static final int armEncB = 3;
	public static final int limitSwith = 4;
	
	// Constants
	public static final double winchCalibrateSpeed = 0.3;
}
