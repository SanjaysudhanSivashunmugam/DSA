# Left Rotate Array by one Place
```
Input: 1 2 3 4 5
Output: 2 3 4 5 1
```
```java
public class Array
{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int temp = arr[0];

		for(int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}

		arr[n - 1] = temp;

		for(int j : arr) {
			System.out.print(j + " ");
		}
	}
}
```