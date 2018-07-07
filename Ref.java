import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
public class Ref {
    public static void main (String[] args) throws Exception{
    	try {
    		JDA api=new JDABuilder(AccountType.BOT).setToken("").buildAsync();
        	api.addEventListener(new MyEventlistener());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
