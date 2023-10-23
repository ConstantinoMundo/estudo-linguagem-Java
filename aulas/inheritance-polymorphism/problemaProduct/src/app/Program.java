package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> product = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            switch (option) {
                case 'i':

                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    product.add(new ImportedProduct(name, price, customsFee));
                    break;

                case 'c':
                    product.add(new Product(name, price));
                    break;

                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    product.add(new UsedProduct(name, price, date));
                    break;

            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product prdt : product) {
            System.out.println(prdt.priceTag());
        }

        sc.close();

    }

}
