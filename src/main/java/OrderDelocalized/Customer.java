package OrderDelocalized;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private boolean isMember;
    private List<Order> openOrders;
    private List<Order> orderHistory;

    public Customer(String name, String email, boolean isMember) {
        this.name = name;
        this.email = email;
        this.isMember = isMember;
        this.openOrders = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }

    public void addOrder(Order order) {
        openOrders.add(order);
    }

    public void moveToHistory(Order order) {
        if (openOrders.contains(order)) {
            openOrders.remove(order);
            orderHistory.add(order);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public List<Order> getOpenOrders() {
        return openOrders;
    }

    public void setOpenOrders(ArrayList<Order> openOrders) {
        this.openOrders = openOrders;
    }
}
