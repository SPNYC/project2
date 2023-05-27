package project2;

public class CarTester {
    public static void main(String[] args) {

        Car sedan = new Sedan(25000, "Sky Blue", 184);
        System.out.println("Sedan Price is $" + sedan.calculateSalePrice());

        Car truck = new Truck(80000, "Black", 5000);
        System.out.println("Truck  Price is $" + truck.calculateSalePrice());
    }
}
