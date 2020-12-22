public class InternetOrdersManager implements OrdersManager {
    private final int DEFAULT_SIZE = 0;
    private int size;
    private QueueNode head = null;
    private QueueNode tail = null;

    // вместо hashmap с адресом и заказом сделал как на UML с двусвязным списком-очередью, а сам
    // адрес встроил в клиента, который встроен в заказ. HashMap реализована в TableOrdersManager.

    public InternetOrdersManager() {
        size = DEFAULT_SIZE;
    }

    public InternetOrdersManager(Order order) {
        size = DEFAULT_SIZE;
        add(order);
    }

    public InternetOrdersManager(Order[] orders) {
        size = DEFAULT_SIZE;
        for (Order order : orders) add(order);
    }

    public boolean add(Order order) {
        if (head == null) {
            head = new QueueNode(order);
            tail = head;
        } else {
            QueueNode current = head;
            head = new QueueNode(null, order, current);
            head.next.prev = head;
        }
        size++;
        return true;
    }

    public Order remove() {
        if (tail != null) {
            QueueNode temp = tail;
            tail = tail.prev;
            temp.delete();
            size--;
            return temp.order;
        } else return null;
    }

    public Order remove(Address address) {
        if (tail != null) {
            QueueNode temp = tail;
            while (temp != null) {
                if (temp.order.getCustomer().getAddress() == address) {
                    temp.delete();
                    tail = temp.prev;
                    size--;
                    return temp.order;
                }
            }
        }
        return null;
    }

    public Order order() {
        return tail.order;
    }

    public Order order(Address address) {
        if (tail != null) {
            QueueNode temp = tail;
            while (temp != null) {
                if (temp.order.getCustomer().getAddress() == address) {
                    temp.delete();
                    return temp.order;
                }
            }
        }
        return null;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        if (head != null) {
            QueueNode temp = head;
            while (temp != null) {
                quantity += temp.order.itemQuantity(itemName);
                temp = temp.next;
            }
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int quantity = 0;
        if (head != null) {
            QueueNode temp = head;
            while (temp != null) {
                quantity += temp.order.itemQuantity(item);
                temp = temp.next;
            }
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        if (tail != null) {
            Order[] orders = new Order[size];
            int i = 0;
            QueueNode temp = tail;
            while (temp != null) {
                orders[i] = temp.order;
                temp = temp.prev;
                i++;
            }
            if (i != 0) return orders;
        }
        return null;
    }

    @Override
    public int ordersCostSummary() {
        int totalCost = 0;
        if (head != null) {
            QueueNode temp = head;
            while (temp != null) {
                totalCost += temp.order.costTotal();
                temp = temp.next;
            }
        }
        return totalCost;
    }

    @Override
    public int ordersQuantity() {
        if (head != null) { // size recounting
            int i = 0;
            QueueNode temp = head;
            while (temp != null) {
                temp = temp.next;
                i += 1;
            }
            if (size != i) {
                size = i;
            }
        } else {
            size = DEFAULT_SIZE;
        }
        return size;
    }
}
