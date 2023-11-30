package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File file = new File("D:\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException ioException){
            System.out.println("\nError opening file: " + ioException.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}
