package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file: files) {
			System.out.println(file);
		}
		
		//Create a subfolder
		boolean success = new File(strPath + "\\28_02").mkdir();
		System.out.println("Directory create successfully: " + success);
		sc.close();
	}

}
