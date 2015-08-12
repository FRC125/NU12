/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nutrons.reboundrumbledemo.subsystems;

import com.nutrons.reboundrumbledemo.RobotMap;
import com.nutrons.reboundrumbledemo.commands.shooter.ShooterOffCmd;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Camilo Gonzalez
 */
public class Shooter extends Subsystem {
    
    public static final double SHOOTER_SPEED = -1;
    
    Jaguar shooter1 = new Jaguar(RobotMap.SHOOTER_1);
    Jaguar shooter2 = new Jaguar(RobotMap.SHOOTER_2);
    
    public void shooterOn() {
        shooter1.set(SHOOTER_SPEED);
        shooter2.set(SHOOTER_SPEED);
    }
    
    public void stop() {
        shooter1.set(0);
        shooter2.set(0);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new ShooterOffCmd());
    }
}
