package org.usfirst.frc3467.subsystems.arm;

import org.usfirst.frc3467.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class Arm extends PIDSubsystem{
	
	public Solenoid sole1; //creates solenoid 1
	public Solenoid sole2; //creates solenoid 2
	public DigitalInput limitSwitch; //creates the digital input
	public Encoder encoder; //creates the encoder
	public Talon talon; //creates the talon
	
	public Arm(){
		super(0.0,0.0,0.0);
		encoder = new Encoder (RobotMap.armEncSigA,RobotMap.armEncSigB);
		talon = new Talon (RobotMap.armTalon);
		limitSwitch = new DigitalInput (RobotMap.armDigitalIO);
	}
	
	protected void initDefaultCommand() {
		
	}

	protected double returnPIDInput() {
		return 0;
	}

	protected void usePIDOutput(double output) {
		
	}
	
}
