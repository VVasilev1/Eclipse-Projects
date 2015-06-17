package main;
	import java.util.Random;
public class AiTanks {
	Random rand = new Random ();
	DrawBoard draw = new DrawBoard();
	OrganizeTanks org = new OrganizeTanks();
		char [] [] ai = new char [6] [6];
		int [] r_m_1 = new int [6];
		int [] r_m_2 = new int [6];
		int v,w;
		char [] [] random() {
			
			for (int u = 0; u<4; u++) {
				
			do {
			v = rand.nextInt(6);
			w = rand.nextInt(6);
			
			}
			while ((v == r_m_1[0]  &&  w ==r_m_2[0]) || (v == r_m_1[1]  &&  w == r_m_2[1]) || (v == r_m_1[2]  &&  w == r_m_2[2]) || (v == r_m_1[3]  &&  w ==r_m_2[3]) );
			r_m_1[u] = v;
			r_m_2[u] = w ;
			ai [v] [w] = 'T';
			}
			return ai;		
			
			
			}
			
			
			
			
			
			
			
			
		}
	
	
	
	
	

