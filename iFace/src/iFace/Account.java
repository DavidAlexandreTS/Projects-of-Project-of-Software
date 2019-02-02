package iFace;

public class Account
{
	private int idc;

	protected String login;
	protected String username;
	protected String password;
	protected String message;
	
	public int getIdc()
	{
		return idc;
	}

	public void setIdc(int idc)
	{
		this.idc = idc;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public void setLogin(String login)
	{
		this.login = login;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
	
}
