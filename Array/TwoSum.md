# Two Sum
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {2,7,11,15};
	    int k = 9;
		System.out.println(twoSum(arr,k));
	}
	
	static boolean twoSum(int arr[], int k) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i = 0; i < arr.length; i++) {
	        int rem = k - arr[i];
	        if(map.containsKey(rem)) {
	            return true;
	        }
	        map.put(arr[i],i);
	    }
	    return false;
	}
}
```