package iFace;

import java.util.ArrayList;

public class Friendship_Request extends Account
{
	private int have;
	
	String sender;
	String recipient;
	
	public int getHave()
	{
		return have;
	}

	public void setHave(int have)
	{
		this.have = have;
	}

	public String getSender()
	{
		return sender;
	}
	
	public void setSender(String sender)
	{
		this.sender = sender;
	}
	
	public String getRecipient()
	{
		return recipient;
	}
	
	public void setRecipient(String recipient)
	{
		this.recipient = recipient;
	}
	
	public static void Send_Request(ArrayList<Friendship_Request> requests, int have, String sender, String recipient)
	{
		Friendship_Request re_friends = new Friendship_Request();
		re_friends.setHave(have);
		re_friends.setSender(sender);
		re_friends.setRecipient(recipient);
		requests.add(re_friends);
	}
	
}
