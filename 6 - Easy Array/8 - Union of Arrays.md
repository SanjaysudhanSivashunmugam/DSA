# Union of Arrays
```
Input : 
1, 1, 2, 3, 4, 5
3, 4, 5, 5

Output: 1 2 3 4 5 
```

## 1. Using Set
```java
import java.util.ArrayList;
import java.util.HashSet;

public class Array
{
	public static void main(String[] args) {
		int arr1[] = {1, 1, 2, 3, 4, 5}; 
		int arr2[] = {3, 4, 5, 5}; 
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}

		ArrayList<Integer> union = new ArrayList<>(set);

		for(int i : union) {
			System.out.print(i + " ");
		}
	}		
}
```
## 2. Using Two Pointers
```java
import java.util.ArrayList;

public class Array
{
	public static void main(String[] args) {
		int arr1[] = {1, 1, 2, 3, 4, 5}; 
		int arr2[] = {3, 4, 5, 5}; 
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i = 0;
		int j = 0;
		ArrayList <Integer> union = new ArrayList<>();

		while(i < n1 && j < n2) {
			if(arr1[i] <= arr2[j]) {
				if(union.size() == 0 || arr1[i] != union.getLast()) {
					union.add(arr1[i]);
				}
				i++;
			}

			else {
				if(union.size() == 0 || arr2[j] != union.getLast()) {
					union.add(arr2[j]);
				}
				j++;
			}
		}

		while (i < n1) {
			if(union.size() == 0 || arr1[i] != union.getLast()) {
					union.add(arr1[i]);
			}
			i++;
		}

		while (j < n2) {
			if(union.size() == 0 || arr2[j] != union.getLast()) {
					union.add(arr2[j]);
			}
			j++;
		}

		for(int val : union) {
			System.out.print(val + " ");
		}
	}		
}
```