# Rotate Array By D Places
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        arrRotate(nums,0,n-1);
        arrRotate(nums,0,k-1);
        arrRotate(nums,k,n-1);
        System.out.print(nums);
    }
    public void arrRotate(int n[], int s,int e){
        while(s<=e){
            int t = n[s];
            n[s] = n[e];
            n[e] = t;
            s++;
            e--;
        }
    }
}
```