import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) throws Exception {
        TableOrdersManager tableOrdersManager = new TableOrdersManager();
        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();

        Order tableOrder = new TableOrder();
        Order internetOrder = new InternetOrder();

        Address mirea = new Address("Moscow", 119454, "prospekt Vernadskogo", 78, 'a', 20);
        Customer student = new Customer("Ilya", "Soldatov", 19, mirea);

        MenuItem spaghetti = new Dish(200, "Spaghetti", "yummy");
        Dish wok = new Dish(180, "WOK", "Enjoy");
        Drink juice = new Drink("Orange juice", 50, "Classic orange juice");
        Drink freeDrink = new Drink("Free drink", "It's Free Real (not) Estate");

        try {
            Dish chicken = new Dish(-10, "Chicken", "free chicken and 10 rubs giveaway");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tableOrder.add(spaghetti);
        tableOrder.add(juice);

        MenuItem[] order2 = new MenuItem[]{spaghetti, juice, freeDrink};
        Order tableOrder2 = new TableOrder(order2);

        tableOrdersManager.add(3, tableOrder);
        tableOrdersManager.add(8, tableOrder2);
        System.out.println(Arrays.toString(tableOrdersManager.freeTableNumbers()));

        System.out.println("itemQuantity(juice): " + tableOrdersManager.itemQuantity(juice));
        System.out.println("itemQuantity(wok): " + tableOrdersManager.itemQuantity(wok));
        System.out.println("getorders: " + Arrays.toString(tableOrdersManager.getOrders()));
        System.out.println("getorder table 1: " + tableOrdersManager.getOrder(1));
        System.out.println("getorder table 3: " + tableOrdersManager.getOrder(3));
        System.out.println("all orders cost: " + tableOrdersManager.ordersCostSummary());
        System.out.println("Order for table " + tableOrdersManager.remove(tableOrder) + " is done");
        System.out.println("ordersQuantity: " + tableOrdersManager.ordersQuantity());

        System.out.println("\norder total cost: " + tableOrder2.costTotal());
        System.out.println(Arrays.toString(tableOrder2.itemsNames()));
        System.out.println(Arrays.toString(tableOrder2.sortedItemsByCost()));

        internetOrder.add(wok);
        internetOrder.add(juice);
        internetOrder.setCustomer(student);

        internetOrdersManager.add(internetOrder);
        System.out.println("\nwoks total: " + internetOrdersManager.itemQuantity(wok));
        System.out.println("orders: " + Arrays.toString(internetOrdersManager.getOrders()));
        System.out.println("removed" + internetOrdersManager.remove(mirea));
        System.out.println("orders after removing last one: " + Arrays.toString(internetOrdersManager.getOrders()));

    }
}
