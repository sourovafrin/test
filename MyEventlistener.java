


import java.util.Scanner;

import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MyEventlistener extends ListenerAdapter{
	
	static Scanner my=new Scanner(System.in);
public void onMessageReceived(MessageReceivedEvent event) {
 
	if (event.getAuthor().isBot()) return;
	User user= event.getAuthor();
	
	
	Long message=event.getResponseNumber();
	MessageChannel channel=event.getChannel();

	if (message.longValue()==4){
		channel.sendMessage("ho");
	}
	
	 
	  
	

	}
		   
}
   
	  

	   

   
	
