package ru.geekbrains;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BoxOfJuice getBoxOfJuice (String brand, int volume, String fruit){
        for (Product boxOfJuice : products) {
            if (boxOfJuice instanceof BoxOfJuice){
                BoxOfJuice boxJuice = ((BoxOfJuice) boxOfJuice);
                if (boxJuice.getBrand().equals(brand) && boxJuice.getVolume() == volume &&
                        boxJuice.getFruit().equalsIgnoreCase(fruit)) {
                    return boxJuice;
                }
            }
        }
        return null;
    }
}
