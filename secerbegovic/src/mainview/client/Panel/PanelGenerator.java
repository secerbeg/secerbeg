package mainview.client.Panel;

import mainview.client.DBConnectionAsync;
import mainview.menubar.MenuBarAccessor;
import mainview.menubar.MenuBarHandler;

import com.google.gwt.user.client.ui.HorizontalPanel;

public abstract class PanelGenerator
{

	public MenuBarAccessor menuBarAccessor = new MenuBarHandler();
	public DBConnectionAsync dpRpc;

	protected abstract void createPanel();

	protected abstract void addText();

	protected abstract void linkToHtml();

	public void generate()
	{
		this.createPanel();
		this.addText();
		this.linkToHtml();
	}

	public HorizontalPanel getHorizontalPanelInstance()
	{
		return new HorizontalPanel();
	}

}
