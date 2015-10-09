package com.nutrons.reboundrumbledemo.commands.shooter;

import com.nutrons.reboundrumbledemo.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class ShooterSlowCmd extends CommandBase {
    
    public ShooterSlowCmd() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.setShooterPower(0.75);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
