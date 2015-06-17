package main;
import java.util.Scanner;
public class OrganizeTanks {
	int x,y;
	int [] a = new int [10];
	int [] b = new int [10];
	char [] [] b1 = new char [6] [6];
	Scanner scan = new Scanner (System.in);
	DrawBoard draw = new DrawBoard ();
	char[] [] gg() {
		for (int l = 0; l<6; l++){
			a[l] = 7;
			
		}
		draw.Board();
	for (int u = 0; u<4; u++) {
		do {
		do {
		System.out.print("Enter X : ");
		x = scan.nextInt();
		System.out.println("");
		}		
		while (x < 0 || x > 5);
		do {
		System.out.print("Enter Y : ");
		y = scan.nextInt();
		System.out.println("");
		}
		while (y <0 || y > 5 );
		}	
		while ((x == a[0]  &&  y ==b[0]) || (x == a[1]  &&  y ==b[1]) || (x == a[2]  &&  y ==b[2]) || (x == a[3]  &&  y ==b[3]) );
		
		a[u + 1] = x;
		b[u + 1] = y;
		b1 [x] [y] = 'T';
		draw.new_board(x, y);
		
		}
		return b1;
		
	}
		
		
		
		
		
		
}