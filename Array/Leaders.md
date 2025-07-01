# Leaders in Array
```java
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        res.add(0, arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] >= max) {
                res.add(0, arr[i]);
            }
            max = Math.max(max, arr[i]);
        }
        return res;
    }
}
```