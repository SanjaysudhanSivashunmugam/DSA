import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 4, 5};
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i + 1] = arr[j];
                arr[j] = 0;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}