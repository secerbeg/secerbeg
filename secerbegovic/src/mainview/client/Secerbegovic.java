package mainview.client;

import java.util.LinkedList;
import java.util.List;

import mainview.client.Panel.HorizontalPanelGenerator;
import mainview.client.Panel.LoginPanelGenerator;
import mainview.client.Panel.MenuBarPanelGenerator;
import mainview.client.Panel.PanelGenerator;
import mainview.client.Panel.TabPanelGenerator;
import mainview.client.Panel.VerticalPanelGenerator;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Secerbegovic implements EntryPoint
{

	List<PanelGenerator> panels;

	private DBConnectionAsync rpc;

	public Secerbegovic()
	{
		this.panels = new LinkedList<PanelGenerator>();
		rpc = (DBConnectionAsync) GWT.create(DBConnection.class);
		// ServiceDefTarget target = (ServiceDefTarget) rpc;
		//
		// String moduleRelativeURL = GWT.getModuleBaseURL() +
		// "DBConnectionImpl";
		// target.setServiceEntryPoint(moduleRelativeURL);

	}

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{

		this.initialize();
		this.buildLayout();

	}

	private void initialize()
	{
		this.panels.add(new HorizontalPanelGenerator());
		this.panels.add(new LoginPanelGenerator());
		this.panels.add(new MenuBarPanelGenerator());
		this.panels.add(new TabPanelGenerator());
		this.panels.add(new VerticalPanelGenerator());
	}

	private void buildLayout()
	{
		for (PanelGenerator panel : this.panels)
		{
			panel.dpRpc = this.rpc;
			panel.generate();

		}
	}

}