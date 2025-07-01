# Majority Element
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {5,3,4,5,5,5,6,};
		System.out.println(majorityElement(arr));
	}
	
	static int majorityElement(int arr[]) {
	    int element = 0;
	    int count = 0;
	    for(int i = 0; i < arr.length; i++) {
	        if(count == 0) {
	            count++;
	            element = arr[i];
	        }
	        else if(element != arr[i]) {
	            count--;
	        }
	        else {
	            count ++;
	        }
	    }
	    int check = 0;
	    for(int i = 0; i < arr.length; i++) {
	        if(arr[i] == element) {
	            check++;
	        }
	    }
	    if(check > arr.length/2) {
	        return element;
	    }
	    return -1;
	}
}
```