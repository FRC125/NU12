package com.nutrons.reboundrumbledemo;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * 
 * @author Camilo Gonzalez
 */
public class OI {
    
    public final Joystick driverPad = new Joystick(RobotMap.DRIVER_PAD);
    
    public OI() {
        
    }
    
    /** 
     * Gets value for y-axis on first small joystick in driverPad
     * @return y-axis one value from driverPad
     */
    public double getDriverPadLeft() {
        return driverPad.getRawAxis(2);
    }
    
    /**
     * Gets value for y-axis on second small joystick in driverPad
     * @return y-axis two value from driverPad
     */
    public double getDriverPadRight() {
        return driverPad.getRawAxis(4);
    }
}

