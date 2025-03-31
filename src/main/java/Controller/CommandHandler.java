package Controller;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import Commands.*;
import java.util.HashMap;
import java.util.Map;

public class CommandHandler extends ListenerAdapter {
    private final Map<String, BaseCommand> commands = new HashMap<>();

    public CommandHandler() {
        commands.put("ping", new PingCommand());
        commands.put("hello", new HelloCommand());
        commands.put("Search", new SearchCommand());
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        BaseCommand command = commands.get(event.getName());
        if (command != null) {
            command.execute(event);
        } else {
            event.reply("Lệnh không hợp lệ! ❌").queue();
        }
    }
}
