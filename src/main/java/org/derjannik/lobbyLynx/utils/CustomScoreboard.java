package org.derjannik.lobbyLynx.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class CustomScoreboard {
    private JavaPlugin plugin;

    public CustomScoreboard(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void setScoreboard(Player player) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Objective objective = board.registerNewObjective("test", "dummy", "ServerName");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score rankScore = objective.getScore("{Rank} | " + player.getName());
        rankScore.setScore(2);

        player.setScoreboard(board);
    }
}