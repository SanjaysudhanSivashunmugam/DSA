# Longest Consecutive
```java
class Solution {
    public int longestConsecutive(int[] arr) {
        int longest = 1;
        if(arr.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr) {
            set.add(i);
        }
        for(int i : set) {
            if(!set.contains(i-1)) {
                int count = 1;
                int element = i;
                while(set.contains(element + 1)) {
                    count++;
                    element++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
```