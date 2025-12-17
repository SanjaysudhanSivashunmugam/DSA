# Check Array Sorted
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(checkSorted(arr));
	}

    public static boolean checkSorted(int arr[]) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            if(arr[i - 1] > arr[i]) {
                return false;
            }
        }

        return true;
    }
}
```