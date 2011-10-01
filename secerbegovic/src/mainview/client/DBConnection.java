package mainview.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("db")
public interface DBConnection extends RemoteService
{
	User authenticateUser(String user, String pass);
}