package com.nutrons.reboundrumbledemo.subsystems;

import com.nutrons.reboundrumbledemo.RobotMap;
import com.nutrons.reboundrumbledemo.commands.drivetrain.TankDriveCmd;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Camilo Gonzalez
 */
public class Drivetrain extends Subsystem {
    
    Victor leftDrive = new Victor(RobotMap.LEFT_DRIVE);
    Victor rightDrive = new Victor(RobotMap.RIGHT_DRIVE);

    /**
     * Gets left and right value and maps it out to the correct drivetrain motors
     * @param left left drivetrain power
     * @param right right drivetrain power
     */
    public void driveLR(double left, double right) {
        leftDrive.set(left);
        rightDrive.set(right);
    }
    
    /**
     * Stops drivetrain
     */
    public void stop() {
        leftDrive.set(0);
        rightDrive.set(0);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new TankDriveCmd());
    }
}
