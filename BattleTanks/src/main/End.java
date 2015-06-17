package main;
	
public class End {
		boolean  b_1;
		boolean b_2;
	boolean end_1 (char m [] []) {
		b_1 = false;
		for (int i = 0; i < 6; i++) {
			for (int y = 0; y < 6; y++) {
				if (m[i][y] == 'T') {
					b_1 = true;
									}						
				
										}							
									}
			return b_1;
								}
	
	boolean end_2 (char n [] []) {
		b_2 = false;
		for (int i = 0; i < 6; i++) {
			for (int y = 0; y < 6; y++) {
				if (n[i][y] == 'T') {
					b_2 = true;
									}						
				
										}							
									}
			return b_2;
	}
		
}
