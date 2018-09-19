package array;

import java.util.LinkedList;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public String toString(){
        LinkedList<Integer> print = new LinkedList<>();
        ListNode current = this;
        while(current!=null){
            print.add(current.val);
            current = current.next;
        }
        return print.toString();
    }
}
