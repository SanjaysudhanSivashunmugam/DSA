# Two Sum
```java
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 18;
		int res[] = twoSum(nums, target);
		for(int i = 0; i < res.length; i++) {
		    System.out.print(res[i] +" ");
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int j = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int required = target - nums[i];
            if(hm.containsKey(required)) {
                return new int[] {hm.get(required), j};
            }

            hm.put(nums[i], j++);
        }
        return new int[] {};
    }
}
```