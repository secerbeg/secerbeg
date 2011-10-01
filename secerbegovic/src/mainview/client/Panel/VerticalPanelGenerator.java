package mainview.client.Panel;

import org.apache.commons.lang.StringUtils;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.StackPanel;

;

public class VerticalPanelGenerator extends PanelGenerator
{
	StackPanel panel;

	public VerticalPanelGenerator()
	{
		this.panel = new StackPanel();
	}

	public enum VerticalPanelLabels
	{
		ONE, TWO, THREE;

	}

	@Override
	protected void createPanel()
	{

		for (VerticalPanelLabels labelType : VerticalPanelLabels.values())
		{
			Label label = this.createLabel(this.getText(labelType));
			this.panel.add(label, labelType.toString(), false);
		}
		this.panel.setSize("110px", "240px");

	}

	@Override
	protected void addText()
	{

	}

	@Override
	protected void linkToHtml()
	{
		RootPanel.get("vertical-left-panel").add(this.panel);
	}

	private Label createLabel(String text)
	{
		return new Label(text);
	}

	private String getText(VerticalPanelLabels label)
	{
		String text = StringUtils.EMPTY;
		switch (label)
		{

		case ONE:
			text = "This is text for first layer";

			break;
		case TWO:

			text = "This is text for second layer";
			break;
		case THREE:

			text = "This is text for third layer";
			break;
		}
		return text;
	}

}
