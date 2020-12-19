package at.janausch.test.eventhandler;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.awt.*;

public class TestHandler implements Listener {

    @EventHandler
     public void OnPlayerJoin (PlayerJoinEvent event){
        String PlayerName = event.getPlayer().getDisplayName();
        event.setJoinMessage("Höhö " + PlayerName + " stürzt sich ins Verderben.");
    }
    @EventHandler
    public void OnPlayerLeave (PlayerQuitEvent event){
        String PlayerName = event.getPlayer().getDisplayName();
        event.setQuitMessage("Ohoh " + PlayerName + " hat es nicht mehr ausgehalten...");
    }
}
