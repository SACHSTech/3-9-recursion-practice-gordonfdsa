package recursion;

public class PowerFunction {

    public static void main(String[] args){
        System.out.println(power(2, 3));
        System.out.println(power(5, 6));
    }



    public static int power(int base, int exponent){
        if(exponent == 1)
        return base; 

        return base * power(base, exponent-1);
    }
}
