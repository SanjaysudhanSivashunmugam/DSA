# Frequency of a number
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    int arr[] = {1, 2, 1, 3, 2};
	    System.out.print(frequency(1, arr));
	}
	
	static int frequency(int number, int arr[]) {
	   HashMap<Integer, Integer> hm = new HashMap<>();
	   
	   for(int i = 0; i < arr.length; i++) {
	       if(hm.containsKey(arr[i])) {
	           hm.put(arr[i], hm.get(arr[i]) + 1);
	       }
	       else {
	           hm.put(arr[i], 1);
	       }
	   }
	   
	   return hm.getOrDefault(number, 0);
	}
}
```