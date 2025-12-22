```java
import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int n = arr.length;
        int hash[] = new int[n]; // as the largest nums in arr < arraylength

        for(int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int uniqueElement = -1;

        for(int i = 0; i < n; i++) {
            if(hash[i] == 1) {
                uniqueElement = i;
            }
        }
        System.out.print(uniqueElement);
    }
}
```