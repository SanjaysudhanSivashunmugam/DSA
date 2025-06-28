# Insertion Sort

```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1,4,5,8,3,2,70,34,6};
		int n = arr.length;
		for(int i = 0; i < n; i++) {
		    int j = i;
		    while(j>0 && arr[j-1] > arr[j]) {
		        int temp = arr[j];
		        arr[j] = arr[j-1];
		        arr[j-1] = temp;
		        j--;
		    }
		}
		System.out.print(Arrays.toString(arr));
	}
}
```