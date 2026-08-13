# Merge Sort
```java
import java.util.*;
class Sorting {
    public static void main(String[] args) {
        int arr[] = {8, 5, 9, 3, 1, 0, 2};
        mergeSort(arr, 0, arr.length - 1);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if(low == high) {
            return;
        }
        int mid = (low + high) / 2;  
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if(arr[i] < arr[j]) {
                temp.add(arr[i]);
                i++;
            }

            else {
                temp.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
    
        while (j <= high) {
            temp.add(arr[j]);
            j++;
        }

        for(int k = low; k <= high; k++) {
            arr[k] = temp.get(k - low);
        }
    }
}
```