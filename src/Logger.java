import java.util.ArrayList;


public class Logger
{
	protected ArrayList<String> logMessages;
	
	public Logger()
	{
		this.logMessages = new ArrayList<String>();
	}
	
	public void addLogMessage(String message)
	{
		logMessages.add(message);
	}
	
	public void outputMessages()
	{
		for(String message : logMessages)
		{
			System.out.println(message);
		}
	}
}
