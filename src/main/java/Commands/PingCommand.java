package Commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import Action.PingAction;

public class PingCommand implements BaseCommand {
    @Override
    public void execute(SlashCommandInteractionEvent event) {
        PingAction.execute(event);
    }
}
