package mainview.menubar;

import com.google.gwt.user.client.Command;

public interface MenuBarAccessor
{
	/**
	 * Triggers alert command action with standard text.
	 * 
	 * @return command instance.
	 */
	public Command alertCommand();

	/**
	 * Triggers command action with standard text.
	 * 
	 * @param commandType
	 *            CommandType.
	 * @return command instance.
	 */
	public Command performCommand(CommandTypes commandType);

}
