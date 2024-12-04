import java.util.*;
public class insertAtPos{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int arr[] = new int[6];
        int size = 5; 
        for(int i = 0; i < size; i++){
            arr[i] = Sc.nextInt();
        }
        insert(100, 2, arr, size);
        System.out.println(Arrays.toString(arr));
        Sc.close();
    }
    public static void insert(int val, int pos, int arr[], int size){
        for(int i = size-1; i >= pos; i--){  //5 is the Size of Array
            arr[i+1] = arr[i];
        }
        arr[pos] = val;
    }
}
