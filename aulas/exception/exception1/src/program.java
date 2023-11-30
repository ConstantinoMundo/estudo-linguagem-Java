import java.util.InputMismatchException;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        }
        catch (ArrayIndexOutOfBoundsException index){
            System.out.println("\"Invalid position\"");
        }
        catch (InputMismatchException mismatchException){
            System.out.println("\"Input error\"");
        }

        System.out.println("End of program");

        sc.close();
    }
}
