package Controller;

import net.dv8tion.jda.api.*;
import javax.security.auth.login.LoginException;
import javax.swing.SwingUtilities;

public class Main {
    private static JDA jda;
    public static void main(String[] args) throws LoginException {
        SwingUtilities.invokeLater(BotControlPanel::createAndShowGUI);

        JDA jda = JDABuilder.createDefault(Config.TOKEN)
                .addEventListeners(new CommandHandler())
                .build();
        CommandRegistry.registerCommands(jda);

        try {
            jda.awaitReady();
            BotControlPanel.updateBotStatus("Online");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void restartBot() {
        try {
            if (jda != null) {
                jda.shutdown();
            }
            jda = JDABuilder.createDefault(Config.TOKEN)
                    .addEventListeners(new CommandHandler())
                    .build();
            CommandRegistry.registerCommands(jda);
            jda.awaitReady();
            BotControlPanel.updateBotStatus("Online");
        } catch (Exception e) {
            e.printStackTrace();
            BotControlPanel.updateBotStatus("Error");
        }
    }

    // Hàm dừng bot
    public static void stopBot() {
        if (jda != null) {
            jda.shutdown();
            BotControlPanel.updateBotStatus("Offline");
        }
    }
}
