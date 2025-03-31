package Commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public interface BaseCommand {
    void execute(SlashCommandInteractionEvent event);
}
