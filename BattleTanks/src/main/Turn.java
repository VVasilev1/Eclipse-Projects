package main;
	
import java.util.Scanner;
import java.util.Random;
public class Turn {
	DrawBoard d = new DrawBoard();
	Random rand = new Random ();
	Scanner scan = new Scanner(System.in);
	End e = new End();
	int k1, k2, k3, k4;
	int [] ait = new int  [6];
	int [] aip = new int  [6];
	char [] [] t1 = new char [6] [6];
	boolean has = false;
	boolean has_2 = false;
	void full_board (char [] [] x, char [] [] y) {
		
		for (int i = 0; i<6; i++) {
			for (int t = 0; t<6; t++) {
			d.board_2 [i] [t] = x [i] [t];		
										}	
									}
		
		for (int p =0; p<1000; p++) {
		System.out.println("Enter coordinate to attack the enemy");
		do {
		System.out.print("X : ");
		k1 = scan.nextInt();
		}
		while (k1 < 0 || k1 > 5);
		do {
			System.out.print("Y : ");
			k2 = scan.nextInt();
			}
			while (k2 < 0 || k2 > 5);
		if (y [k1] [k2] == 'T') {
			d.board_1[k1] [k2] = 'X';
			y [k1][k2] = 'X';
		}
		else {d.board_1[k1] [k2] = 'O';
			  y [k1][k2] = 'O';
		}
		d.Board();
			if (e.end_1(y) == false) {
				System.out.println("You win!");
				break;
			}
					do {
			k3 = rand.nextInt(6);
			k4 = rand.nextInt(6);
			}
				
			while (d.board_2[k3][k4] == 'O' || d.board_2[k3][k4] == 'X');
			
			if (d.board_2 [k3] [k4] == 'T') {
				d.board_2 [k3] [k4] = 'X';
			}
			else { d.board_2 [k3] [k4] = 'O';
			}
			System.out.println("Protivkikat atakuva kordinati X:" + k3 + " Y: " + k4);
		d.Board();
			if (e.end_2(d.board_2) == false) {
				System.out.println("You lose!");
				break;
			}
			
				 
			
		
		
	
	}
}
}