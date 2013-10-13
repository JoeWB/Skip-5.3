package org.usfirst.frc3467.commands.arm;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class AutoClimb extends CommandGroup {
	public AutoClimb() {
		this.addSequential(new PullUp());
		this.addSequential(new WaitCommand(0.3));
		this.addSequential(new MagicButtonEight());
		this.addSequential(new WaitCommand(0.3));
		this.addSequential(new MagicButtonEight());
		this.addSequential(new GoToRung(600));
		// this.addSequential(new WaitCommand(0.3));
	}
}
