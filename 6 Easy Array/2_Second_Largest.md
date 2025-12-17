# Second Largest in Array
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1, 3, 1, 65, 100};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] > secondLargest && largest != arr[i]) {
                secondLargest = arr[i];
            }
        }

        System.out.println(largest + " " + secondLargest);
	}
}
```