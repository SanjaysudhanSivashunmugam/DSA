# Merge Intervals
```java
class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); 
        List<int[]> res = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i][0] <= end) {
            end = Math.max(end, arr[i][1]);
        }
        else {
            res.add(new int[] {start, end});
            start = arr[i][0];
            end = arr[i][1];
        }
    }
    res.add(new int[] {start, end});
    return res.toArray(new int[res.size()][]);
    }
}
```