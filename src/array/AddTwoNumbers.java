package array;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int solution = 1;
        if(solution==1){
            ListNode node = new ListNode(0);
            ListNode result = new ListNode(0);
            boolean flag = false;
            while(true){
                node.val += l1.val + l2.val;
                int next = 0;
                if(node.val>=10){
                    node.val -= 10;
                    next = 1;
                }
                node.next = new ListNode(next);
                if(flag==false){
                    result = node;
                    flag = true;
                }
                if(l1.next==null && l2.next!=null)
                    l1.next = new ListNode(0);
                else if(l1.next!=null && l2.next==null)
                    l2.next = new ListNode(0);
                l1 = l1.next;
                l2 = l2.next;

                if(l1==null && l2==null){
                    if(node.next.val==0)
                        node.next = null;
                    break;
                }
                node = node.next;
            }
            return result;
        }
        else if(solution==2){
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;
        }
        return null;
    }
}
