import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        customer.displayCustomerInfo();
        System.out.println("Products in the order:");
        for (Product product : products) {
            product.displayProductInfo();
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
