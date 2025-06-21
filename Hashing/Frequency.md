# Frequency of elements in array

```java
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        frequency(arr, n);
	}
	
	static void frequency(int arr[], int n) {
	    HashMap <Integer, Integer> map = new HashMap<>();
	    for(int i = 0; i < n; i++) {
	        if(map.containsKey(arr[i])) {
	            map.put(arr[i], map.get(arr[i])+1);
	        }
	        
	        else {
	            map.put(arr[i], 1);
	        }
	    }
	}
}
```