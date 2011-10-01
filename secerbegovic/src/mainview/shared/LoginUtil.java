package mainview.shared;

import java.util.HashMap;
import java.util.Map;


public class LoginUtil
{

	Map<String, String> loginMap;

	public LoginUtil()
	{
		loginMap = new HashMap<String, String>();
		this.loginMap.put("msecerbe", "natomas");
		this.loginMap.put("secerbeg", "elkgrove");
	}

	/**
	 * Simple Getter for loginMap property.
	 * 
	 * @return the loginMap.
	 */
	public Map<String, String> getLoginMap()
	{
		return this.loginMap;
	}

}
