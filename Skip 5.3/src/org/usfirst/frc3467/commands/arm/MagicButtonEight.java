package org.usfirst.frc3467.commands.arm;

import org.usfirst.frc3467.RobotMap;
import org.usfirst.frc3467.commands.CommandBase;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class MagicButtonEight extends CommandGroup {
	public MagicButtonEight() {
		requires(CommandBase.arm);
		this.addSequential(new GoToRung(RobotMap.maxEncCount));
		this.addSequential(new WaitCommand(2));
		this.addSequential(new PullUp());
		this.addSequential(new GoToRung(90));
	}
}
