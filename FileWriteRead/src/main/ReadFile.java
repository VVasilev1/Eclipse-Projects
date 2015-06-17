package main;
	import java.io.FileReader;
	import java.io.BufferedReader;
	import java.io.IOException;
public class ReadFile {
	
	private String path; 
	
	public ReadFile (String file_path) {
		path = file_path;
	}
	int  getLines () throws IOException {
		
		
		FileReader file = new FileReader (path);
		BufferedReader br = new BufferedReader(file);
		int number_Lines = 0;
		while (br.readLine() != null ) {
			number_Lines ++;
		}
		br.close();
		return number_Lines;
		
	}
	
	String [] Read_from_File () throws IOException {
		FileReader fr = new FileReader (path);
		BufferedReader buff_r = new BufferedReader (fr);
		int number_lines = getLines();
		String [] text = new String [number_lines];
		for (int y = 0 ; y < number_lines ; y++ ) {
			text[y] = buff_r.readLine();
			
		}
		buff_r.close();
		return text;
		}
	
	
	
	
}
