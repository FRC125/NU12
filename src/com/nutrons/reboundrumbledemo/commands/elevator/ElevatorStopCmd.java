package com.nutrons.reboundrumbledemo.commands.elevator;

import com.nutrons.reboundrumbledemo.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class ElevatorStopCmd extends CommandBase {
    
    public ElevatorStopCmd() {
        requires(elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
        elevator.setPower(0);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
