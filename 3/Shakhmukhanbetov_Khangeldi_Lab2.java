//DRY

//1
/*
public class OrderService {

    private double calculateTotalPrice(int quantity, double price) {
        return quantity * price;
    }

    public void createOrder(String productName, int quantity, double price) {
        double totalPrice = calculateTotalPrice(quantity, price);
        System.out.println("Order for " + productName + " created. Total: " + totalPrice);
    }

    public void updateOrder(String productName, int quantity, double price) {
        double totalPrice = calculateTotalPrice(quantity, price);
        System.out.println("Order for " + productName + " updated. New total: " + totalPrice);
    }
}
*/

//2

/*
public class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

public class Car extends Vehicle {
}

public class Truck extends Vehicle {
}
 */


//KISS

//3
/*
public class Calculator {

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}
 */

//4
/*
public class Client {
    public void execute() {
        Singleton singleton = new Singleton();
        singleton.doSomething();
    }
}

class Singleton {
    public void doSomething() {
        System.out.println("Doing something");
    }
}
 */


//YAGNI

//5

/*
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

 */

//6

/*
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
}

 */