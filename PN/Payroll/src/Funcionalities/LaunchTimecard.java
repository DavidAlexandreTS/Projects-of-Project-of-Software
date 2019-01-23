package Funcionalities;

import java.util.ArrayList;
import Objects.Timecard;

public class LaunchTimecard
{
	public static void LaunchaTimecard(ArrayList<Timecard> tmc, int idt,  String name_of_employee, double worked_hours, double salary_total, String method_of_pay)
	{
		Timecard timecard = new Timecard();
		timecard.setIdt(idt);
		timecard.setName_of_employee(name_of_employee);
		timecard.setWorked_hours(worked_hours);
		timecard.setSalary_total(salary_total);
		timecard.setMethod_of_pay(method_of_pay);
		tmc.add(timecard);
	}
}
