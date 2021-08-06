package week2_work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BillPrintingMain {

	public static void main(String[] args) {
		
		List<BillPrinting> l= new ArrayList<>();
		l.add(new BillPrinting("idly", 300, 2));
		l.add(new BillPrinting("vada", 400, 3));
		l.add(new BillPrinting("chinesefoods", 500, 4));
		l.add(new BillPrinting("puri", 600, 5));
		l.add(new BillPrinting("dosa", 900, 8));
		
		System.out.println("\n --------- Welcome to the XYZ Dhaba --------------------------------");
		System.out.println(" Item Name " + " Price " + "Quantity " + " LineTotal");
		
	
		// sorting using stream
		l.stream().sorted((r1,r2)->r1.getItemName().compareTo(r2.getItemName())).collect(Collectors.toList()).forEach(e->e.printStatement());


		Double s = l.stream().map((r1)->r1.getPrice()*r1.getQuantity()).reduce(0.0,(sum,bill)->sum+bill);

		System.out.println("                      Total= "+s);
		System.out.println("                           .........");
		System.out.println("                  BillTotal= "+s*1.05+"\n "
		+ "          (Inclusive of 5% tax)");
		System.out.println("\n\n **************Keep Coming*****************");

	}



	}


