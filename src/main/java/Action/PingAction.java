package Action;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class PingAction {
    public static void execute(SlashCommandInteractionEvent event) {
        event.reply("Pong! 🏓").queue();
    }
}
