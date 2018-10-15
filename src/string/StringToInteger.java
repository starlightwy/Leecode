package string;

public class StringToInteger {
    //这道题实在是太反人类了！！！
    public static int myAtoi(String str) {
        if(str.trim().equals("") || str.trim().equals("-") || str.trim().equals("+") || (!Character.isDigit(str.trim().charAt(0)) && str.trim().charAt(0)!='-' && str.trim().charAt(0)!='+')) {
            return 0;
        }
        StringBuilder result = new StringBuilder();
        boolean positive = false;
        boolean negative = false;
        boolean started = false;
        for(int i=0; i<str.length(); i++){
            if(!positive && !started && str.charAt(i)=='+') {
                if(Character.isDigit(str.charAt(i+1))){
                    positive = true;
                    result.append('+');
                }
                else
                    return 0;
            }
            if(!negative && !started && str.charAt(i)=='-') {
                if(Character.isDigit(str.charAt(i+1))){
                    negative = true;
                    result.append('-');
                }
                else
                    return 0;
            }
            if(Character.isDigit(str.charAt(i))) {
                started = true;
                result.append(str.charAt(i));
            }
            if(started && !Character.isDigit(str.charAt(i)))
                break;
        }
        try{
            return Integer.parseInt(result.toString());
        }
        catch(Exception e){
            if(negative)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
    }
    //Character.isDigit(str.charAt(i))!!!
}
