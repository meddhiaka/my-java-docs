public class ReverseString {
    public static String reversingString(String str) {
        StringBuilder res = new StringBuilder();
        for(int i = str.length()-1; i>=0 ; i-- ){
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String ch = "hello world";
        String res = reversingString(ch);
        System.out.println("the reversed string of \"" + ch + "\" is \"" + res + "\"");
    }
}
