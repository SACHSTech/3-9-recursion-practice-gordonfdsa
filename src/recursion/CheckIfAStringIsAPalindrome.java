package recursion;

public class CheckIfAStringIsAPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // print true
        System.out.println(isPalindrome("racaffdfffar")); //print false 
    }

    public static boolean isPalindrome(String s) {

        if(s.length()==1)
        return true; 

        if(s.charAt(0)!=s.charAt(s.length()-1))
        return false; 
        
        return isPalindrome(s.substring(1, s.length()-1)); 
        
    }

}
