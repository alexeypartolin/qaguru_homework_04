package ru.greensight;

public class Main {
    public static void main(String[] args) {
        Car ladaKalina = new Car("Лада Калина", 136, "Белый");
        System.out.println("Действующий цвет автомобиля: " + ladaKalina.getCarColor());
        ladaKalina.setCarColor("Синий");
        System.out.println("Новый цвет автомобиля: " + ladaKalina.getCarColor());
    }
}
