package mainview.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mainview.client.DBConnection;
import mainview.client.User;
import mainview.shared.LoginUtil;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class DBConnectionImpl extends RemoteServiceServlet implements
		DBConnection

{
	private static final long serialVersionUID = -3450295267675544585L;

	private String url = "jdbc:mysql://localhost/databasetest";
	private String user = "msecerbe";
	private String pass = "msecerbe";

	private Connection connect()
	{
		Connection conn = null;

		try
		{

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, user, pass);

		} catch (Throwable e)
		{
			// DO nothing yet
		}

		return conn;
	}

	public User authenticateUser(String username, String pass)
	{
		// Connection conn = this.connect();

		User user = this.validate(username, pass);

		// try
		// {
		// PreparedStatement ps = conn
		// .prepareStatement("select * from person where firstname ='"
		// + username + " AND " + "lastname = '" + pass + "'");
		// ResultSet result = ps.executeQuery();
		// while (result.next())
		// {
		// user = new User(result.getString(1), result.getString(2));
		// }
		//
		// result.close();
		// ps.close();
		// } catch (SQLException sqle)
		// {
		// // do stuff on fail
		// }
		return user;
	}

	private User validate(String username, String password)
	{
		User user = null;

		LoginUtil util = new LoginUtil();
		if (util.getLoginMap().containsKey(username)
				&& util.getLoginMap().containsValue(password))
		{
			user = new User(username, password);
		}
		return user;
	}

}