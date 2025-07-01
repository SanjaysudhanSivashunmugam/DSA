# Remove Duplicates
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4};
		int j = 1;
		for(int i = 1; i < arr.length; i++) {
		    if(arr[i-1] != arr[i]) {
		        arr[j] = arr[i];
		        j++;
		    }
		}
		System.out.print(Arrays.toString(arr));
	}
}
```