public interface OrdersManager {
    public int itemQuantity(String itemName);

    public int itemQuantity(MenuItem item);

    public Order[] getOrders();

    public int ordersCostSummary();

    public int ordersQuantity();
}
