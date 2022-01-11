package ru.greensight;

public class Car {
    private String carBrand;
    private int carHorsePower;
    private String carColor;

    public Car (String name, int hp, String color) {
        this.carBrand = name;
        this.carHorsePower = hp;
        this.carColor = color;
    }

    public Car() {

    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getCarHorsePower() {
        return carHorsePower;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarHorsePower(int carHorsePower) {
        this.carHorsePower = carHorsePower;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
