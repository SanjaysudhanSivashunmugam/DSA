# Quick Sort
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 3, 1, 65, 1};
		quickSort(arr, 0, 4);
		for(int i : arr) {
		    System.out.print(i + " ");
		}
	}
	
	static void quickSort(int arr[], int low, int high) {
	   if(low < high) {
        int pivot = helper(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
       }
	}
	
	static int helper(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
	    while(i < j) {
            while(i <= high && pivot >= arr[i]) {
                i++;
            }

            while(j >= low && pivot < arr[j]) {
                j--;
            }

            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
	}
}
```