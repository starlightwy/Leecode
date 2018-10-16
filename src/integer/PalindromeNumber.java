package integer;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0 || x==Integer.MAX_VALUE)   return false;
        int pos = 1;
        while((int)(x/Math.pow(10,pos))!=0) pos++;
        System.out.println("pos="+pos);
        int pali = 0;
        for(int i=pos; i>0; i--){
            pali += ((int)(x%Math.pow(10,i)/Math.pow(10,i-1)))*Math.pow(10,(pos-i));
        }
        System.out.println("pali="+pali);
        if(pali==x)   return true;
        return false;
    }

    public static boolean solution(int x){
        int revertedNumber = 0;
        while(x > revertedNumber) {
            System.out.println("x="+x);
            revertedNumber = revertedNumber * 10 + x % 10;
            System.out.println("revertedNumber="+revertedNumber);
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
