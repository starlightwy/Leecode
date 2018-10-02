package string;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int len=s.length();
        while(len>=0){
            for(int i=0;i+len<=s.length();i++){
                if(isPali(s, i, i+len-1))
                    return s.substring(i, i+len);
            }
            len--;
        }
        return s.substring(0,1);
    }

    public boolean isPali(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
