package array;

public class ArrayTests {
    /**
     * 在一个array中找到两个不重复的数，相加等于target。
     * */
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j==i)
                    continue;
                else if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
                else
                    continue;
            }
        }
        return null;
    }

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

    public String addBinary(String a, String b) {
        int d = a.length() - b.length();
        if(d>0)
            for(int i=0;i<d;i++)  b = "0" + b;
        else if(d<0)
            for(int i=0;i<-d;i++)  a = "0" + a;

        String result = "";
        char carry = '0';
        for(int i=a.length()-1;i>=0;i--){
            int temp = numOfOne(a.charAt(i), b.charAt(i), carry);
            if(temp==0){
                result = "0" + result;
                carry = '0';
            }
            else if(temp==1){
                result = "1" + result;
                carry = '0';
            }
            else if(temp==2){
                result = "0" + result;
                carry = '1';
            }
            else if(temp==3){
                result = "1" + result;
                carry = '1';
            }
            if(i==0 && carry=='1')
                result = "1" + result;
        }
        return result;
    }

    public int numOfOne(char a, char b, char c){
        char[] arr = new char[] {a, b, c};
        int result = 0;
        for(char element: arr)
            if(element=='1')  result++;
        return result;
    }
}
