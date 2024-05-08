package me.abdiskiosk.guiexample.gui;

import eu.okaeri.commons.bukkit.item.ItemStackBuilder;
import me.abdiskiosk.guis.gui.AutoUpdatingGUI;
import me.abdiskiosk.guis.item.gui.GUIItem;
import me.abdiskiosk.guis.state.NamedState;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class AutoExampleGUI extends AutoUpdatingGUI {

    private final NamedState<Integer> count = new NamedState<>(0, "count");

    public AutoExampleGUI() {
        super("Count: {count}", 9);
        registerPlaceholder(count);

        set(new GUIItem(Arrays.asList(3), ItemStackBuilder.of(Material.RECORD_4).withName("Fjern count").appendLore("Lige nu: {count}").get())).onClick(event -> {
            count.set(count.get() -1);
        });
        set(new GUIItem(Arrays.asList(5), ItemStackBuilder.of(Material.GREEN_RECORD).withName("Tilføj count").appendLore("Lige nu: {count}").get())).onClick(event -> {
            count.set(count.get() + 1);
        });

        count.subscribe(value -> {
            set(new GUIItem(Arrays.asList(4), new ItemStack(Material.DIAMOND, value)));
        });
    }


}