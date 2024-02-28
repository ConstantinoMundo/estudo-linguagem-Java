package application;

import java.io.File;
import java.util.Scanner;

public class Progran {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		System.out.println("getName: " + path.getName());
		System.out.println("getParentFile: " + path.getParentFile());
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}

}
