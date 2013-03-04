import java.util.ArrayList;

/**
 * Class to maintain log messages
 */
public class Logger
{
	protected ArrayList<String> logMessages;
	
	public Logger()
	{
		this.logMessages = new ArrayList<String>();
	}
	
	/**
	 * Adds a message to the log
	 * 
	 * @param message
	 */
	public void addLogMessage(String message)
	{
		logMessages.add(message);
	}
	
	/**
	 * Print all messages
	 */
	public void outputMessages()
	{
		for(String message : logMessages)
		{
			System.out.println(message);
		}
	}
}
