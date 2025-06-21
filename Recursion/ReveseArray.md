# Reverse Array
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
	   reverse(0,4,arr);
	   System.out.print(Arrays.toString(arr));
	}
	
	static void reverse(int l, int r,int arr[]) {
	   if(l >= r) {
	       return;
	   }
	   int temp = arr[l];
	   arr[l] = arr[r];
	   arr[r] = temp;
	   reverse(l+1, r-1,arr);
	}
}
```