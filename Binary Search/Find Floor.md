# Find Floor
```java
class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int res = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] <= x) {
                res = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return res;
    }
}
```