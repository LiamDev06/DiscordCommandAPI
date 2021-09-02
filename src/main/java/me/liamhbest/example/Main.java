package me.liamhbest.example;

import com.github.liamhbest0608.CommandAPI;
import me.liamhbest.example.example_commands.HelloCommand;
import me.liamhbest.example.example_commands.WelcomeCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    private static final String TOKEN = "BOT_TOKEN";
    private static JDA jda;

    public static void main(String[] args) {
        /**
         * First we create the actual discord bot
         */

        try {
            jda = JDABuilder.createDefault(TOKEN)
                    .build();
        } catch (LoginException exception){
            exception.printStackTrace();
        }

        /**
         * We need to init the command api, this can be done with this line of code
         *
         * -prefix: Prefix for your command, what must be typed before every command
         * -jda: The JDA for your bot, cannot be null
         * -value: this is more of an internal thing, this must be set to true for the bot to work
         *
         * Please only use this line of code once, have it in your main class where
         * the bot is initiated
         */

        /**
         * To add a command, just add the class here, very simple
         */

        new CommandAPI("!", jda, true);
        new HelloCommand();
        new WelcomeCommand();

        System.out.println("The bot has been loaded and is ready for use.");
    }
}















