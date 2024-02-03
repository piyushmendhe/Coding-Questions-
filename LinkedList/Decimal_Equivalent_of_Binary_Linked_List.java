package LinkedList;

    class ListNode {
        int val;
        ListNode next;
        
        public ListNode(int val) {
            this.val = val;
        }
    }
    
public class Decimal_Equivalent_of_Binary_Linked_List {
        public int getDecimalValue(ListNode head) {
            final int MOD = 1000000007; // 10^9 + 7
            long decimalValue = 0; // Use long to handle large values
            
            ListNode current = head;
            while (current != null) {
                decimalValue = (decimalValue * 2 + current.val) % MOD;
                current = current.next;
            }
            
            return (int) decimalValue;
        }
        
        public static void main(String[] args) {
            Decimal_Equivalent_of_Binary_Linked_List solution = new Decimal_Equivalent_of_Binary_Linked_List();
            
            // Example binary linked list: 0 -> 1 -> 1 (binary representation of decimal 3)
            ListNode head = new ListNode(0);
            head.next = new ListNode(1);
            head.next.next = new ListNode(1);
            
            int decimalValue = solution.getDecimalValue(head);
            System.out.println("Decimal equivalent: " + decimalValue); // Output: 3
        }
}
    
    

