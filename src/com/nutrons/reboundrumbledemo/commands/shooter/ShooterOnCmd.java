package com.nutrons.reboundrumbledemo.commands.shooter;

import com.nutrons.reboundrumbledemo.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class ShooterOnCmd extends CommandBase {
    
    public ShooterOnCmd() {
        requires(shooter);
    }

    protected void initialize() {
    }

    protected void execute() {
        shooter.shooterOn();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        shooter.stop();
    }

    protected void interrupted() {
        end();
    }
}
