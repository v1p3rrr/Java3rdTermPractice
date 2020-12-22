public interface Order {
    public boolean add(MenuItem menuItem);

    public String[] itemsNames();

    public int itemsQuantity();

    public int itemQuantity(String itemName);

    public int itemQuantity(MenuItem itemName);

    public MenuItem[] getItems();

    public boolean remove(MenuItem menuItem);

    public boolean remove(String itemName);

    public int removeAll(String itemName);

    public int removeAll(MenuItem menuItem);

    public MenuItem[] sortedItemsByCost();

    public int costTotal();

    public Customer getCustomer();

    public void setCustomer(Customer customer);
}
