package me.abdiskiosk.guiexample.cmd;

import eu.okaeri.commands.annotation.Command;
import eu.okaeri.commands.annotation.Context;
import eu.okaeri.commands.annotation.Executor;
import eu.okaeri.commands.service.CommandService;
import me.abdiskiosk.guiexample.gui.AutoExampleGUI;
import org.bukkit.entity.Player;

@Command(label = "gui")
public class GUICMD implements CommandService {

    @Executor
    public void __(@Context Player player) {
        new AutoExampleGUI().open(player);
    }
}
