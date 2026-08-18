# Check Array Sorted
```
false
```
```java
public class Array
{
	public static void main(String[] args) {
		int arr[] = {1, 6, 3, 8, 3, 2, 8};
		int n = arr.length;
		boolean isSorted = check(arr, n);
		System.out.println(isSorted);
	}

	public static boolean check(int arr[], int n) {
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}

		return true;
	}
}
```