package me.henry.healthhelper;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class HealthHelper extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Dupe-Plugin]" + " Plugin has been enabled");
        getCommand("heal").setExecutor(new commands());
        getCommand("clearNegitiveEffects").setExecutor(new commands());
        getCommand("feed").setExecutor(new commands());
        getCommand("extinguish").setExecutor(new commands());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.DARK_RED + "[Dupe-Plugin]" + " Plugin disabled");
    }
}
