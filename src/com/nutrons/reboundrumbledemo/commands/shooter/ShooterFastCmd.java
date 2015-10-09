package com.nutrons.reboundrumbledemo.commands.shooter;

import com.nutrons.reboundrumbledemo.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class ShooterFastCmd extends CommandBase {
    
    public ShooterFastCmd() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.setShooterPower(1);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
