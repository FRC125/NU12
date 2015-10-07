
package com.nutrons.reboundrumbledemo.subsystems;

import com.nutrons.reboundrumbledemo.RobotMap;
import com.nutrons.reboundrumbledemo.commands.drivetrain.TankDriveCmd;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * 
 * @author Camilo Gonzalez
 */
public class Drivetrain extends Subsystem {
    
    Talon driveLeft1 = new Talon(RobotMap.DRIVE_LEFT_1);
    Talon driveLeft2 = new Talon(RobotMap.DRIVE_LEFT_2);
    Talon driveRight1 = new Talon(RobotMap.DRIVE_RIGHT_1);
    Talon driveRight2 = new Talon(RobotMap.DRIVE_RIGHT_2);

    public void initDefaultCommand() {
        setDefaultCommand(new TankDriveCmd());
    }
    
    public void driveLR(double leftPower, double rightPower) {
        driveLeft1.set(leftPower);
        driveLeft2.set(leftPower);
        driveRight1.set(rightPower);
        driveRight2.set(rightPower);
    }
    
    public void stop() {
        driveLR(0,0);
    }
}

