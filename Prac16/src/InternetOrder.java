import java.util.Arrays;

public class InternetOrder implements Order {
    private final Address EMPTY_ADDRESS = new Address("", 0, "", 0, '0', 0);
    private final Customer MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 21, EMPTY_ADDRESS);
    private final Customer IMMATURE_UNKNOWN_CUSTOMER = new Customer("", "", 0, EMPTY_ADDRESS);
    private final int DEFAULT_SIZE = 0;
    private int size;
    private ListNode head = null;
    private Customer customer;

    public InternetOrder() {
        size = DEFAULT_SIZE;
        head = null;
        customer = IMMATURE_UNKNOWN_CUSTOMER;
    }

    public InternetOrder(int age) {
        size = DEFAULT_SIZE;
        head = null;
        if (age <= 18) customer = IMMATURE_UNKNOWN_CUSTOMER;
        else customer = MATURE_UNKNOWN_CUSTOMER;
    }

    public InternetOrder(Customer customer) {
        size = DEFAULT_SIZE;
        head = null;
        this.customer = customer;
    }

    public InternetOrder(MenuItem[] array) {
        for (MenuItem item : array) {
            add(item);
            size++;
        }
        customer = IMMATURE_UNKNOWN_CUSTOMER;
    }

    public InternetOrder(MenuItem[] array, int age) {
        for (MenuItem item : array) {
            add(item);
            size++;
        }
        if (age <= 18) customer = IMMATURE_UNKNOWN_CUSTOMER;
        else customer = MATURE_UNKNOWN_CUSTOMER;
    }

    public InternetOrder(MenuItem[] array, Customer customer) {
        for (MenuItem item : array) {
            add(item);
            size++;
        }
        this.customer = customer;
    }

    @Override
    public boolean add(MenuItem item) {
        if (head == null) {
            head = new ListNode(item);
        } else {
            ListNode current = head;
            head = new ListNode(item, current);
        }
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        if (head != null) {
            String[] itemsNames = new String[size];
            int i = 0;
            ListNode temp = head;
            while (temp != null) {
                itemsNames[i] = temp.menuItem.getName();
                temp = temp.next;
                i++;
            }
            return itemsNames;
        } else return null;
    }

    @Override
    public int itemsQuantity() {
        if (head != null) {
            int i = 0;
            ListNode temp = head;
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

    @Override
    public int itemQuantity(String itemName) {

        int quantity = 0;
        if (head != null) {
            ListNode temp = head;
            while (temp != null) {
                if (itemName.equals(temp.menuItem.getName())) quantity += 1;
                temp = temp.next;
            }
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int quantity = 0;
        if (head != null) {
            ListNode temp = head;
            while (temp != null) {
                if (itemName == temp.menuItem) quantity += 1;
                temp = temp.next;
            }
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        if (head != null) {
            MenuItem[] items = new MenuItem[size];
            int i = 0;
            ListNode temp = head;
            while (temp != null) {
                items[i] = temp.menuItem;
                temp = temp.next;
                i++;
            }
            if (i != 0) return items;
        }
        return null;
    }

    @Override
    public boolean remove(MenuItem menuItem) {
        if (head != null) {
            ListNode temp = head;
            ListNode tempPrev = null;
            while (temp != null) {
                if (menuItem == temp.menuItem) {
                    if (tempPrev != null) {
                        tempPrev.next = temp.next;
                    } else head = temp.next;
                    size--;
                    return true;
                }
                tempPrev = temp;
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public boolean remove(String itemName) {
        if (head != null) {
            ListNode temp = head;
            ListNode tempPrev = null;
            while (temp != null) {
                if (itemName.equals(temp.menuItem.getName())) {
                    if (tempPrev != null) {
                        tempPrev.next = temp.next;
                    } else head = temp.next;
                    size--;
                    return true;
                }
                tempPrev = temp;
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int i = 0;
        if (head != null) {
            ListNode temp = head;
            ListNode tempPrev = null;
            while (temp != null) {
                if (itemName.equals(temp.menuItem.getName())) {
                    if (tempPrev != null) {
                        tempPrev.next = temp.next;
                    } else head = temp.next;
                    i++;
                }
                tempPrev = temp;
                temp = temp.next;
            }
        }
        size -= i;
        return i;
    }

    @Override
    public int removeAll(MenuItem menuItem) {
        int i = 0;
        if (head != null) {
            ListNode temp = head;
            ListNode tempPrev = null;
            while (temp != null) {
                if (menuItem == temp.menuItem) {
                    if (tempPrev != null) {
                        tempPrev.next = temp.next;
                    } else head = temp.next;
                    i++;
                }
                tempPrev = temp;
                temp = temp.next;
            }
        }
        size -= i;
        return i;
    }

    @Override
    public MenuItem[] sortedItemsByCost() {
        if (head != null) {
            MenuItem[] items = getItems();
            int i = 0;
            boolean sorted = false;
            MenuItem temp;
            while (!sorted) {
                sorted = true;
                for (i = 0; i < items.length - 1; i++) {
                    if (items[i].getCost() < items[i + 1].getCost()) {
                        temp = items[i];
                        items[i] = items[i + 1];
                        items[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
            return items;
        } else return null;
    }

    @Override
    public int costTotal() {
        int totalCost = 0;
        if (head != null) {
            ListNode temp = head;
            while (temp != null) {
                totalCost += temp.menuItem.getCost();
                temp = temp.next;
            }
        }
        return totalCost;
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(getItems()));
        return sb.toString();
    }

}
