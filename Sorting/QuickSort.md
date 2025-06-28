# Quick Sort
```
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 5, 6 ,7 ,1,6,3};
		quickSort(arr, 0, arr.length-1);
		System.out.print(Arrays.toString(arr));
		
	}
	
	public static void quickSort(int arr[], int low, int high) {
	    if(low < high) {
	        int pivotPoint = helper(arr, low, high);
	        quickSort(arr, low, pivotPoint-1);
	        quickSort(arr, pivotPoint+1, high);
	    }
	}
	
	public static int helper(int arr[], int low, int high) {
	    int pivot = low;
	    int i = low;
	    int j = high;
	    while(i < j) {
	        while(i <= high && arr[i] <= arr[pivot]) {
	            i++;
	        }
	        while(j >= low && arr[j] > arr[pivot]) {
	            j--;
	        }
	        if(i < j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    int temp = arr[pivot];
	    arr[pivot] = arr[j];
	    arr[j] = temp;
	    return j;
	}
}
```