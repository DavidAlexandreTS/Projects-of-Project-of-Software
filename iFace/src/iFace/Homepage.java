package iFace;

import java.util.ArrayList;
import java.util.Scanner;

public class Homepage
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args [])
	{
		ArrayList<Account> acount = new ArrayList<Account>();
		ArrayList<Profile> profile = new ArrayList<Profile>();
		Scanner adc = new Scanner(System.in);
		System.out.println("Welcome to IFACE");
		int idacc = 1, idprofile = 1;
		String username, login, password, birthday, bio, addres, choice;
		while(true)
		{
			System.out.println("What do you want to do?\n" + 
					"1. To Create a Account\n" +
					"2. To Edit or Create an Profile\n" +
					"3. To Add an Friend\n" +
					"4. To send an Message\n" +
					"5. To Create an Community\n" +
					"6. To Add members to an Community\n" +
					"7. View Profile Information\n" +
					"8. To Delete an Perfil\n" +
					"0. To Close the iFace");
			choice = adc.nextLine();
			
			if(choice.equals("1"))
			{
				System.out.println("To create an account please provide the data below(Login, Username and Password respectively");
				while(true)
				{
					login = adc.nextLine();
					username = adc.nextLine();
					password = adc.nextLine();
					
					int i = 0, est = 0;
					while(i < acount.size())
					{
						if(acount.get(i).getLogin().equals(login))
						{
							System.out.println("We already have a registered user with this Login. How about trying another one?");
							est = 1;
							break;
						}
						i ++;
					}
					
					if(est == 0)
					{
						Create_Account.Create_Acc(acount, username, login, password, idacc);
						System.out.println("New Account successfully registered!");
						idacc ++;
						break;
					}
				}
			}else if(choice.equals("2"))
			{
				System.out.println("Hello, to create a profile you need to have an iFace account,"
						+ " if you do not already have an account Type 1,"
						+ " if you already have and just want to Create a Profile Type 2" + " and if you want edit a Profile Type 3.");
				
				String newchoice;
				newchoice = adc.nextLine();
				
				if(newchoice.equals("1"))
				{
					System.out.println("To create an account please provide the data below(Login, Username and Password respectively");
					
					while(true)
					{
						login = adc.nextLine();
						username = adc.nextLine();
						password = adc.nextLine();
						
						int i = 0, est = 0;
						while(i < acount.size())
						{
							if(acount.get(i).getLogin().equals(login))
							{
								System.out.println("We already have a registered user with this Login. How about trying another one?");
								est = 1;
								break;
							}
							i ++;
						}
						
						if(est == 0)
						{
							Create_Account.Create_Acc(acount, username, login, password, idacc);
							System.out.println("New Account successfully registered!");
							idacc ++;
							break;
						}
					}
					
					for(int i = 0; i < acount.size(); i ++)
					{
					    if(acount.get(i).getLogin().equals(login))
					    {
					    	if(acount.get(i).getPassword().equals(password))
					    	{
					    		idprofile = acount.get(i).getIdacc();
					    	}
					    }
					}
					
					System.out.println("Now that you have an account in the iFace you can finally create a Profile ^^");
					System.out.println("Enter the date of your birthday, a small biography and its address respectively");
					birthday = adc.nextLine();
					bio = adc.nextLine();
					addres = adc.nextLine();
					Create_Profile.CreateProfile(profile, birthday, bio, addres, idprofile);
					System.out.println("New Profile successfully registered");
					
				}else if(newchoice.equals("2"))
				{
					System.out.println("To proceed please enter your iFace Login and Password");
					while(true)
					{
						login = adc.nextLine();
						password = adc.nextLine();
						int yes = 0;
						
						for(int i = 0; i < acount.size(); i ++)
						{
						    if(acount.get(i).getLogin().equals(login))
						    {
						    	if(acount.get(i).getPassword().equals(password))
						    	{
						    		idprofile = acount.get(i).getIdacc();
						    		yes = 1;
						    	}
						    }
						}
						
						if(yes != 1)
						{
							System.out.println("The account you reported does not exist or is incorrect, please try again.");
						}else
						{
							break;
						}
					}
					
					System.out.println("Enter the date of your birthday, a small biography and its address respectively");
					birthday = adc.nextLine();
					bio = adc.nextLine();
					addres = adc.nextLine();
					Create_Profile.CreateProfile(profile, birthday, bio, addres, idprofile);
					System.out.println("New Profile successfully registered");
					
				}else if(newchoice.equals("3"))
				{
					System.out.println("To edit your profile you must enter the Login and Password...");
					login = adc.nextLine();
					password = adc.nextLine();
					
					for(int i = 0; i < acount.size(); i ++)
					{
					    if(acount.get(i).getLogin().equals(login))
					    {
					    	if(acount.get(i).getPassword().equals(password))
					    	{
					    		idprofile = acount.get(i).getIdacc();
					    	}
					    }
					}
					
					System.out.println("What changes do you want to make?");
					System.out.println("To change the Birthday press 1, the Biography press 2, the Addres press 3 and for all press 4");
					String ent = adc.nextLine();
					if(ent.equals("1"))
					{
						birthday = adc.nextLine();
						profile.get(idprofile - 1).setBirthday(birthday);
						//Create_Profile.CreateProfile(profile, birthday, bio, addres, idprofile);
						System.out.println("Birthday changed with success!");
					}else if(ent.equals("2"))
					{
						bio = adc.nextLine();
						profile.get(idprofile - 1).setBio(bio);
						System.out.println("Biography changed with success!");
					}else if(ent.equals("3"))
					{
						addres = adc.nextLine();
						profile.get(idprofile - 1).setAddres(addres);
						System.out.println("Addres changed with success!");
					}else if(ent.equals("4"))
					{
						birthday = adc.nextLine();
						profile.get(idprofile - 1).setBirthday(birthday);
						bio = adc.nextLine();
						profile.get(idprofile - 1).setBio(bio);
						addres = adc.nextLine();
						profile.get(idprofile - 1).setAddres(addres);
						Create_Profile.CreateProfile(profile, birthday, bio, addres, idprofile);
						System.out.println("New changes made successfully!");
					}					
				}
			}else if(choice.equals("3"))
			{
				System.out.println("To proceed enter Login and Password...");
				login = adc.nextLine();
				password = adc.nextLine();
				System.out.println("Enter the name of the Friend you want Add");
				String nameoffriend;
				int local = 0;
				nameoffriend = adc.nextLine();
				
				for(int i = 0; i < acount.size(); i ++)
				{
				    if(acount.get(i).getUsername().equals(nameoffriend))
				    {
				    	local = 1;
				    	idprofile = acount.get(i).getIdacc();
				    	
				    }
				}
				
				if(local == 1)
				{
					if(acount.get(idprofile).getFriends().contains(nameoffriend))
					{
						System.out.println("He is your friend");
					}else
					{
						acount.get(idprofile).Requests(username, acount.get(idprofile - 1).getUsername());
						System.out.println("Request sent to " + nameoffriend);
					}
				}else
				{
					System.out.println("Friend not found.");
				}
			}else if(choice.equals("4"))
			{
				
			}else if(choice.equals("7"))
			{
				System.out.println("To See informations about your Profile, you must enter the Login and Password...");
				login = adc.nextLine();
				password = adc.nextLine();
				
				for(int i = 0; i < acount.size(); i ++)
				{
				    if(acount.get(i).getLogin().equals(login))
				    {
				    	if(acount.get(i).getPassword().equals(password))
				    	{
				    		idprofile = acount.get(i).getIdacc();
				    	}
				    }
				}
				
				String aux = profile.get(idprofile - 1).getBirthday();
				String aux1 = profile.get(idprofile - 1).getBio();
				String aux2 = profile.get(idprofile - 1).getAddres();
				System.out.println("Here are your profile's current data: ");
				System.out.println("Birthday - " + aux);
				System.out.println("Biography - " + aux1);
				System.out.println("Addres - " + aux2);
			}
		}
		
	}
}

