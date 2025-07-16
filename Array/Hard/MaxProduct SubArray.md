# Max Product SubArray
```java
class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int surfix = 1;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(prefix == 0) {
                prefix = 1;
            }
            if(surfix == 0) {
                surfix = 1;
            }
            prefix *= nums[i];
            surfix *= nums[n - i - 1];
            max = Math.max(max, Math.max(prefix, surfix));
        }
        return max;
    }
}
```