package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product boxOfJuice1 = new BoxOfJuice("Моя семья", "Коробка1", 50, 1, "orange");
        Product boxOfJuice2 = new BoxOfJuice("Фруктовый сад","Коробка2", 100, 2, "cherry");
        Product boxOfJuice3 = new BoxOfJuice("Добрый","Коробка3", 200, 1, "pineapple");
        Product boxOfJuice4 = new BoxOfJuice("Добрый", "Коробка4", 100, 2, "apple");
        Product boxOfJuice5 = new BoxOfJuice("Фруктовый сад", "Коробка5", 250, 1, "mango");
        Product boxOfJuice6 = new BoxOfJuice("Моя семья","Коробка6", 50, 2, "multifruit");

        List<Product> boxOfJuice = new ArrayList<>();
        boxOfJuice.add(boxOfJuice1);
        boxOfJuice.add(boxOfJuice2);
        boxOfJuice.add(boxOfJuice3);
        boxOfJuice.add(boxOfJuice4);
        boxOfJuice.add(boxOfJuice5);
        boxOfJuice.add(boxOfJuice6);

        VendingMachine vendingMachineJuice = new VendingMachine(boxOfJuice);
        BoxOfJuice boxOfJuiceRes = vendingMachineJuice.getBoxOfJuice("Фруктовый сад", 2, "cherry");
        if (boxOfJuiceRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(boxOfJuiceRes.displayInfo());
        } else {
            System.out.println("Такого сока нет в автомате.");
        }

        boxOfJuiceRes = vendingMachineJuice.getBoxOfJuice("Добрый", 2, "apple");
        if (boxOfJuiceRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(boxOfJuiceRes.displayInfo());
        } else {
            System.out.println("Такого сока нет в автомате.");
        }

        boxOfJuiceRes = vendingMachineJuice.getBoxOfJuice("Моя семья", 1, "mango");
        if (boxOfJuiceRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(boxOfJuiceRes.displayInfo());
        } else {
            System.out.println("Такого сока нет в автомате.");
        }
    }
}