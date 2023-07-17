package net.mov51.waterloggedendermen.listeners;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTeleportEvent;

public class EntityTeleportEventListener implements Listener {
    @EventHandler
    public void onEntityTeleportEvent(EntityTeleportEvent event) {
        if(event.getTo() == null){
            return;
        }
        if(!(event.getEntity().getType() == EntityType.ENDERMAN)){
            return;
        }
        Block block = event.getTo().clone().add(0,-1,0).getBlock();
        if (block.getBlockData() instanceof Waterlogged){
            if(((Waterlogged) block.getBlockData()).isWaterlogged()){
                event.setCancelled(true);
            }
        }
    }
}
