package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println("Shape #"+ i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char option = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED/WHITE): ");
            Color color = Color.valueOf(sc.next());
            if(option == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapes.add(new Circle(color,radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapes){
            System.out.printf(String.format("%.2f%n", shape.area()));
        }

    }
}
