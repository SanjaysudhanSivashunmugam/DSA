import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5, 6};
         int k = 2;
         reverse(arr, 0, arr.length-1);
         reverse(arr, 0, k-1);
         reverse(arr, k, arr.length-1);
        System.out.print(Arrays.toString(arr));

    }
    public static void reverse(int arr[], int low, int high){
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}