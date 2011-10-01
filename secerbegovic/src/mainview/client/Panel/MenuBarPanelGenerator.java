package mainview.client.Panel;

import mainview.menubar.CommandTypes;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;

public class MenuBarPanelGenerator extends PanelGenerator
{

	@Override
	protected void createPanel()
	{
		RootPanel.get("menu-bar-panel").add(this.prepareMenus());

	}

	@Override
	protected void addText()
	{

	}

	@Override
	protected void linkToHtml()
	{

	}

	/**
	 * 
	 * @return
	 */
	private MenuBar prepareMenus()
	{

		/********** TOP MENU ************************/
		// Top-level menu
		MenuBar menutop = this.createMenuBar(false, new MenuItem("Fire One",
				this.menuBarAccessor.performCommand(CommandTypes.HOME)));
		/******************************************/

		// A command for general use
		Command command = this.menuBarAccessor.alertCommand();

		/********** MENU 2 ************************/
		MenuItem[] items = new MenuItem[3];
		items[0] = new MenuItem("Fire Two", command);
		items[1] = new MenuItem("Fire Three", command);
		items[2] = new MenuItem("Fire Four", command);

		MenuBar menutwo = this.createMenuBar(true, items);
		menutop.addItem("SubMenu", menutwo); // Creates item and adds menutwo

		MenuBar menuTwoInner = this.createMenuBar(true, new MenuItem(
				"Fire One", command));
		menutwo.addItem("SubMenu2", menuTwoInner);
		/******************************************/

		/********** MENU 3 ************************/
		MenuBar menuthree = this.createMenuBar(true, new MenuItem("Fire One",
				command));
		menutop.addItem("SubMenu3", menuthree);
		/******************************************/

		/********** MENU 4 ************************/
		MenuBar menuFour = this.createMenuBar(true, new MenuItem("Fire One",
				command));
		menutop.addItem("SubMenu4", menuFour);
		/******************************************/

		/********** MENU 5 ************************/
		MenuBar menuFive = this.createMenuBar(true, new MenuItem("Fire One",
				command));
		menutop.addItem("SubMenu4", menuFive);
		/******************************************/

		/********** MENU 6 ************************/
		MenuBar menuSix = this.createMenuBar(true, new MenuItem("Fire One",
				command));
		menutop.addItem("SubMenu4", menuSix);
		/******************************************/

		/********** MENU 7 ************************/
		MenuBar menuSeven = this.createMenuBar(true, new MenuItem("Fire One",
				command));
		menutop.addItem("SubMenu4", menuSeven);
		/******************************************/

		/********** MENU 8 ************************/
		MenuBar menuEight = this.createMenuBar(true, new MenuItem("Fire One",
				command));
		menutop.addItem("SubMenu4", menuEight);
		/******************************************/

		return menutop;
	}

	/**
	 * 
	 * @param styleName
	 * @param direction
	 * @param items
	 * @return
	 */
	private MenuBar createMenuBar(boolean direction, MenuItem... items)
	{
		MenuBar menu = new MenuBar(direction);
		for (MenuItem menuItem : items)
		{
			menu.addItem(menuItem);

		}

		return menu;
	}
}
