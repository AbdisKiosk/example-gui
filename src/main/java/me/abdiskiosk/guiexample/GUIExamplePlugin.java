package me.abdiskiosk.guiexample;

import eu.okaeri.platform.bukkit.OkaeriBukkitPlugin;
import eu.okaeri.platform.core.annotation.Scan;
import eu.okaeri.platform.core.plan.ExecutionPhase;
import eu.okaeri.platform.core.plan.Planned;
import me.abdiskiosk.guis.GUIManager;

@Scan(deep = true)
public class GUIExamplePlugin extends OkaeriBukkitPlugin {

    @Planned(ExecutionPhase.POST_SETUP)
    public void registerGUIListeners() {
        GUIManager.registerListeners(this);
    }
}
