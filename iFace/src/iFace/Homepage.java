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
		ArrayList<Community> Comum = new ArrayList<Community>();
		Scanner adc = new Scanner(System.in);
		System.out.println("Welcome to IFACE");
		int idacc = 1, idprofile = 1, idcom = 1;
		String username, login, password, birthday, bio, addres, choice, namecom, descrip;
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
				System.out.println("To proceed enter your Username, Login and Password...");
				username = adc.nextLine();
				login = adc.nextLine();
				password = adc.nextLine();
				System.out.println("To Invite an Friend entry 1, to Check if you have Friendships Requests entry 2");
				String opt = adc.nextLine();
				
				if(opt.equals("1"))
				{
					System.out.println("Enter the Username of the Friend you want Add");
					String nameoffriend;
					int local = 0;
					nameoffriend = adc.nextLine();
					
					for(int i = 0; i < acount.size(); i ++)
					{
					    if(acount.get(i).getUsername().equals(nameoffriend))
					    {
					    	local = 1;
					    	idprofile = acount.get(i).getIdacc();
					    	System.out.println("Se liga no idprofile: "+ idprofile );
					    }
					}
					
					if(local == 1)
					{
						if(acount.get(idprofile - 1).getFriends().contains(nameoffriend))
						{
							System.out.println("He is your friend");
						}else
						{
							acount.get(idprofile - 1).Requests(username, acount.get(idprofile - 1).getUsername());
							System.out.println("Request sent to " + nameoffriend);
						}
					}else
					{
						System.out.println("User not found.");
					}
				}else if(opt.equals("2"))
				{
					//System.out.println("To entrando aqui s");
					String soli;
					@SuppressWarnings("null")
					int idtotal = 1, auxin;
					
					for(int i = 0; i < acount.size(); i ++)
					{
					    if(acount.get(i).getLogin().equals(login))
					    {
					    	if(acount.get(i).getPassword().equals(password))
					    	{
					    		 idtotal = acount.get(i).getIdacc();
					    	}
					    }
					}
					
					if(acount.get(idtotal - 1).getRequests().size() != 0)
					{
						String answer;
						auxin = acount.get(idtotal - 1).getRequests().size();
						int i = 0;
						while(i < auxin)
						{
							System.out.println("The User " + acount.get(idtotal - 1).getRequests().get(i).getSent() + " want add you has a friend. Digite Yes to aceppt and No to decline.");
							answer = adc.nextLine();
							
							if(answer.equals("Yes"))
							{
								//System.out.println("The problem is: " + idtotal);
								int idaux = 1;
								/*for(int j = 0; j < acount.size(); j ++)
								{
									//System.out.println("The problem is: " + idtotal);
								    if(acount.get(j).getUsername().equals(acount.get(idtotal - 1).getRequests().get(j).getSent()))
								    {
								    	idaux = acount.get(j).getIdacc();
								    }
								}*/
								acount.get(idtotal - 1).setFriends(acount.get(idaux - 1).getUsername());
								acount.get(idaux - 1).setFriends(username);
								System.out.println(acount.get(idaux - 1).getUsername() + " adicionado\n");
							}
							i ++;
						}
					}
				}
				
			}else if(choice.equals("4"))
			{
				
				System.out.println("Hey, gimme your Login, Username and Password");
				username = adc.nextLine();
				login = adc.nextLine();
				password = adc.nextLine();
				String destiny, mes;
				int idagain = 1;
				System.out.println("To whom you want to send a message?");
				destiny = adc.nextLine();
				
				for(int i = 0; i < acount.size(); i ++)
				{
				    if(acount.get(i).getUsername().equals(destiny))
				    {
				    	idagain = acount.get(i).getIdacc();
				    }
				}

				if(idagain == 0)
				{
					System.out.println("Cant find the User");
				}else
				{
					System.out.println("Enter your message:");
					mes = adc.nextLine();
					acount.get(idagain).Sending(username, destiny, mes);
					acount.get(idagain).Checking(username);
					
					int idnovamente = 1;
					for(int i = 0; i < acount.size(); i ++)
					{
					    if(acount.get(i).getLogin().equals(login))
					    {
					    	idnovamente = acount.get(i).getIdacc();
					    }
					}
					acount.get(idnovamente - 1).Sending(username, destiny, mes);
					System.out.println("Sent With Sucess!");
				}
			}else if(choice.equals("5"))
			{
				System.out.println("Hey, gimme your Login, Username and Password");
				username = adc.nextLine();
				login = adc.nextLine();
				password = adc.nextLine();
				
				System.out.println("Enter the name and the description to your Community");
				namecom = adc.nextLine();
				descrip = adc.nextLine();
				Create_Communitty.AddCommunity(Comum, username, namecom, descrip, idcom);
				idcom ++;
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
				
			}else if(choice.equals("8"))
			{
				//
			}else if(choice.equals("0"))
			{
				break;
			}
		}
		
	}
}

