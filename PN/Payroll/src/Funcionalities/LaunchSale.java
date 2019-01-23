package Funcionalities;

import java.util.ArrayList;
import Objects.Sale;

public class LaunchSale
{
	public static void LaunchaSale(ArrayList<Sale> sal, int idsale,  double value, String employee, String client)
	{
		Sale sale = new Sale();
		sale.setIdsale(idsale);
		sale.setValue(value);
		sale.setEmployee(employee);
		sale.setClient(client);
		sal.add(sale);
	}
}
