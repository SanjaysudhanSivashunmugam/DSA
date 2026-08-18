# Second Largest Element in Array
```
6
```
```java
public class Array
{
	public static void main(String[] args) {
		int arr[] = {1, 6, 3, 8, 3, 2, 8};
		int largest = arr[0];
		int secondLargest = -1;
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}

			else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		System.out.println(secondLargest);
	}
}
```