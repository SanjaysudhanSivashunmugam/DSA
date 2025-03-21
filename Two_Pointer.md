# Two Pointers
### 21/03/2025

## 1) Two Sum
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int req = target - nums[i];
            if(hm.containsKey(req)){
                return new int[] {hm.get(req), i};
            }
            hm.put(nums[i],i);
        }
        return new int[] {};
    }
}
```
