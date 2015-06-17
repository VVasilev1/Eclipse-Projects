package main;
	import java.io.IOException;
	import java.util.Scanner;
public class FileReadWrite {

	public static void main(String[] args) {
		String file_name = "D:/test.txt";
		System.out.println("Enter your text here");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		try {
				
		WriteFile write = new WriteFile (file_name);
		write.writeToFile(a);
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		scan.close();
		System.out.println("Text in the file:");
		ReadFile read = new ReadFile(file_name);
		try {
		String array [] = read.Read_from_File();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
