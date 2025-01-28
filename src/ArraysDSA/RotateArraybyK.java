package ArraysDSA;

import java.util.Arrays;

public class RotateArraybyK {

    public static void rotate(int[] arr,int k)
    {
        int n= arr.length;
        k=k%n;
        revsere(arr,0,n-1);
        revsere(arr, 0, k - 1);
        revsere(arr, k, n - 1);
    }

    private static void revsere(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);

        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));
    }

}
//5, 6, 7, 1, 2, 3, 4]