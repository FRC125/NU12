package com.nutrons.reboundrumbledemo.subsystems;

import com.nutrons.reboundrumbledemo.RobotMap;
import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorStopCmd;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Camilo Gonzalez
 */
public class Elevator extends Subsystem {

    public static int ELEVATOR_SPEED = 1;
    
    Victor elevator1 = new Victor(RobotMap.ELEVATOR_1);
    Victor elevator2 = new Victor(RobotMap.ELEVATOR_2);
    
    public void moveUp() {
        elevator1.set(-ELEVATOR_SPEED);
        elevator2.set(ELEVATOR_SPEED);
    }
    
    public void moveDown() {
        elevator1.set(ELEVATOR_SPEED);
        elevator2.set(-ELEVATOR_SPEED);
    }
    
    public void stop() {
        elevator1.set(0);
        elevator2.set(0);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new ElevatorStopCmd());
    }
}
