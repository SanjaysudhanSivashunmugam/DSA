# Find the first and Last
```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        if(lb == nums.length || nums[lb] != target) {
            return new int [] {-1, -1};
        }
        return new int [] {lb, upperBound(nums, target) - 1};
    }

    int lowerBound(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int res = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= target) {
                res = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return res;
    }
    int upperBound(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int res = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > target) {
                res = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return res;
    }
}
```