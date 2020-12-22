public class ListNode {
    protected MenuItem menuItem;
    protected ListNode next;

    ListNode(MenuItem menuItem) {
        this.menuItem = menuItem;
        this.next = null;
    }

    ListNode(MenuItem menuItem, ListNode next) {
        this.menuItem = menuItem;
        this.next = next;
    }
}