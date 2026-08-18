# Largest Element in Array
```
8
```
```java
public class Array
{
	public static void main(String[] args) {
		int arr[] = {1, 6, 3, 8, 3, 2};
		int largest = arr[0];
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println(largest);
	}
}
```