package org.usfirst.frc3467.commands.shooter.loader;

import org.usfirst.frc3467.commands.CancelGroup;
import org.usfirst.frc3467.commands.CommandBase;
import org.usfirst.frc3467.commands.shooter.CheckShooterSpeed;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class LoaderPop extends CommandGroup {
	public static boolean cancel = false;
	public LoaderPop() {
		requires(CommandBase.harpoon);
		addSequential(new CheckShooterSpeed());
		addSequential(new CancelGroup(this));
		addSequential(new LoadIn());
		addSequential(new WaitCommand(0.1));
		addSequential(new LoadOut());
		addSequential(new WaitCommand(0.1));

	}

}
