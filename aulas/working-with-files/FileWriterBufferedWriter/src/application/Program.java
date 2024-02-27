package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] weekDays = new String[] { "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday", "Sunday" };

		String path = "D:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String week : weekDays) {
				bw.write(week);
				bw.newLine();
			}
		} catch(IOException ioException) {
			ioException.printStackTrace();
		}

	}

}
