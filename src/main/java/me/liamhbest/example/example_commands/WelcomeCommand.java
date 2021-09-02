package me.liamhbest.example.example_commands;

import com.github.liamhbest0608.BotCommand;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

import java.util.Arrays;

// Start by extending the bot command class
public class WelcomeCommand extends BotCommand {

    // Insert the actual command here, do not insert it with the prefix
    // Feel free to add aliases as well
    public WelcomeCommand(){
        super("welcome", Arrays.asList("welcomehere", "welcometoserver"));
    }

    //Implement the onCommand method, this will be called everytime the command you specified above is executed
    @Override
    public void onCommand(Member member, Message message, TextChannel channel, String[] args) {
        channel.sendMessage("Welcome to the server fella!").queue();
    }
}



