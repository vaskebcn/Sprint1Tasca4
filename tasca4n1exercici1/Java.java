package tasca4n1exercici1;

import java.util.ArrayList;

public class Java {

	private static ArrayList<String> month = new ArrayList<String>();
	
	static {
		month.add("january");
		month.add("february");
		month.add("march");
		month.add("april");
		month.add("may");
		month.add("june");
		month.add("july");
		month.add("august");
		month.add("september");
		month.add("october");
		month.add("november");
		month.add("december");
		
		
	}

	public Java() {

	}

	public ArrayList<String> getMonth() {
		return month;
	}

	public int getSize() {
		int size = month.size();
		return size;
	}

	public String mes8() {
		String mes8 = month.get(7);
		return mes8;

	}

}
