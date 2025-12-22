# Longest Subarray sum
```java
import java.util.HashMap;

class Main {
    public static void main(String args[]) {
        int[] arr = { -1, 1, 1 };
        int n = arr.length;
        int k = 1;
        int longestLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == k) {
                longestLength = Math.max(longestLength, i + 1);
            }

            int remaining = sum - k;
            if(hm.containsKey(remaining)) {
                longestLength = Math.max(longestLength, i - hm.get(remaining));
            }

            if(!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }

        System.out.println(longestLength);
    }
}
```