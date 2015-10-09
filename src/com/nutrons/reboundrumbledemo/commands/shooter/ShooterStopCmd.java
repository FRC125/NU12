package com.nutrons.reboundrumbledemo.commands.shooter;

import com.nutrons.reboundrumbledemo.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class ShooterStopCmd extends CommandBase {
    
    public ShooterStopCmd() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.setShooterPower(0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
