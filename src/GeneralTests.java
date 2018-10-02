public class GeneralTests {

    public static String addBinary(String a, String b) {
        String result = ""+'1'+'a';
        System.out.println(result.valueOf('a'));
        return result;
    }

    public static void changeLine() {
        int a = 1;
        if(a==1)  for(int i=0;i<2;i++)  a += i;
        System.out.println(a);
    }

    public static void subString(){
        String str = "apple";
        System.out.println(str.substring(1,3));
    }

}
