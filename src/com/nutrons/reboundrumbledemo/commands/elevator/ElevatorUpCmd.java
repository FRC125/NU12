package com.nutrons.reboundrumbledemo.commands.elevator;

import com.nutrons.reboundrumbledemo.commands.CommandBase;

/**
 *
 * @author Camilo Gonzalez
 */
public class ElevatorUpCmd extends CommandBase {
    
    public ElevatorUpCmd() {
        requires(elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
        elevator.moveUp();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        elevator.stop();
    }

    protected void interrupted() {
    }
}
