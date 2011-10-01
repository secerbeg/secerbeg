package mainview.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.HasDirection.Direction;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Login extends Composite
{
	private PasswordTextBox passwordBox;
	private TextBox textBoxUsername;
	private Button signinButton;
	private String username;
	private String password;
	Hidden hidden;
	private Label lblNewLabel;

	public Login(final DBConnectionAsync rpc)
	{
		this.handleLogin(rpc);
	}

	/**
	 *  Handels login process
	 *  
	 * @param Async instance.
	 */
	private void handleLogin(final DBConnectionAsync rpc)
	{
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setStyleName("body");
		this.initWidget(verticalPanel);
		verticalPanel.setSize("428px", "65px");

		Grid grid = this.setupGrid();
		verticalPanel.add(grid);

		signinButton = new Button("Sign In");
		signinButton.addClickHandler(this.signInButtonHandler(rpc));

		textBoxUsername = new TextBox();
		textBoxUsername.setVisibleLength(10);

		textBoxUsername.addClickHandler(new ClickHandler()
		{
			public void onClick(ClickEvent event)
			{

			}
		});

		Label lblNewLabel_1 = new Label("Username:");
		lblNewLabel_1.setStyleName("gwt-Label-Login");
		lblNewLabel_1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		lblNewLabel_1.setDirection(Direction.LTR);
		grid.setWidget(1, 0, lblNewLabel_1);
		lblNewLabel_1.setSize("75px", "30px");

		grid.setWidget(1, 1, textBoxUsername);
		textBoxUsername.setSize("100px", "15px");

		Label lblNewLabel_2 = new Label("Password:");
		grid.setWidget(1, 2, lblNewLabel_2);
		lblNewLabel_2.setSize("68px", "21px");

		passwordBox = new PasswordTextBox();
		passwordBox.setVisibleLength(10);
		grid.setWidget(1, 3, passwordBox);
		passwordBox.setSize("100px", "15px");
		grid.setWidget(2, 0, signinButton);
		signinButton.setSize("70px", "30px");

		this.setGridPosition(grid);
	}

	private Grid setupGrid()
	{
		Grid grid = new Grid(3, 4);
		grid.setBorderWidth(0);
		grid.setStyleName("gwt-Label-Login");

		grid.setSize("428px", "50px");
		grid.getCellFormatter().setWidth(1, 0, "50");
		grid.getCellFormatter().setHorizontalAlignment(1, 0,
				HasHorizontalAlignment.ALIGN_LEFT);

		lblNewLabel = new Label("");
		grid.setWidget(2, 1, lblNewLabel);

		this.hidden = new Hidden("Hidden name");
		grid.setWidget(2, 3, hidden);
		return grid;
	}

	private void setGridPosition(Grid grid)
	{
		grid.getCellFormatter().setVerticalAlignment(1, 2,
				HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(1, 0,
				HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setHorizontalAlignment(1, 1,
				HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setHorizontalAlignment(1, 3,
				HasHorizontalAlignment.ALIGN_CENTER);
		grid.getCellFormatter().setVerticalAlignment(1, 1,
				HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setVerticalAlignment(1, 3,
				HasVerticalAlignment.ALIGN_MIDDLE);
		grid.getCellFormatter().setHorizontalAlignment(2, 0,
				HasHorizontalAlignment.ALIGN_CENTER);
	}

	private ClickHandler signInButtonHandler(final DBConnectionAsync rpc)
	{

		return new ClickHandler()
		{

			public void onClick(ClickEvent event)
			{
				if (textBoxUsername.getText().length() == 0
						|| passwordBox.getText().length() == 0)
				{
					Window.alert("Username or password is empty.");
				} else
				{
					AsyncCallback<User> callback = this.setupCallbackActions();
					rpc.authenticateUser(textBoxUsername.getText(),
							passwordBox.getText(), callback);

				}

			}

			private AsyncCallback<User> setupCallbackActions()
			{
				AsyncCallback<User> callback = new AsyncCallback<User>()
				{

					public void onFailure(Throwable caught)
					{

						Window.alert("Unable to complete your request. PLease try again later.");
						System.out.println(caught.getStackTrace());
						System.out.println(caught.getMessage());
						System.out.println(caught.getCause());

					}

					public void onSuccess(User result)
					{

						if (result != null)
						{
							lblNewLabel.setText("Welcome: "
									+ result.getUsername());
							passwordBox.setReadOnly(true);
							textBoxUsername.setReadOnly(true);
						} else
						{
							lblNewLabel.setText("Please try again");
						}

					}
				};
				return callback;
			}

		};

	}

}
