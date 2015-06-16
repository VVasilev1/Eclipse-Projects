package main;

import java.util.ArrayList;

public class Order {
	ArrayList<String> list = new ArrayList<String>();
	double price ;
	ArrayList<String> get_Order (int code) {
		switch (code) {
		case 1 : list.add("Musaka          5.00leva"); price = price + 5.00;  
		break;
		case 2 : list.add("Tarator         1.20leva"); price = price + 1.20;
		break;
		case 3 : list.add("Spaghetti       4.30leva"); price = price + 4.30;
		break;
		case 4 : list.add("Soup            1.80leva"); price = price + 1.80;
		break;
		case 5 : list.add("Salad           2.80leva"); price = price + 2.80; 
		break;
		case 6 : list.add("Kebapche        0.80leva"); price = price + 0.80; 
		break;
		case 7 : list.add("Pancake         1.20leva"); price = price + 1.20; 
		break;
		case 8 : list.add("Cake            1.90leva"); price = price + 1.90; 
		break;
		case 9 : list.add("Lasagna         3.20leva"); price = price + 3.20; 
		break;
		case 10 : list.add("Pizza           5.00leva"); price = price + 5.00; 
		break;
		case 11 : list.add("Hamburger       2.50leva"); price = price + 2.50; 
		break;
		case 12 : list.add("Beer            1.80leva"); price = price + 1.80; 
		break;
		case 13 : list.add("Rakia           1.20leva"); price = price + 1.20; 
		break;
		case 14 : list.add("Soda            1.80leva"); price = price + 1.80; 
		break;
		case 0 : break;
		default : System.out.println("Greshno vaveden kod");  }
		return list;
	}
		double get_price () {
			return price;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		}
		
	

