package com.nutrons.reboundrumbledemo;

import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorDownCmd;
import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorStopCmd;
import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorUpCmd;
import com.nutrons.reboundrumbledemo.commands.shooter.PushDiskCmd;
import com.nutrons.reboundrumbledemo.commands.shooter.ShooterFastCmd;
import com.nutrons.reboundrumbledemo.commands.shooter.ShooterStopCmd;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * 
 * @author Camilo Gonzalez
 */
public class OI {
    
    Joystick driver = new Joystick(1);
    
    Button elevatorUp = new JoystickButton(driver, 6);
    Button elevatorDown = new JoystickButton(driver, 8);
    Button elevatorStop = new JoystickButton(driver, 3);
    Button pushDisk = new JoystickButton(driver, 2);
    Button shooterFast = new JoystickButton(driver, 5);
    Button shooterStop = new JoystickButton(driver, 1);
    
    public OI() {
        
        elevatorUp.whenPressed(new ElevatorUpCmd());
        elevatorDown.whenPressed(new ElevatorDownCmd());
        pushDisk.whenPressed(new PushDiskCmd());
        shooterFast.whenPressed(new ShooterFastCmd());
        shooterStop.whenPressed(new ShooterStopCmd());
        
    }
    
    public double getLeftDrive() {
        return driver.getRawAxis(2);
    }
    
    public double getRightDrive() {
        return -driver.getRawAxis(4);
    }
    
}

