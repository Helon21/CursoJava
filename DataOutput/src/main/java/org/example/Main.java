package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        double x = 10.35784;
        String name = "Jessica";
        int age = 25;
        double salaryIncome = 1500.25;

        String product1 = "Computer";
        String product2 = "Office desk";

        int age1 = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println(x);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x);
        System.out.println("Result = " + x + "Meters");
        System.out.printf("Result = %.2f meters\n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", name, age, salaryIncome);

        Locale.setDefault(Locale.GERMAN);
        System.out.println("Products: \n");
        System.out.printf("%s, which price is $%f \n", product1, price1 );
        System.out.printf("%s, wich price is $%f \n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c \n", age1, code, gender);
        System.out.printf("Measue with eight decimal place: %f\n", measure);
        System.out.printf("Rouded: %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);


    }

}