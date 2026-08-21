# Move Zero to End
```
Input: 1 0 2 0 3 0 0 4 5
Output: 1 2 3 4 5 0 0 0 0 
```
```java
public class Array
{
	public static void main(String[] args) {
		int arr[] = {1, 0, 2, 0, 3, 0, 0, 4, 5}; 
		int n = arr.length;
		int firstZeroPos = -1;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				firstZeroPos = i;
				break;
			}
		}

		for(int i = firstZeroPos + 1; i < n; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[firstZeroPos];
				arr[firstZeroPos] = temp;
				firstZeroPos++;
			}
		}

		for(int i : arr) {
			System.out.print(i + " ");
		}
	}		
}

```