package main;
	import java.io.FileWriter;
	import java.io.PrintWriter;
	import java.io.IOException;
public class WriteFile {
	
	private String path;
	
	public WriteFile (String file_path) {
		path = file_path;
	}
	public void writeToFile (String text)	throws IOException {
		FileWriter filewrite = new FileWriter(path, true);
		PrintWriter printLine = new PrintWriter(filewrite);
		
		printLine.println(text);
		printLine.close();
		
	}
		
		
	
	
	
}
