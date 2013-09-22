package org.usfirst.frc3467.commands.shooter.loader;

import org.usfirst.frc3467.commands.CommandBase;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LoaderGroup extends CommandGroup {
	public LoaderGroup() {
		requires(CommandBase.harpoon);

		this.addSequential(new LoaderPop());
		this.addSequential(new LoaderPop());
		this.addSequential(new LoaderPop());
		// this.addSequential(new LoadOut());
		// this.addSequential(new WaitCommand(delay));

		// this.addSequential(new LoadIn()); // Push Frisbee out
		// this.addSequential(new WaitCommand(delay));
		// this.addSequential(new LoadOut());
		// this.addSequential(new WaitCommand(delay));

		// this.addSequential(new LoadIn()); // Push Frisbee out
		// this.addSequential(new WaitCommand(delay));
		// this.addSequential(new LoadOut());
		// this.addSequential(new WaitCommand(delay));

		// this.addSequential(new LoadIn()); // Push Frisbee out
		// this.addSequential(new WaitCommand(delay));
		// this.addSequential(new LoadOut());
	}
}