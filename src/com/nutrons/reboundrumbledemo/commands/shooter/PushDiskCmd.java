package com.nutrons.reboundrumbledemo.commands.shooter;

import com.nutrons.reboundrumbledemo.commands.CommandBase;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Camilo Gonzalez
 */
public class PushDiskCmd extends CommandBase {
    
    Timer timer = new Timer();
    
    public PushDiskCmd() {
        requires(shooter);
    }

    protected void initialize() {
        timer.reset();
        timer.start();
    }

    protected void execute() {
        shooter.pushBolt();
    }

    protected boolean isFinished() {
        return timer.get() > 0.45;
    }

    protected void end() {
        timer.stop();
        shooter.retractBolt();
    }

    protected void interrupted() {
        end();
    }
}
