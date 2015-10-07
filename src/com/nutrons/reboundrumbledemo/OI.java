package com.nutrons.reboundrumbledemo;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * 
 * @author Camilo Gonzalez
 */
public class OI {
    
    Joystick driver = new Joystick(1);
    
    public OI() {

    }
    
    public double getLeftDrive() {
        return driver.getRawAxis(2);
    }
    
    public double getRightDrive() {
        return -driver.getRawAxis(4);
    }
    
}

