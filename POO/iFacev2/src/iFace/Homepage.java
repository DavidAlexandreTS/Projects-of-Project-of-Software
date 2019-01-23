package iFace;

import java.util.Scanner;
import java.util.ArrayList;

public class Homepage
{

	@SuppressWarnings("resource")
	public static void main(String args [])
	{
		Scanner adc = new Scanner(System.in);
		
		String choice;
		String login;
		String username = null;
		String password;
		String option;
		String addres;
		String bio;
		String user;
		String friend_name = null;
		String message;
		String name_com;
		String des_com;
		String userna = null;
		
		
		int idc = 0;
		int idprofile = 0;
		int day_of_birthday;
		int month_of_birthday;
		int year_of_birthday;
		int number_now = 0;
		int number_now2 = 0;
		int aux_in = 0;
		int aux_in2 = 0;
		int idm = 0;
		int members = 1;
		
		ArrayList<Account> acount = new ArrayList<Account>();
		ArrayList<Profile> profile = new ArrayList<Profile>();
		ArrayList<Friendship_Request> requests = new ArrayList<Friendship_Request>();
		ArrayList<Community> community = new ArrayList<Community>();
		
		System.out.println("Welcome to the iFace");
		
		while(true)
		{
			System.out.println("What do you want to do?\n" + "1. To Create a Account\n"
					+ "2. To Edit or Create an Profile\n" + "3. To Add an Friend\n" + "4. To view informations about Messages\n"
					+ "5. To Create an Community\n" + "6. To Add members to an Community\n"
					+ "7. View Profile Information\n" + "8. To Delete an Account\n" + "0. To Close the iFace" + "\n");
			
			choice = adc.nextLine();
			
			if(choice.equals("0"))
			{
				break;
			}
			
			else if(choice.equals("1"))
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
						
						if (acount.get(i).getLogin().equals(login))
						{
							System.out.println("We already have a registered user with this Login. Please try another...");
							est = 1;
							break;
						}
						
						i ++;
					}
					
					if(est == 0)
					{
						Create_Account.Create_Acc(acount, " ", username, login, password, idc);
						System.out.println("New Account successfully registered!");
						idc ++;
						break;
					}
					
				}
				
			}
			
			else if(choice.equals("2"))
			{
				System.out.println("To create a profile you must have an iFace account.");
				
				while(true)
				{
					System.out.println("If you already have an account type 1, if you want to create an iFace account type 2.");
					option = adc.nextLine();
					
					if(option.equals("1"))
					{
						System.out.println("Enter your login and password");
						
						login = adc.nextLine();
						password = adc.nextLine();
						
						int i = 0, est = 0;
						
						while(i < acount.size())
						{
							
							if (acount.get(i).getLogin().equals(login) && acount.get(i).getPassword().equals(password))
							{
								idprofile = i;
								est = 1;
								break;
							}
							
							i ++;
						}
						
						if(est == 1)
						{
							System.out.println("So, enter 1 if you want to create a new profile or 2 if you want to edit the profile associated with this account");
							choice = adc.nextLine();
							
							if(choice.equals("1"))
							{
								while(true)
								{
									System.out.println("Give us the day, month, and year you were born");
									day_of_birthday = adc.nextInt();
									month_of_birthday = adc.nextInt();
									year_of_birthday = adc.nextInt();
									adc.nextLine();
									
									if(day_of_birthday > 31 || month_of_birthday > 12)
									{
										System.out.println("You entered the wrong month or year of birth, try again...");
									}
									else
									{
										//System.out.printf("Your Birthday is: %02d/%02d/%d\n", day_of_birthday, month_of_birthday, year_of_birthday);
										
										System.out.println("Now give us your address and a short description of who you are");
										addres = adc.nextLine();
										bio = adc.nextLine();
										user = login;
										//System.out.println(addres);
										//System.out.println(bio);
										Create_Profile.CreateProfile(profile, idprofile, 0, day_of_birthday, month_of_birthday, year_of_birthday, addres, bio, user);
										System.out.println("New Profile successfully registered!");
										break;
									}
									
								}
								
							}
							else if(choice.equals("2"))
							{
								i = 0;
								est = 0;
								
								while(i < profile.size())
								{
									
									if (profile.get(i).getUser().equals(login))
									{
										est = 1;
										break;
									}
									
									i ++;
								}
								
								if(est == 1)
								{
									System.out.println("What information of your profile do you want to edit?\n" + "1. for Birthday\n" + 
											"2. for Addres\n" + "3. for Description\n");
									choice = adc.nextLine();
									
									if(choice.equals("1"))
									{
										System.out.println("Enter the new Birthday(day, month and year)");
										day_of_birthday = adc.nextInt();
										month_of_birthday = adc.nextInt();
										year_of_birthday = adc.nextInt();
										adc.nextLine();
										profile.get(i).setDay_of_birthday(day_of_birthday);
										profile.get(i).setMonth_of_birthday(month_of_birthday);
										profile.get(i).setYear_of_birthday(year_of_birthday);
									}
									else if(choice.equals("2"))
									{
										System.out.println("Enter the new Addres");
										addres = adc.nextLine();
										profile.get(i).setAddres(addres);
									}
									else if(choice.equals("3"))
									{
										System.out.println("Enter the new Description");
										bio = adc.nextLine();
										profile.get(i).setAddres(bio);
									}
								}
								else
								{
									System.out.println("Sorry, there is no profile associated with this account");
								}
								
							}
							break;
						}
						else
						{
							System.out.println("User not found try again");
						}
						
					}
					else if(option.equals("2"))
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
								
								if (acount.get(i).getLogin().equals(login))
								{
									System.out.println("We already have a registered user with this Login. Please try another...");
									est = 1;
									break;
								}
								
								i ++;
							}
							
							if(est == 0)
							{
								Create_Account.Create_Acc(acount, " ", username, login, password, idc);
								System.out.println("New Account successfully registered!");
								idc ++;
								break;
							}
							
						}
					}
					else
					{
						System.out.println("Option invalid, please try again");
					}
				}
				
			}
			
			else if(choice.equals("3"))
			{
				while(true)
				{
					System.out.println("To continue enter your login and password");
					login = adc.nextLine();
					password = adc.nextLine();
					
					int ok = 0;
					for(int i = 0; i < acount.size(); i ++)
					{
						if (acount.get(i).getLogin().equals(login))
						{
							if (acount.get(i).getPassword().equals(password))
							{
								ok = 1;
								username = acount.get(i).getUsername();
								break;
							}
						}
					}
					
					if(ok == 1)
					{
						System.out.println("Ok, now choose one option:\n" + "1. To send a friend request\n" + "2. To know if you have requests for friendship\n");
						choice = adc.nextLine();
						
						if(choice.equals("1"))
						{
							System.out.println("Enter the username you want to add as a friend");
							friend_name = adc.nextLine();
							
							ok = 0;
							for(int i = 0; i < acount.size(); i ++)
							{
								if(acount.get(i).getUsername().equals(friend_name))
								{
									ok = 1;
									break;
								}
							}
							
							if(ok == 1)
							{
								Friendship_Request.Send_Request(requests, 1, username, friend_name);
								System.out.println("Friendship request sent\n");
								break;
							}
							else
							{
								System.out.println("User not found, please try again");
							}
						}
						else if(choice.equals("2"))
						{
							ok = 0;
							for(int i = 0; i < requests.size(); i ++)
							{
								if(requests.get(i).getRecipient().equals(username) && requests.get(i).getHave() == 1)
								{
									ok = 1;
									friend_name = requests.get(i).getSender();
									break;
								}
							}
							
							if(ok == 1)
							{
								System.out.println("You have a friend request from " + friend_name);
								System.out.println("Type 1 to accept and 2 to reject");
								choice = adc.nextLine();
								
								if(choice.equals("1"))
								{
									aux_in = 0;
									for(int i = 0; i < profile.size(); i ++)
									{
										if(profile.get(i).getUser().equals(username))
										{
											number_now = profile.get(i).getNumber_of_friends();
											aux_in = i;
											break;
										}
									}
									
									aux_in2 = 0;
									for(int i = 0; i < profile.size(); i ++)
									{
										if(profile.get(i).getUser().equals(friend_name))
										{
											number_now2 = profile.get(i).getNumber_of_friends();
											aux_in2 = i;
											break;
										}
									}
									
									number_now ++;
									number_now2 ++;
									profile.get(aux_in).setNumber_of_friends(number_now);
									profile.get(aux_in2).setNumber_of_friends(number_now2);
									System.out.println("Request was accepted, " + friend_name + " are a friend now\n");
									number_now = 0;
									number_now2 = 0;
									break;
								}
								else
								{
									System.out.println("Request was rejected\n");
									break;
								}
							}
							else
							{
								System.out.println("You have no current friend requests");
								break;
							}
						}
						else
						{
							System.out.println("Invalid option, tried again.");
						}
						
					}
					else
					{
						System.out.println("Wrong login or password, please try again");
					}
				}
				
			}
			
			else if(choice.equals("4"))
			{
				while(true)
				{
					System.out.println("To open you Message Box enter the Login and Password");
					login = adc.nextLine();
					password = adc.nextLine();
					
					int ok = 0;
					for(int i = 0; i < acount.size(); i ++)
					{
						if (acount.get(i).getLogin().equals(login))
						{
							if (acount.get(i).getPassword().equals(password))
							{
								ok = 1;
								break;
							}
						}
					}
					
					
					if(ok == 1)
					{
						System.out.println("Now type 1 to view your messages and 2 if you want send a message");
						choice = adc.nextLine();
						
						if(choice.equals("1"))
						{
							for (int i = 0; i < acount.size(); i ++)
							{
								if (acount.get(i).getLogin().equals(login))
								{
									if (acount.get(i).getPassword().equals(password))
									{
										idm = i;
										break;
									}
								}
							}
							
							String mensagem = acount.get(idm).getMessage();
							
							if(mensagem.equals(" "))
							{
								System.out.println("You have 0 Messages");
								break;
							}
							else
							{
								System.out.println("This is your message:");
								System.out.println(mensagem);
								break;
							}
							
						}
						else if(choice.equals("2"))
						{
							System.out.println("Okay, now enter the Username of the person you want to send the message");
							username = adc.nextLine();
							
							int ok_aux = 0;
							for(int i = 0; i < acount.size(); i ++)
							{
								if (acount.get(i).getUsername().equals(username))
								{
									ok_aux = 1;
									idm = i;
									break;
								}
							}
							
							if(ok_aux == 1)
							{
								System.out.println("Okay now, digit the message");
								message = adc.nextLine();
								
								acount.get(idm).setMessage(message);
								System.out.println("New message sent successfully to " + username + "!");
								break;
								
							}
						}
						
					}
					else
					{
						System.out.println("Invalid Login or Password. Please, try again.");
					}
				}
				
			}
			
			else if(choice.equals("5"))
			{
				System.out.println("To continue give me your login and password");
				login = adc.nextLine();
				password = adc.nextLine();
				
				int auxe = 0;
				for (int i = 0; i < acount.size(); i ++)
				{
					if (acount.get(i).getLogin().equals(login))
					{
						if (acount.get(i).getPassword().equals(password))
						{
							auxe = 1;
							userna = acount.get(i).getUsername();
							break;
						}
					}
				}
				
				if(auxe == 1)
				{
					System.out.println("Press 1 to create a community or 2 to add members");
					choice = adc.nextLine();
					
					if(choice.equals("1"))
					{
						System.out.println("Give me the Name of the Community and a little description");
						name_com = adc.nextLine();
						des_com = adc.nextLine();
						
						Community.Add_Members(community, members, userna, name_com, des_com);
						System.out.println("New Community created with success!");
						members = 1;
					}
					else if(choice.equals("2"))
					{
						System.out.println("To add members to the community you must be the administrator of the community");
						
					}
					else
					{
						System.out.println("Invalid Option!");
					}
				}
				else
				{
					//nah, error
				}
			}
			
			else if(choice.equals("7"))
			{
				System.out.println("To See informations about your Profile, you must enter the Login and Password...");
				login = adc.nextLine();
				password = adc.nextLine();

				for (int i = 0; i < acount.size(); i ++)
				{
					if (acount.get(i).getLogin().equals(login))
					{
						if (acount.get(i).getPassword().equals(password))
						{
							idprofile = i;
							break;
						}
					}
				}

				int day = profile.get(idprofile).getDay_of_birthday();
				int month = profile.get(idprofile).getMonth_of_birthday();
				int year = profile.get(idprofile).getYear_of_birthday();
				int numb = profile.get(idprofile).getNumber_of_friends();
				
				String bioinfo = profile.get(idprofile).getBio();
				String addresinfo = profile.get(idprofile).getAddres();
				System.out.println("Here are your profile's current data: ");
				System.out.printf("Your Birthday is: %02d/%02d/%d\n", day, month, year);
				System.out.println("About you: " + bioinfo);
				System.out.println("Your Address: " + addresinfo);
				System.out.println("Number of Friends: " + numb);
				System.out.println("\n");
			}
		}

	}

}
