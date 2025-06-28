# Bubble Sort
```java
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		// Bubble Sort
		// 1 2 3 4 
		for(int i = n - 1; i >= 1; i--) {
		    for(int j = 0; j < i; j++) {
		        if(arr[j] > arr[j+1]) {
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		for(int i : arr) {
		    System.out.print(i + " ");
		}
	}
}
```