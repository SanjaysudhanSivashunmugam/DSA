# Insertion Sort
```java
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 3, 1, 65, 1};
		insertionSort(arr);
		for(int i : arr) {
		    System.out.print(i + " ");
		}
	}
	
	static void insertionSort(int arr[]) {
	    int n = arr.length;
	    for(int i = 1; i < n; i++) {
	        int j = i;
	        while(j > 0 && arr[j - 1] > arr[j]) {
	            int temp = arr[j];
	            arr[j] = arr[j - 1];
	            arr[j - 1] = temp;
	            j--;
	        }
	    }
	}
}
```