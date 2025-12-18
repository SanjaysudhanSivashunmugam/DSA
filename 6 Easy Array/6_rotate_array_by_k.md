# Rotate array by k places
```java
class Main {
    public static void main(String args[]) {
        int nums[] = {5,3,2,1,4,3};
        int n = nums.length;
        int k = 3;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
```