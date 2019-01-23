package Functionalities;

import java.util.ArrayList;

import Objects.Collaborator;
import Objects.Projects;

public class AddProject
{	
	public static void AddaProject(ArrayList<Projects> proj, String colname, String title, String startday, String enddate, String fundingagency, String financedamount, String objective, String description, String status, int idp, int numberofpub)
	{
		Projects pro = new Projects();
		pro.setColname(colname);
		pro.setTitle(title);
		pro.setStartday(startday);
		pro.setEnddate(enddate);
		pro.setFundingagency(fundingagency);
		pro.setFinancedamount(financedamount);
		pro.setObjective(objective);
		pro.setDescription(description);
		pro.setStatus(status);
		pro.setIdp(idp);
		pro.setNumberofpub(numberofpub);
		proj.add(pro);
	}
}
