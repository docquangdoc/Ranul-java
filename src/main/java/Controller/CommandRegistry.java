package Controller;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class CommandRegistry {
    public static void registerCommands(JDA jda) {
        jda.updateCommands().addCommands(
                Commands.slash("ping", "Trả về Pong!"),
                Commands.slash("hello", "Chào bạn!"),
                Commands.slash("Search", "")
        ).queue();
    }
}
