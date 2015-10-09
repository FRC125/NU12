package com.nutrons.reboundrumbledemo.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.nutrons.reboundrumbledemo.OI;
import com.nutrons.reboundrumbledemo.subsystems.Drivetrain;
import com.nutrons.reboundrumbledemo.subsystems.Elevator;
import com.nutrons.reboundrumbledemo.subsystems.Shooter;

/**
 * 
 * @author Camilo Gonzalez
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static Drivetrain dt = new Drivetrain();
    public static Elevator elevator = new Elevator();
    public static Shooter shooter = new Shooter();

    public static void init() {
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
