package recursion;

public class EvenNumbersInRange {

    public static void main(String[] args) {
        printEvens(5, 12); // Output: 1 2 3 4 5
    }


    public static void printEvens(int start, int end){
        if(start>end)
        return ;

        if(start%2==0)
        System.out.println(start);

        printEvens(start+1, end);
    }
}
