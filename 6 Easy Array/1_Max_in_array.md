# Max in Array
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 3, 1, 65, 100};
		int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
	}
}
```