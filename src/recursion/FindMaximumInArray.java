package recursion;

public class FindMaximumInArray {


    public static void main(String[] args){
        int[] arr = {1, 4, 232, 3, 5};
        System.out.println(findMax(arr, 5));
    }


    public static int findMax(int[] arr, int n){
        if(n==0)
        return arr[0];

        return Math.max(arr[n-1], findMax(arr, n-1));
    }
}
