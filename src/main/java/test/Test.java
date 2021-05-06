package test;

public class Test {

    public static void main(String[] args) {
        reverse(-1234);
        
        //0
        //-123
        //123
        //2.34
        //1000
        
    }

    private static void reverse(int n) {
        
        String str = n + "";
        char[] arr = str.toCharArray();
        String temp = null;
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1 ; i>=0; i--) {
            if(str.startsWith("-")) {
                 temp = "-";
            } else {
                sb.append(arr[i]);    
            }
            
        }
        if(temp != null)
            System.out.println(temp+sb.toString());
        else
            System.out.println(sb.toString());
    }
}
