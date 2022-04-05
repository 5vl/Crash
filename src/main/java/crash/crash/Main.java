package crash.crash;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("crash").setExecutor(new CrashCommand());
    }
}
