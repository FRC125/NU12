package com.nutrons.reboundrumbledemo.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.nutrons.reboundrumbledemo.OI;
import com.nutrons.reboundrumbledemo.subsystems.Drivetrain;

/**
 * 
 * @author Camilo Gonzalez
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static Drivetrain dt = new Drivetrain();

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
