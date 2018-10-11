package Car;

public class Car {
    String name;
    double price;

    public Car(String name, double price){
    this.name = name;
    this.price = price;
    }

    public String getName(){
    return this.name;
    }

    public double getDailyPrice(){
    return this.price;
    }

    public double calculateRent(int days){
    return this.price*days;
    }

}
