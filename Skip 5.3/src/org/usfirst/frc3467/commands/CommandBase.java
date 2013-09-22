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
		driveBase = new DriveBase();
		shooter = new Shooter();
		harpoon = new Harpoon();
		angler = new Angler();
		shifter = new Shifter();
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
