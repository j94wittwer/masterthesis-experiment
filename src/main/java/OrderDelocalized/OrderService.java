package OrderDelocalized;

public class OrderService {

    public void placeOrder(Customer customer, Order order) {
        customer.addOrder(order);
        System.out.println("Order has been placed");
    }

    public void processOrder(Customer customer, Order order) {
        if (customer.getOpenOrders().contains(order)) {
            double price = order.calculatePrice();
            customer.moveToHistory(order);
            System.out.println("Order for Customer " + customer.getName() + "has been processed.");
        } else {
            System.out.println("It seems like this order does not belong to this customer.");
        }
    }


}
