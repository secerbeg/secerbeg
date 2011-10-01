package mainview.client.Panel;

import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class TabPanelGenerator extends PanelGenerator
{
	DecoratedTabPanel tPanel;

	public TabPanelGenerator()
	{

		this.tPanel = new DecoratedTabPanel();
	}

	@Override
	protected void createPanel()
	{
		this.createTabPanel();

	}

	@Override
	protected void addText()
	{

	}

	@Override
	protected void linkToHtml()
	{
		RootPanel.get("tab-panel").add(this.tPanel);
	}

	private DecoratedTabPanel createTabPanel()
	{
		// tPanel.setWidth("1093px");

		for (int i = 1; i <= 5; i++)
		{

			String panelText = "This is Panel "
					+ i
					+ " <i>This is Penl 1 Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut sit amet pede eu nulla volutpat tempor. Vestibulum porttitor. Nulla ut augue. Morbi sollicitudin elit sit amet lectus. Nullam convallis condimentum dolor. Ut viverra. Suspendisse aliquet dui ullamcorper tellus. Vestibulum eros. Praesent nec justo vitae erat imperdiet gravida. Suspendisse non ante vitae leo eleifend auctor. In lacus nulla, posuere sit amet, fringilla ut, scelerisque et, risus. Nulla ornare, lorem tempor dictum aliquam, pede justo lacinia felis, vel mattis dui lorem quis eros.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut sit amet pede eu nulla volutpat tempor. Vestibulum porttitor. Nulla ut augue. Morbi sollicitudin elit sit amet lectus. Nullam convallis condimentum dolor. Ut viverra. Suspendisse aliquet dui ullamcorper tellus. Vestibulum eros. Praesent nec justo vitae erat imperdiet gravida. Suspendisse non ante vitae leo eleifend auctor. In lacus nulla, posuere sit amet, fringilla ut, scelerisque et, risus. Nulla ornare, lorem tempor dictum aliquam, pede justo lacinia felis, vel mattis dui lorem quis eros.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut sit amet pede eu nulla volutpat tempor. Vestibulum porttitor. Nulla ut augue. Morbi sollicitudin elit sit amet lectus. Nullam convallis condimentum dolor. Ut viverra. Suspendisse aliquet dui ullamcorper tellus. Vestibulum eros. Praesent nec justo vitae erat imperdiet gravida. Suspendisse non ante vitae leo eleifend auctor. In lacus nulla, posuere sit amet, fringilla ut, scelerisque et, risus. Nulla ornare, lorem tempor dictum aliquam, pede justo lacinia felis, "
					+ "vel mattis dui lorem quis eros.Lorem ipsum dolor sit amet, consectetuer"
					+ "This is Penl 1 Lorem ipsum dolor sit amet, consectetuer adipiscing elit."
					+ " Ut sit amet pede eu nulla volutpat tempor. Vestibulum porttitor. Nulla ut augue. "
					+ "Morbi sollicitudin elit sit amet lectus. Nullam convallis condimentum dolor. Ut viverra."
					+ " Suspendisse aliquet dui ullamcorper tellus. Vestibulum eros. Praesent nec justo vitae erat "
					+ "imperdiet gravida. Suspendisse non ante vitae leo eleifend auctor. In lacus nulla, posuere sit amet,"
					+ " fringilla ut, scelerisque et, risus. Nulla ornare, lorem tempor dictum aliquam, pede justo lacinia felis, vel mattis dui lorem quis eros.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut sit amet pede eu nulla volutpat tempor. Vestibulum porttitor. Nulla ut augue. Morbi sollicitudin elit sit amet lectus. Nullam convallis condimentum dolor. Ut viverra. Suspendisse aliquet dui ullamcorper tellus. Vestibulum eros. Praesent nec justo vitae erat imperdiet gravida. Suspendisse non ante vitae leo eleifend auctor. In lacus nulla, posuere sit amet, fringilla ut, scelerisque et, risus. Nulla ornare, lorem tempor dictum aliquam, pede justo lacinia felis, vel mattis dui lorem quis eros.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut sit amet pede eu nulla volutpat tempor. Vestibulum porttitor. Nulla ut augue. Morbi sollicitudin elit sit amet lectus. Nullam convallis condimentum dolor. Ut viverra. Suspendisse aliquet dui ullamcorper tellus. Vestibulum eros. Praesent nec justo vitae erat imperdiet gravida. Suspendisse non ante vitae leo eleifend auctor. In lacus nulla, posuere sit amet, fringilla ut, scelerisque et, risus. Nulla ornare, lorem tempor dictum aliquam, pede justo lacinia felis, "
					+ "vel mattis dui lorem quis eros.Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ut sit amet pede eu nulla volutpat tempor.  adipiscing elit. Ut sit amet pede eu nulla volutpat tempor. </i> ";
			tPanel.add(new HTML(panelText), "Panel" + i);
		}

		tPanel.selectTab(0);

		// tPanel.getDeckPanel().getElement().getStyle().setBorderStyle(BorderStyle.NONE);
		return tPanel;

	}

}
