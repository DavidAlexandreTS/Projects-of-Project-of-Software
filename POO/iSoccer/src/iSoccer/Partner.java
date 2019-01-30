package iSoccer;

import java.util.ArrayList;

public class Partner
{
	private int cpf;
	private int telephone;
	
	private double value_of_contribution;
	
	private String name;
	private String email;
	private String addres;
	private String status_of_pay;
	private String type_of_partner;
	
	public int getCpf()
	{
		return cpf;
	}
	
	public void setCpf(int cpf)
	{
		this.cpf = cpf;
	}
	
	public int getTelephone()
	{
		return telephone;
	}
	
	public void setTelephone(int telephone)
	{
		this.telephone = telephone;
	}
	
	public double getValue_of_contribution()
	{
		return value_of_contribution;
	}
	
	public void setValue_of_contribution(double value_of_contribution)
	{
		this.value_of_contribution = value_of_contribution;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getAddres()
	{
		return addres;
	}
	
	public void setAddres(String addres)
	{
		this.addres = addres;
	}
	
	public String getStatus_of_Pay()
	{
		return status_of_pay;
	}

	public void setStatus_of_Pay(String status)
	{
		this.status_of_pay = status;
	}

	public String getType_of_Partner()
	{
		return type_of_partner;
	}

	public void setType_of_Partner(String type_of_partner)
	{
		this.type_of_partner = type_of_partner;
	}

	public static void Add_Partner(ArrayList<Partner> partners, int cpf, String name, String addres, String email, int telephone, double value_of_contribution, String status_of_pay, String type_of_partner)
	{
		Partner partner = new Partner();
		partner.setCpf(cpf);
		partner.setName(name);
		partner.setAddres(addres);
		partner.setEmail(email);
		partner.setTelephone(telephone);
		partner.setValue_of_contribution(value_of_contribution);
		partner.setStatus_of_Pay(status_of_pay);
		partner.setType_of_Partner(type_of_partner);
		partners.add(partner);
	}
	
}