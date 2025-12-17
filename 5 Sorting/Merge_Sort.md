# Merge Sort
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 3, 1, 65, 1};
		mergeSort(arr, 0, 4);
		for(int i : arr) {
		    System.out.print(i + " ");
		}
	}
	
	static void mergeSort(int arr[], int low, int high) {
	   if(low >= high) {
	       return;
	   }
	   
	   int mid = (low + high) / 2;
	   mergeSort(arr, low, mid);
	   mergeSort(arr, mid + 1, high);
	   merge(arr, low, mid, high);
	}
	
	static void merge(int arr[], int low, int mid, int high) {
	    int left = low;
	    int right = mid + 1;
	    ArrayList<Integer> temp = new ArrayList<>();
	    while(left <= mid && right <= high) {
	        if(arr[left] > arr[right]) {
	            temp.add(arr[right]);
	            right++;
	        }
	        else {
	            temp.add(arr[left]);
	            left++;
	        }
	    }
	    
	    while(right <= high) {
	        temp.add(arr[right]);
	        right++;
	    }
	    while(left <= mid) {
	        temp.add(arr[left]);
	        left++;
	    }
	    
	    for(int i = low; i <= high; i++) {
	        arr[i] = temp.get(i - low); 
	    }
	}
}
```