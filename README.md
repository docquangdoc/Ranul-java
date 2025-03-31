# Ranul-bot

## Introduction
Rbot is a Discord bot developed in Java, using the [JDA](https://github.com/DV8FromTheWorld/JDA) library to interact with the Discord API.

## System Requirements
- Java 20 or higher
- Maven
- A Discord bot with a valid token

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/Rbot.git
   cd Rbot
   ```
2. Create a `.env` file in the root directory and add your bot token:
   ```env
   TOKEN=YOUR_TOKEN
   CLIENT_ID=BOT_ID
   ```
3. Build the project using Maven:
   ```sh
   mvn clean package
   ```
4. Run the bot:
   ```sh
   java -jar target/Rbot-1.0-SNAPSHOT.jar
   ```

## Project Structure
```
Rbot/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Controller/  
│   │   │   │   ├── Main.java
│   │   │   │   ├── Config.java
│   │   │   │   ├── CommandHandler.java
│   │   │   │   ├── CommandRegistry.java
│   │   │   │   ├── BotControlPanel.java
│   │   │   ├── Commands/  
│   │   │   │   ├── PingCommand.java
│   │   │   │   ├── HelloCommand.java
│   │   │   │   ├── BaseCommand.java
│   │   │   │   ├── SearchCommand.java
│   │   │   ├── Action/  
│   │   │   │   ├── PingAction.java
│   │   │   │   ├── HelloAction.java
│   │   │   │   ├── SearchAction.java
│   │   │   ├── Utils/  
│   │   │   │   ├── GenreManager.java
```

## Dependencies
The project uses the following libraries:
- **JDA** (5.0.0-beta.12) - Connects to the Discord API
- **dotenv-java** (2.2.0) - Manages environment variables
- **javax.annotation-api** (1.3.2) - Provides annotation support in Java

## Contribution
If you want to contribute to the project, please fork the repository and submit a pull request!

## License
This project is licensed under the MIT License.

