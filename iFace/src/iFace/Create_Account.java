package iFace;

import java.util.ArrayList;

public class Create_Account
{
	
	public static void Create_Acc(ArrayList<Account> acc, String message,String username, String login, String password, int idacc)
	{
		Account account = new Account();
		account.setMessage(message);
		account.setUsername(username);
		account.setLogin(login);
		account.setPassword(password);
		account.setIdc(idacc);
		acc.add(account);
	}
	
}

