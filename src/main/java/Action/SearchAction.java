package Action;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import java.util.Map;
import Utils.GenreManager;


public class SearchAction {
    public static void execute(SlashCommandInteractionEvent event) {
        String genre = event.getOption("genre").getAsString();
        String genreId = getGenreId(genre);

        if (genreId == null) {
            event.reply("Thể loại không hợp lệ!").queue();
            return;
        }

        String searchUrl = "https://vi-hentai.com/tim-kiem?sort=-updated_at&filter%5Baccept_genres%5D=" + genreId;
        event.reply("🔍 Kết quả tìm kiếm: " + searchUrl).queue();
    }

    private static String getGenreId(String genreName) {
        for (Map.Entry<String, String> entry : GenreManager.getGenres().entrySet()) {
            if (entry.getValue().equalsIgnoreCase(genreName)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
