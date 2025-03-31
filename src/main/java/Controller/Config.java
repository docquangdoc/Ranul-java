package Controller;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv dotenv = Dotenv.load();
    public static final String TOKEN = dotenv.get("TOKEN");
    public static final String CLIENT_ID = dotenv.get("CLIENT_ID");
//    public static final String GUILD_ID = dotenv.get("GUILD_ID");
}
