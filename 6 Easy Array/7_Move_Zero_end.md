# Move zero to end
```java
class Main {
    public static void main(String args[]) {
        int nums[] = {0,3,0,0,4,3};
        int n = nums.length;
        int j = -1;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i = j + 1; i < n; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for(int i : nums) {
            System.out.print(i + " ");
        }
    }

   
}
```