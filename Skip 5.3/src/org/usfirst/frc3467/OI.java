package org.usfirst.frc3467;

import org.usfirst.frc3467.commands.drivebase.shifters.ShiftDown;
import org.usfirst.frc3467.commands.drivebase.shifters.ShiftUp;
import org.usfirst.frc3467.commands.shooter.SetShooterSpeed;
import org.usfirst.frc3467.commands.shooter.angler.AnglerToggle;
import org.usfirst.frc3467.commands.shooter.loader.LoaderGroup;
import org.usfirst.frc3467.commands.shooter.loader.LoaderPop;
import org.usfirst.frc3467.interfaces.Gamepad;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static Joystick leftJoystick = new Joystick(1); //Left driver joystick
	public static Joystick rightJoystick = new Joystick(2);
	public static Gamepad gamepad = new Gamepad(3);

	Button shiftDown = new JoystickButton(leftJoystick, 1);
	Button shiftUp = new JoystickButton(rightJoystick, 1);

	Button setShooterSpeedA = new JoystickButton(gamepad, Gamepad.aButton);
	Button setShooterSpeedB = new JoystickButton(gamepad, Gamepad.bButton);
	Button setShooterSpeedX = new JoystickButton(gamepad, Gamepad.xButton);
	Button setShooterSpeedY = new JoystickButton(gamepad, Gamepad.yButton);
	Button setShooterSpeedStart = new JoystickButton(gamepad,
			Gamepad.startButton);

	Button shooterAnglerToggle = new JoystickButton(gamepad, Gamepad.leftBumper);
	Button shooterLoaderPop = new JoystickButton(gamepad, Gamepad.rightBumper);
	Button shooterLoaderGroup = new JoystickButton(gamepad,
			Gamepad.rightTrigger);

	public OI() {
		shiftDown.whenPressed(new ShiftDown());
		shiftUp.whenPressed(new ShiftUp());

		setShooterSpeedA.whenPressed(new SetShooterSpeed(0.85));
		setShooterSpeedB.whenPressed(new SetShooterSpeed(1.00));
		setShooterSpeedX.whenPressed(new SetShooterSpeed(0.83));
		setShooterSpeedY.whenPressed(new SetShooterSpeed(0.80));
		setShooterSpeedStart.whenPressed(new SetShooterSpeed(0));
		shooterAnglerToggle.whenPressed(new AnglerToggle());
		shooterLoaderPop.whenPressed(new LoaderPop());
		shooterLoaderGroup.whenPressed(new LoaderGroup());
	}

}
