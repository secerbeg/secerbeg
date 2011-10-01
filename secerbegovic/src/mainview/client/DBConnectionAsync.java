package mainview.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DBConnectionAsync
{

	void authenticateUser(String user, String pass, AsyncCallback<User> callback);

}
