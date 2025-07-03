# Subarrays equal sum k
```java
class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0,1);
        for(int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            int rem = sum - k;
            count += map.getOrDefault(rem, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
```