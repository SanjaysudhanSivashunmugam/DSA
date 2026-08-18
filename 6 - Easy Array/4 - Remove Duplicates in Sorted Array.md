# Remove Duplicates in Sorted Array
```java
public class Array
{
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 3, 3};
		int n = arr.length;
		int i = 0;
		for(int j = 1; j < n; j++) {
			if(arr[j] != arr[i]) {
				i += 1;
				arr[i] = arr[j];
			}
		}

		for(i = i + 1; i < n; i++) {
			arr[i] = 0;
		}

		for(int j : arr) {
			System.out.print(j + " ");
		}
	}
}
```