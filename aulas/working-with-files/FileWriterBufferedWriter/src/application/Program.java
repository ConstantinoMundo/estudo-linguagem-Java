package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] weekDays = new String[] { "Monday-Segunda", "Tuesday-Terça", "Wednesday",
				"Thursday", "Friday", "Saturday", "Sunday" };

		String path = "D:\\temp\\week days.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String week : weekDays) {
				bw.write(week);
				bw.newLine();
			}
		} catch(IOException ioException) {
			ioException.printStackTrace();
		}

	}

}
