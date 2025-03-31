package Action;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class HelloAction {
    public static void execute(SlashCommandInteractionEvent event) {
        event.reply("Xin chào! 👋").queue();
    }
}
