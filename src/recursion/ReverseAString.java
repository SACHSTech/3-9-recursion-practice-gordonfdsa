package recursion;

public class ReverseAString {

    public static void main(String[] args) {
        System.out.println(reverse("asdfghjkll")); 

    }

    public static String reverse(String s){

        if(s.length()==0)
        return "";

        return s.substring(s.length()-1, s.length()) + reverse(s.substring(0, s.length()-1));
    }

    
}
