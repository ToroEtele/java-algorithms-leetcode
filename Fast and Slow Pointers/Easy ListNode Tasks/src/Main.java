public class Main {
    //Exercise 1: Linked List Cycle
    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        do {
            if (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        } while(true);
    }

    // Exercise 2: Middle of a Linked List
    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (true) {
            if (fast.next == null || fast.next.next == null) {
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

    }

    public static void main(String[] args) {
        //Exercise 1: Linked List Cycle
        ListNode tail = new ListNode(-4);
        ListNode two = new ListNode(0, tail);
        ListNode one = new ListNode(2, two);
        ListNode head = new ListNode(3, one);
        tail.next = one;
        System.out.println(hasCycle(head));

        // Exercise 2: Middle of a Linked List
        tail = new ListNode(5);
        ListNode three = new ListNode(4, tail);
        two = new ListNode(3, three);
        one = new ListNode(2, two);
        head = new ListNode(1, one);
        System.out.println(middleNode(head).val);

    }
}
