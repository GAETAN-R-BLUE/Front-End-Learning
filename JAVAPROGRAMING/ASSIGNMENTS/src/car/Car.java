package car;

public class Car {
    private String make;
    private String color;
    private String model;
    private int year;
    private Double price;
    private double soldPrice;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }


    public Car(String make, String color, String model, int year, Double price, double soldPrice) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
        this.soldPrice = soldPrice;
    }

    public Car(String make, String color, String model) {
        this.make = make;
        this.color = color;
        this.model = model;
    }

    public Car(int year, Double price, double soldPrice) {
        this.year = year;
        this.price = price;
        this.soldPrice = soldPrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    private void computeSalePrice(double tax) {
        this.soldPrice = soldPrice * (1 + tax);
    }

    private Double getSecretPrice() {
        return price;
    }
    public void  salleCar () {
        computeSalePrice(0.75d);
        System.out.println(soldPrice);
    }
}

