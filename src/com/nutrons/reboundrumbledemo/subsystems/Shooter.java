package com.nutrons.reboundrumbledemo.subsystems;

import com.nutrons.reboundrumbledemo.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Camilo Gonzalez
 */
public class Shooter extends Subsystem {
    
    Solenoid bolt = new Solenoid(RobotMap.BOLT);
    
    Talon shooter1 = new Talon(RobotMap.SHOOTER_1);
    Talon shooter2 = new Talon(RobotMap.SHOOTER_2);

    public void initDefaultCommand() {
    
    }
    
    public void pushBolt() {
        bolt.set(true);
    }
    
    public void retractBolt() {
        bolt.set(false);
    }
    
    public void setShooterPower(double power) {
        shooter1.set(power);
        shooter2.set(power);
    }
    
    public void stop() {
        setShooterPower(0);
    }
    
}
