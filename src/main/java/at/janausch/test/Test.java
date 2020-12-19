package at.janausch.test;

import at.janausch.test.commands.TestCommand;
import at.janausch.test.eventhandler.TestHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        register();

        Bukkit.getConsoleSender().sendMessage("Test geladen");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("Test entladen");
    }

    private void register(){
        //Listener
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new TestHandler(), this);

        //Commands
        Bukkit.getPluginCommand("test").setExecutor(new TestCommand());
    }
}
