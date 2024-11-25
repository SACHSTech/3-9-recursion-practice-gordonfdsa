package recursion;

public class ArraySum {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 6, 2, 3}; 
        System.out.println(sumArray(arr, 5));
    }

    public static int sumArray(int[] arr, int n){
        if(n==0)
        return 0;

        return (sumArray(arr, n-1) + arr[n-1]);
    }
}
