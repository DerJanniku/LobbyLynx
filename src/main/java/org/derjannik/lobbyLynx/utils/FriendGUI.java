package org.derjannik.lobbyLynx.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class FriendGUI {
    private Inventory inventory;

    public FriendGUI(Player player) {
        inventory = Bukkit.createInventory(null, 9, "Freunde");
    }

    public void updateGUI() {
        // Aktualisieren der Freundesliste-GUI
    }
}