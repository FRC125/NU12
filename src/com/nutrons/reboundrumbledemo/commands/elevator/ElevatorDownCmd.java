package com.nutrons.reboundrumbledemo.commands.elevator;

import com.nutrons.reboundrumbledemo.commands.CommandBase;
import edu.wpi.first.wpilibj.Timer;


/**
 *
 * @author Camilo Gonzalez
 */
public class ElevatorDownCmd extends CommandBase {
    
    Timer timer = new Timer();
    
    public ElevatorDownCmd() {
        requires(elevator);
    }

    protected void initialize() {
        timer.start();
    }

    protected void execute() {
        elevator.setPower(1);
    }

    protected boolean isFinished() {
        return timer.get() > 1.5;
    }

    protected void end() {
        elevator.stop();
        timer.stop();
        timer.reset();
    }

    protected void interrupted() {
        end();
    }
}
