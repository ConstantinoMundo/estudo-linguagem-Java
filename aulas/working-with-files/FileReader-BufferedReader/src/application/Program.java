package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "D:\\temp\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();

			}
		} catch (IOException ioException) {
			System.out.println("Error: " + ioException.getMessage());
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(br != null) {
					br.close();
				}
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}

}
