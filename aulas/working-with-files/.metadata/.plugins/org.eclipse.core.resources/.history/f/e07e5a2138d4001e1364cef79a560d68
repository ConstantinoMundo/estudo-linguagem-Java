package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("D:\\temp\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}

		catch (IOException ioException) {
			System.out.println("Error: " + ioException.getMessage());
			ioException.printStackTrace();
		}

		finally {
			if (sc != null) {
			}
		}

	}

}
