package assign1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {
	public static void main(String[] args) throws Exception{
		
		OrderDB list = new OrderDB();
		int load = list.loadOrders("orders.txt");
		//System.out.println(load);
		list.showOrders();
	}


}
