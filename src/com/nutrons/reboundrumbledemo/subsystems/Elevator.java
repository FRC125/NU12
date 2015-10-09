package com.nutrons.reboundrumbledemo.subsystems;

import com.nutrons.reboundrumbledemo.RobotMap;
import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorStopCmd;
import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorUpCmd;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Camilo Gonzalez
 */
public class Elevator extends Subsystem {
    
    Victor driveElevator = new Victor(RobotMap.DRIVE_ELEVATOR);
    
    DigitalInput elevatorUpButton = new DigitalInput(RobotMap.ELEVATOR_UP_BUTTON);
    DigitalInput elevatorDownButton = new DigitalInput(RobotMap.ELEVATOR_DOWN_BUTTON);

    public void initDefaultCommand() {
        setDefaultCommand(new ElevatorStopCmd());
    }
    
    public boolean isElevatorUp() {
        if(elevatorUpButton.get()) {
            return false;
        }else {
            return true;
        }
    }
    
    public boolean isElevatorDown() {
        if(elevatorDownButton.get()) {
            return false;
        }else {
            return true;
        }
    }
    
    public void setPower(double power) {
        driveElevator.set(power);
    }
    
    public void stop() {
        setPower(0);
    }
}
