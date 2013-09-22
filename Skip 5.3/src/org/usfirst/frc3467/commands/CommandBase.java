package org.usfirst.frc3467.commands;

import org.usfirst.frc3467.OI;
import org.usfirst.frc3467.subsystems.drivebase.DriveBase;
import org.usfirst.frc3467.subsystems.drivebase.Shifter;
import org.usfirst.frc3467.subsystems.shooter.Angler;
import org.usfirst.frc3467.subsystems.shooter.Harpoon;
import org.usfirst.frc3467.subsystems.shooter.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	public static OI oi;
	public static DriveBase driveBase;
	public static Shooter shooter;
	public static Harpoon harpoon;
	public static Angler angler;
	public static CommandBase cb;
	public static Shifter shifter;

	public static void init() {
		driveBase = new DriveBase();	// Create new drive base subsystem
		shooter = new Shooter();		// Create new shooter subsystem
		harpoon = new Harpoon();		// Create new shooter subsystem
		angler = new Angler();			// Create new shooter subsystem
		shifter = new Shifter();		// Create new shooter subsystem
		oi = new OI();
	}

	public CommandBase(String name) {
		super(name);
	}

	public CommandBase() {
		super();
		cb = this;
	}

}
