package mainview.client.Panel;

import mainview.client.Login;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class LoginPanelGenerator extends PanelGenerator
{
	private HorizontalPanel hPanel;

	@Override
	protected void createPanel()
	{
		this.hPanel = this.getHorizontalPanelInstance();
		hPanel.add(new Login(this.dpRpc));

	}

	@Override
	protected void addText()
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void linkToHtml()
	{
		RootPanel.get("login-panel").add(this.hPanel);

	}

}
