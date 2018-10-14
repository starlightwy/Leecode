package string;

public class ReverseInteger {
    public static int reverse(int x) {
        StringBuilder str = new StringBuilder();
        String org = String.valueOf(x);
        boolean start = false;
        if(x<0)
            str.append('-');
        for(int i=org.length()-1; i>=0; i--){
            if(org.charAt(i)!=0 && !start)
                start = true;
            if(start && org.charAt(i)!='-')
                str.append(org.charAt(i));
        }
        try{
            return Integer.parseInt(str.toString());
        }
        catch(Exception e){
            return 0;
        }
    }
}
