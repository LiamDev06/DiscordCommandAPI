package me.liamhbest.example.example_commands;

import com.github.liamhbest0608.BotCommand;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

// Start by extending the bot command class
public class HelloCommand extends BotCommand {

    // Insert the actual command here, do not insert it with the prefix
    public HelloCommand(){
        super("hello");
    }

    //Implement the onCommand method, this will be called everytime the command you specified above
    //is executed
    public void onCommand(Member member, Message message, TextChannel channel, String[] args) {
        channel.sendMessage("Hello there! I hope you are great today, I am at least!").queue();
        channel.sendMessage("I hope you like using the Command API!").queue();
    }
}











