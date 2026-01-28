package basics;

public class Encap {

    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;
    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void accelerate(int increment) {
        speed += increment;
    }

}
