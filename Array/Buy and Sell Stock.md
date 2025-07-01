# Buy and Sell Stock
```java
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}
	
	static int maxProfit(int arr[]) {
	    int profit = 0;
	    int min = arr[0];
	    for(int i = 1; i < arr.length; i++) {
	        int cost = arr[i] - min;
	        profit = Math.max(profit, cost);
	        min = Math.min(min, arr[i]);
	    }
	    return profit;
	}
}
```