package com.nutrons.reboundrumbledemo.commands.shooter;

import com.nutrons.reboundrumbledemo.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class ShooterOffCmd extends CommandBase {
    
    public ShooterOffCmd() {
        requires(shooter);
    }

    protected void initialize() {
    }
    
    protected void execute() {
        shooter.stop();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        shooter.stop();
    }

    protected void interrupted() {
    }
}
