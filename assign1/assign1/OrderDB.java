package assign1;

import java.io.*;

public class OrderDB implements OrderDBInterface {
	Order[] jar;
	
	public OrderDB() {
		jar = new Order[25];
	}

	@Override
	public int loadOrders(String fileName) {
		// TODO Auto-generated method stub
		int count = 0;
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null && count <= jar.length) {
				String[] lineCont = line.split(",");
				if (count >= 1) {
					jar[count - 1] = new Order(Integer.parseInt(lineCont[0]), lineCont[1], lineCont[2], Double.parseDouble(lineCont[3]), lineCont[4]);
					count++;					
				}
				if (count == 0) {
					count++;
				}
			}
			count--;
			br.close();
		}
		
		catch (FileNotFoundException e) {
			System.out.println("File Error: ");
		}
		catch (IOException e) {
			System.out.println("IO Error: ");
		}
		catch (Exception e) {
			System.out.println("Error: ");
		}
		return count;
	}

	@Override
	public int saveOrders(String fileName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showOrders() {
		System.out.println("Order ID Product                         Total Amt\n"
				+ "-------- -------                         ---------");
		for (int i = 0; i < jar.length; i++) {
			System.out.printf("%4d\t%7s\t\t%6.2f\n", jar[i].getOrder_ID(), jar[i].getProduct(), jar[i].getTotal_Amount());
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int searchByOrderID(int orderID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order set(int index, Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

}
