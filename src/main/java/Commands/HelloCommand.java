package Commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import Action.HelloAction;

public class HelloCommand implements BaseCommand {
    @Override
    public void execute(SlashCommandInteractionEvent event) {
        HelloAction.execute(event);
    }
}
