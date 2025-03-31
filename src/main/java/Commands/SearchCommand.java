package Commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import Action.SearchAction;
import Utils.GenreManager;


public class SearchCommand implements BaseCommand {

    public void execute(SlashCommandInteractionEvent event) {
        SearchAction.execute(event);
    }
    public static SlashCommandData getCommandData() {
        OptionData genreOption = new OptionData(OptionType.STRING, "genre", "Thể loại bạn muốn tìm", true);
        for (String genre : GenreManager.getGenres().values()) {
            genreOption.addChoice(genre, genre);
        }

        return Commands.slash("search", "Tìm kiếm hentai theo thể loại").addOptions(genreOption);

    }
}
