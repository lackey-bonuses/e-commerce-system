public class ECommerceSystem {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product(1, "Laptop", 999.99);
        Product smartphone = new Product(2, "Smartphone", 499.99);

        // Create customers
        Customer customer1 = new Customer(101, "Alice", "alice@example.com");
        Customer customer2 = new Customer(102, "Bob", "bob@example.com");

        // Create orders
        Order order1 = new Order(201, customer1);
        order1.addProduct(laptop);
        order1.addProduct(smartphone);

        Order order2 = new Order(202, customer2);
        order2.addProduct(smartphone);

        // Display order information
        System.out.println("Order 1 Information:");
        order1.displayOrderInfo();

        System.out.println("\nOrder 2 Information:");
        order2.displayOrderInfo();
    }
}
