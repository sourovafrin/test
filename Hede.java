import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
public class Hede {
    public static void main (String[] args) throws Exception{
    	try {
    		JDA api=new JDABuilder(AccountType.BOT).setToken("NDY0MTg3NDc5Mzk4OTQwNjcy.DiFJDg.0lsiFTOckXsLQjUub1HLMKWPeCs").buildAsync();
        	api.addEventListener(new MyEventlistener());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
