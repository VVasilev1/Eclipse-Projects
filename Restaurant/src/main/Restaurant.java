package main;
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args) {
		DrawMenu draw = new DrawMenu();
		draw.menu();
		System.out.println("Please enter the code of you desired dish.");
		System.out.println("When your done with your order, enter 0.");
		Scanner scan = new Scanner(System.in);
		Order ord = new Order();
		int a;
		do {
		 a = scan.nextInt();	
		ord.get_Order(a);
		}
		while (a != 0);
		scan.close();
		ArrayList<String> list = new ArrayList<String>();
		list = ord.get_Order(0);
		Iterator it = list.iterator();			
		while (it.hasNext()) {					
			System.out.println(it.next());	
	}
		System.out.println("");
		System.out.println( "Your account is:   " + ord.price + " leva");
		
				
}
}
