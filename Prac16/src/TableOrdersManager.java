import java.util.HashMap;

public class TableOrdersManager implements OrdersManager {
    public static class OrderAlreadyAddedException extends Exception {
        public OrderAlreadyAddedException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static class IllegalTableNumber extends IllegalArgumentException {
        public IllegalTableNumber(String errorMessage) {
            super(errorMessage);
        }
    }


    private final int DEFAULT_SIZE = 0;
    private int size;
    private final int[] tables = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private HashMap<Integer, Order> tableOrder;

    public TableOrdersManager() {
        size = DEFAULT_SIZE;
        tableOrder = new HashMap<>();
    }

    public void add(int table, Order order) throws OrderAlreadyAddedException {
        if (tableOrder.containsKey(table)) {
            throw new OrderAlreadyAddedException("Order was already added");
        } else if (table > 20 | table < 1) {
            throw new IllegalTableNumber("Illegal table number");
        } else {
            tableOrder.put(table, order);
            size++;
        }
    }


    public void addItem(int table, MenuItem item) {
        tableOrder.get(table).add(item);
    }

    public int freeTableNumber() {
        for (int table : tables) if (!tableOrder.containsKey(table)) return table;
        return 0;
    }

    public int[] freeTableNumbers() {
        int[] tableNums = new int[0];
        for (int table : tables)
            if (!tableOrder.containsKey(table)) {
                int[] tableNumsTemp = tableNums;
                tableNums = new int[tableNumsTemp.length + 1];
                System.arraycopy(tableNumsTemp, 0, tableNums, 0, tableNumsTemp.length);
                tableNums[tableNums.length - 1] = table;
            }
        return tableNums;
    }

    public Order getOrder(int table) {
        return tableOrder.get(table);
    }

    public Order remove(int table) {
        Order order = tableOrder.get(table);
        tableOrder.remove(table);
        size--;
        return order;
    }

    public int remove(Order order) {
        int i = 0;
        for (int number : tableOrder.keySet()) {
            if (tableOrder.get(number) == order) {
                i = number;
                tableOrder.remove(number);
                size--;
                break;
            }
        }
        return i;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        if (size != 0) {
            for (Order order : tableOrder.values()) {
                quantity += order.itemQuantity(itemName);
            }
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int quantity = 0;
        if (size != 0) {
            for (Order order : tableOrder.values()) {
                quantity += order.itemQuantity(item);
            }
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        if (size != 0) {
            Order[] orders = new Order[size];
            int i = 0;
            for (int number : tableOrder.keySet()) {
                orders[i] = tableOrder.get(number);
                i++;
            }
            return orders;
        } else return null;
    }

    @Override
    public int ordersCostSummary() {
        int totalCost = 0;
        for (int number : tableOrder.keySet()) {
            totalCost += tableOrder.get(number).costTotal();
        }
        return totalCost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
