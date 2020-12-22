public class QueueNode {
    protected Order order;
    protected QueueNode next;
    protected QueueNode prev;


    QueueNode(Order order) {
        this(null, order, null);
    }

    QueueNode(QueueNode prev, Order order, QueueNode next) {
        this.order = order;
        this.next = next;
        this.prev = prev;
    }

    public void delete() {
        if (this.prev != null) this.prev.next = this.next;
        if (this.next != null) this.next.prev = this.prev;
    }
}