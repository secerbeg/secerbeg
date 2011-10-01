package mainview.client.Panel;

import java.util.LinkedList;
import java.util.List;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class HorizontalPanelGenerator extends PanelGenerator
{
	public enum HorizontalPanelTypes
	{
		INTRO, CENTER_LEVEL_ONE, CENTER_LEVEL_TWO, FOOTER;

	}

	List<HorizontalPanel> hPanels;

	@Override
	protected void createPanel()
	{

		hPanels = new LinkedList<HorizontalPanel>();
		for (HorizontalPanelTypes type : HorizontalPanelTypes.values())
		{
			switch (type)
			{
			case INTRO:
				HorizontalPanel introPanel = this.addHorizontalIntroPanel();
				this.hPanels.add(introPanel);
				RootPanel.get("intro-horizontal-panel").add(introPanel);
				break;

			case CENTER_LEVEL_ONE:
				HorizontalPanel centerPanel = this.addCenterLevelOnePanel();
				this.hPanels.add(centerPanel);
				RootPanel.get("center-level-one-panel").add(centerPanel);
				break;

			case CENTER_LEVEL_TWO:
				HorizontalPanel centerTwoPanel = this.addCenterLevelTwoPanel();
				this.hPanels.add(centerTwoPanel);
				RootPanel.get("center-level-two-panel").add(centerTwoPanel);
				break;

			case FOOTER:
				HorizontalPanel footerPanel = this.addFooterPanel();
				this.hPanels.add(footerPanel);
				RootPanel.get("footer-panel").add(footerPanel);
				break;

			}
		}

	}

	@Override
	protected void addText()
	{

	}

	@Override
	protected void linkToHtml()
	{

	}

	private HorizontalPanel addHorizontalIntroPanel()
	{
		String text = "<b> This is INTRO  Horizontal Panel</b>";
		HorizontalPanel hPanel = this.getHorizontalPanelInstance();
		hPanel.setSpacing(5);
		hPanel.add(new HTML(text));

		return hPanel;
	}

	private HorizontalPanel addCenterLevelOnePanel()
	{
		String text = "<b> This is CENTER <br/> Level One Panel</b>";
		HorizontalPanel hPanel = this.getHorizontalPanelInstance();
		hPanel.setSpacing(5);
		hPanel.add(new HTML(text));
		hPanel.setHeight("220px");

		return hPanel;
	}

	private HorizontalPanel addCenterLevelTwoPanel()
	{
		String text = "<b> This is CENTER <br/> Level One Panel</b>";

		HorizontalPanel hPanel = this.getHorizontalPanelInstance();
		hPanel.setSpacing(5);
		hPanel.add(new HTML(text));
		hPanel.setHeight("235px");

		return hPanel;
	}

	private HorizontalPanel addFooterPanel()
	{
		String text = "<b> This is FOOTER <br/> Panel</b>";

		HorizontalPanel hPanel = this.getHorizontalPanelInstance();
		hPanel.setSpacing(5);
		hPanel.add(new HTML(text));
		hPanel.setHeight("100px");
		return hPanel;
	}
}
