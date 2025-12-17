# Selection Sort
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    int arr[] = {1, 2, 1, 3, 2};
	    
	    arr = selectionSort(arr);
	    for(int i : arr) {
	        System.out.print(i + " ");
	    }
	}
	
	static int[] selectionSort(int arr[]) {
	    int n = arr.length;
	    
	    for(int i = 0; i < n - 1; i++) {
	        int minIndex = i;
	        
	        for(int j = i + 1; j < n; j++) {
	            if(arr[minIndex] > arr[j]) {
	                minIndex = j;
	            }
	        }
	        
	        int temp = arr[i];
	        arr[i] = arr[minIndex];
	        arr[minIndex] = temp;
	    }
	    
	    return arr;
	}
}
```