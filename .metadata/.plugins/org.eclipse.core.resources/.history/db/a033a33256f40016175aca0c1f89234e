package org.usfirst.frc.team6317.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team6317.robot.commands.*;

public class OI {
	
	public static Joystick leftStick = new Joystick(0);
	public static Joystick rightStick = new Joystick(1);
	Button leftTrigger = new JoystickButton(leftStick, 1);
	Button rightTrigger = new JoystickButton(rightStick, 1);
	Button topLeft = new JoystickButton(leftStick, 3);
	Button topRight = new JoystickButton(leftStick, 4);
	Button midLeft = new JoystickButton(leftStick, 5);
	
	public OI(){
		leftTrigger.whenPressed(new KickCommand());
		rightTrigger.whenPressed(new ShooterCommand());
		topLeft.whenPressed(new IntakeCommand(1));
		topRight.whenPressed(new IntakeCommand(2));
		midLeft.whenPressed(new IntakeCommand(0));
	}
}