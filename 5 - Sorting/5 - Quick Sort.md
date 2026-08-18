# Quick Sort
```java
public class Sorting
{
	public static void main(String[] args) {
		int arr[] = {4, 2, 1, 5, 3};
		quickSort(arr, 0, arr.length - 1);
		for(int i : arr) {
		    System.out.println(i);
		}
	}
	
	static void quickSort(int arr[], int low, int high) {
	    if(low < high) {
	        int pivot = fun(arr, low, high);
	        quickSort(arr, low, pivot - 1);
	        quickSort(arr, pivot + 1, high);
	    }
	}
	
	static int fun(int arr[], int low, int high) {
	    int pivot = low;
	    int i = low;
	    int j = high;
	    while(i < j) {
	        while(i < high && arr[pivot] >= arr[i]) {
	            i++;
	        }
	        
	        while(j > low && arr[pivot] < arr[j]) {
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