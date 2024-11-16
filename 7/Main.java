import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип доставки: 1 - Стандартная, 2 - Экспресс, 3 - Международная");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                deliveryContext.setShippingStrategy(new StandardShippingStrategy());
                break;
            case "2":
                deliveryContext.setShippingStrategy(new ExpressShippingStrategy());
                break;
            case "3":
                deliveryContext.setShippingStrategy(new InternationalShippingStrategy());
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }
        System.out.println("Введите вес посылки (кг):");
        double weight = scanner.nextDouble();
        System.out.println("Введите расстояние доставки (км):");
        double distance = scanner.nextDouble();
        try {
            double cost = deliveryContext.calculateCost(weight, distance);
            System.out.printf("Стоимость доставки: %.2f%n", cost);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
