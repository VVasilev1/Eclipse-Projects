package main;

public class DrawBoard {
		char [] [] board_1 = new char [6] [6];
		char [] [] board_2 = new char [6] [6];
	void Board () {
		
		System.out.println("   _____________");
		System.out.println("X Y 0 1 2 3 4 5");
		for (int i = 0; i<6;i++) {
			System.out.print(i + "  |");
			for ( int y = 0 ; y < 6 ; y++) {
				System.out.print(board_1 [i] [y]  + "|");		
			}
			System.out.println("");
		}
			System.out.println("   _____________");
			System.out.println("X Y 0 1 2 3 4 5");
			for (int z = 0; z<6;z++) {
				System.out.print(z + "  |");
				for ( int x = 0 ; x < 6 ; x++) {
					System.out.print(board_2 [z] [x] + "|");		
				}
				System.out.println("");
			
			
		}
			System.out.println("   _____________");
		
			
				
				
			}
	void new_board (int x, int y) {
		
		board_2 [x] [y] = 'T';
		Board();
		}
	
		
	
	
	
	
	}
	
	
	
		
	
	

