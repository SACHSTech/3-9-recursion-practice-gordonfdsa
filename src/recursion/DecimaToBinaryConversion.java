package recursion;

public class DecimaToBinaryConversion {

    public static void main(String[] args) {
        System.out.println(toBinary(10));
    }

    public static String toBinary(int n) {
        if (n == 0)
            return "";

        return toBinary(n / 2) + (n % 2);
    }
}
