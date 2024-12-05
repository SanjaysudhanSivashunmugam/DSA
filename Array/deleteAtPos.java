import java.util.Arrays;

public class DeleteAtPos {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int pos = 2;
        delete(arr,pos);
        System.out.println(Arrays.toString(arr));
    }
    public static void delete(int arr[], int pos){
        for(int i = pos+1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
    }
}
