```
Input:n = 5,m = 5 arr1[] = {1,2,3,4,5} arr2[] = {2,3,4,4,5}
Output: {1,2,3,4,5}
Explanation: Common Elements in arr1 and arr2 are: 2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}
```
```java
import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {2,3,4,4,5};
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                if(result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            }

            else if(arr1[i] > arr2[j]) {
                if(result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }

            else {
                if(result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if(result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if(result.size() == 0 || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        System.out.print(result);
    }

   
}
```