package Utils;

import java.util.HashMap;
import java.util.Map;

public class GenreManager {
    private static final Map<String, String> GENRES = new HashMap<>();

    static {
        GENRES.put("1", "Harem");
        GENRES.put("2", "School");
        // Thêm các thể loại khác
    }

    public static Map<String, String> getGenres() {
        return GENRES;
    }
}
