package recursion;

public class SubsetsOfASet {
    public static void main(String[] args) {
        generateSubsets("abc", "");
    }

    public static void generateSubsets(String s, String current) {

        if (s.length() == 0){
        System.out.println(current);
        return;
        }

        generateSubsets(s.substring(1, s.length()), current+s.charAt(0));
        generateSubsets(s.substring(1, s.length()), current);
    }
}
