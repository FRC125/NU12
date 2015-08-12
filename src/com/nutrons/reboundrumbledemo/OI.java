package com.nutrons.reboundrumbledemo;

import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorDownCmd;
import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorStopCmd;
import com.nutrons.reboundrumbledemo.commands.elevator.ElevatorUpCmd;
import com.nutrons.reboundrumbledemo.commands.shooter.ShooterOffCmd;
import com.nutrons.reboundrumbledemo.commands.shooter.ShooterOnCmd;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * 
 * @author Camilo Gonzalez
 */
public class OI {
    
    public final Joystick leftDrivePad = new Joystick(RobotMap.LEFT_DRIVE_PAD);
    public final Joystick rightDrivePad = new Joystick(RobotMap.RIGHT_DRIVE_PAD);
    public final Joystick operatorPad = new Joystick(RobotMap.OPERATOR_PAD);
    
    public Button shooterOnButton = new JoystickButton(operatorPad, 3);
    public Button shooterOffButton = new JoystickButton(operatorPad, 2);
    public Button elevatorUpButton = new JoystickButton(operatorPad, 4);
    public Button elevatorDownButton = new JoystickButton(operatorPad, 1);
    
    public final int DRIVE_LEFT_AXIS = 2;
    public final int DRIVE_RIGHT_AXIS = 2;
    public OI() {
        
        shooterOnButton.whenPressed(new ShooterOnCmd());
        shooterOffButton.whenPressed(new ShooterOffCmd());
        elevatorUpButton.whenPressed(new ElevatorUpCmd());
        elevatorUpButton.whenReleased(new ElevatorStopCmd());
        elevatorDownButton.whenPressed(new ElevatorDownCmd());
        elevatorDownButton.whenReleased(new ElevatorStopCmd());
        
    }
    
    /** 
     * Gets value for y-axis on first small joystick in driverPad
     * @return y-axis one value from driverPad
     */
    public double getDriverPadLeft() {
        return -leftDrivePad.getRawAxis(DRIVE_LEFT_AXIS);
    }
    
    /**
     * Gets value for y-axis on second small joystick in driverPad
     * @return y-axis two value from driverPad
     */
    public double getDriverPadRight() {
        return rightDrivePad.getRawAxis(DRIVE_RIGHT_AXIS);
    }
}

