# Largest Element in Array

```java
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 6, 9, 13};
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
		    if(max < arr[i]) {
		        max = arr[i];
		    }
		}
		System.out.print(max);
	}
}
```