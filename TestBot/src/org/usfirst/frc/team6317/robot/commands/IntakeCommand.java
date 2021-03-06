package org.usfirst.frc.team6317.robot.commands;

import org.usfirst.frc.team6317.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class IntakeCommand extends Command{

	public int sh;
	
	public IntakeCommand(int shoot) {
		this.requires(Robot.IntakeSystem);
		sh = shoot;
	}
	
	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		if(sh == 1)
			Robot.IntakeSystem.takingIn();
		if(sh == 2)
			Robot.IntakeSystem.pushingOut();
		if(sh == 0)
			Robot.IntakeSystem.stopIntake();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
