package ru.geekbrains;

public class BoxOfJuice extends Product{

    private int volume;
    private String fruit;

    public BoxOfJuice(String brand, String name, double price, int volume, String fruit){
        super(brand, name, price);
        this.volume = volume;

        if(fruit.equalsIgnoreCase("orange") || fruit.equalsIgnoreCase("apple")
                || fruit.equalsIgnoreCase("cherry") || fruit.equalsIgnoreCase("pineapple")
                || fruit.equalsIgnoreCase("mango") || fruit.equalsIgnoreCase("multifruit"))
            this.fruit = fruit;
        else
            throw new RuntimeException("Неверно указан тип фрукта.");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %f - объем: %d - фрукт: %s ", brand, name, price, volume, fruit);
    }
}
