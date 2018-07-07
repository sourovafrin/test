import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MyEventlistener extends ListenerAdapter{
	
	
public void onMessageReceived(MessageReceivedEvent event) {
 
	if (event.getAuthor().isBot()) return;
	User user= event.getAuthor();
	
	
	Message message=event.getMessage();
	MessageChannel channel=event.getChannel();

	if (message.getContentRaw().equals("hi")){
		channel.sendMessage(user+"hello");
	}
	
	 
	  
	

	}
		   
}
   
	  

	   

   
	
