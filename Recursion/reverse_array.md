# Reverse Array
```java
public class Main
{
	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 3, 4, 5, 6};
		int n = arr.length;
		arr = reverse(arr, 0, n - 1);
		for(int k : arr) {
	       System.out.print(k + " ");
	    }
	}
	
	static int[] reverse(int arr[], int i, int j) {
	    if(i >= j) {
	        return arr;
	    }
	    
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	    return reverse(arr, i + 1, j - 1);
	}
}
```