package net.invisioncraft.plugins.salesmania;

import net.invisioncraft.plugins.salesmania.commands.auction.AuctionCommandExecutor;
import net.invisioncraft.plugins.salesmania.configuration.Settings;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Salesmania extends JavaPlugin {
    public Logger consoleLogger;
    public Economy economy;
    public Settings settings;

    @Override
    public void onEnable() {
        settings = new Settings(this);
        consoleLogger = this.getLogger();

        getCommand("auction").setExecutor(new AuctionCommandExecutor(this));

        consoleLogger.info("Salesmania Activated");
    }

    @Override
    public void onDisable() {

    }

    public Settings getSettings() {
        return settings;
    }
}
