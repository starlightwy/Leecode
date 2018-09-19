package array;

public class AddBinary {
    public static String addBinary(String a, String b) {
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

    public static int numOfOne(char a, char b, char c){
        char[] arr = new char[] {a, b, c};
        int result = 0;
        for(char element: arr)
            if(element=='1')  result++;
        return result;
    }
}
