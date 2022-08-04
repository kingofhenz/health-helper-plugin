package me.henry.healthhelper;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.HumanEntity;


public class commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command cmd,String label,  String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
        }
        if (cmd.getName().equalsIgnoreCase("heal")){
            //a player can only use this command if they are a player
            // heals the player
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.setHealth(20);
            }
        }
        //makes the player get their hunger level back to full
        if (cmd.getName().equalsIgnoreCase("feed")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.setFoodLevel(20);
                player.setSaturation(20);
            }
        }
        //makes the player not be on fire
        if (cmd.getName().equalsIgnoreCase("extinguish")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.setFireTicks(0);
            }
        }
        //removes all negitive effects from the player
        if (cmd.getName().equalsIgnoreCase("clearNegitiveEffects")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.BLINDNESS);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.CONFUSION);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.HARM);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.HUNGER);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.POISON);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.SLOW);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.SLOW_DIGGING);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.WEAKNESS);
                player.removePotionEffect(org.bukkit.potion.PotionEffectType.WITHER);
            }
        }


        return true;
    }
}