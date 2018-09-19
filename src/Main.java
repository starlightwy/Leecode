import array.AddTwoNumbers;
import array.*;

public class Main {
    public static void main(String[] args) {
        GeneralTests.addBinary("11", "1");
        GeneralTests.changeLine();
        System.out.print("\n");

        //TwoSum
        System.out.print("TwoSum: ");
        int[] twoSumResult = TwoSum.twoSum(new int[]{1, 2, 3}, 3);
        for (int i = 0; i < twoSumResult.length; i++)
            System.out.print(twoSumResult[i]);
        System.out.print("\n");

        //AddTwoNumbers (ListNode)
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(1);
        System.out.println("\nAddTwoNumbers: \n" + AddTwoNumbers.addTwoNumbers(l1, l2));
        System.out.print("\n");

        //AddBinary
        System.out.println("AddBinary: \n" + AddBinary.addBinary("11", "1"));
        System.out.print("\n");
    }
}
