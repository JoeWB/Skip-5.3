package org.usfirst.frc3467.commands.autonomous;

import org.usfirst.frc3467.commands.shooter.SetShooterSpeed;
import org.usfirst.frc3467.commands.shooter.angler.AnglerDown;
import org.usfirst.frc3467.commands.shooter.loader.AutoLoaderGroup;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class Auto extends CommandGroup {
	public Auto(double d) {
		//this.addSequential(new ArmCalibrate());
		this.addParallel(new SetShooterSpeed(d));

		this.addSequential(new WaitCommand(2));
		this.addSequential(new AutoLoaderGroup());

		this.addParallel(new AnglerDown());
		this.addParallel(new AnglerDown());
		this.addParallel(new SetShooterSpeed(0.0));
	}
}
