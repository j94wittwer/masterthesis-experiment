package OrderDelocalized;

import java.util.Map;

public class Order {
    private Customer customer;
    private Map<String, Integer> products;

    public Order(Customer customer, Map<String, Integer> products) {
        this.customer = customer;
        this.products = products;
    }

    public double calculatePrice() {
        double totalPrice = 0;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            totalPrice += product.getValue();
        }
        return totalPrice;
    }

    public double calculateDiscountPrice() {
        double discountPrice = 0;
        double discountRate = 0.1;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            discountPrice += product.getValue() * (1 - discountRate);
        }
        return discountPrice;
    }

}
