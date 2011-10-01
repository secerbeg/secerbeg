package mainview.menubar;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;

/**
 * @author mirzawork
 * 
 */
public class MenuBarHandler implements MenuBarAccessor
{

	public Command performCommand(CommandTypes commandType)
	{
		Command command = null;

		switch (commandType)
		{
		case HOME:
			command = this.homeCommand();
			break;
		case ONE:
			break;
		case TWO:
			break;
		default:
			command = this.alertCommand();
			break;

		}

		return command;
	}

	/**
	 * Menu Bar command alert action.
	 */

	public Command alertCommand()
	{

		// A command for general use
		Command command = new Command()
		{
			public void execute()
			{
				Window.alert("Command Fired");
			}
		};
		return command;

	}

	/**
	 * Menu Bar command alert action.
	 */

	public Command homeCommand()
	{

		// A command for general use
		Command command = new Command()
		{
			public void execute()
			{
				
				
				Window.alert("HOME");
			}
		};
		return command;

	}

}
