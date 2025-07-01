# Longest Sub Array With Sum K (Positive)
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {2,0,0,3};
	    int k = 3;
		System.out.println(subArray(arr,k));
	}
	
	static int subArray(int arr[], int k) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    int len = 0;
	    int sum = 0;
	    for(int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	        if(sum == k) {
	            len = i + 1;
	        }
	        int rem = sum - k;
	        if(map.containsKey(rem)) {
	            len = Math.max(len, i - map.get(rem));
	        }
	        if(!map.containsKey(sum)) {
	            map.put(sum, i);
	        }
	    }
	    return len;
	}
}
```