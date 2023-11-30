import java.util.InputMismatchException;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        method1();
        System.out.println("End of program\n");
    }

    public static void method1(){

        System.out.println("\n***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");

    }
    public static void method2(){

        System.out.println("***METHOD2 START***");

        Scanner sc = new Scanner(System.in);

        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        }
        catch (IndexOutOfBoundsException index){
            System.out.println("Invalid position");
            index.printStackTrace();
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Input error");
            inputMismatchException.printStackTrace();

        }

        sc.close();

        System.out.println("***METHOD2 END***");
    }

}
