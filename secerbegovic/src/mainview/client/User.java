package mainview.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class User implements IsSerializable
{
	private String username;
	private String password;

	@SuppressWarnings("unused")
	private User()
	{
		// just here because GWT wants it.
	}

	public User(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	/**
	 * Simple Getter for username property.
	 * 
	 * @return the username.
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Simple Setter for username property.
	 * 
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * Simple Getter for password property.
	 * 
	 * @return the password.
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Simple Setter for password property.
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
}