# Second Largest
```java
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 16, 9, 13 , 16};
		int max = arr[0];
		int second = arr[0];
		for(int i = 1; i < arr.length; i++) {
		    if(max < arr[i]) {
		        second = max;
		        max = arr[i];
		    }
		    else if (second < arr[i] && max != arr[i]) {
		        second = arr[i];
		    }
		}
		System.out.print(second);
	}
}
```