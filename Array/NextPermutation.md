# Next Permutation
```java
class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            reverse(arr, 0, n-1);
            return;
        }
        for(int i = n-1; i >= index; i--) {
            if(arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        reverse(arr, index + 1, n-1);
    }
    void reverse(int arr[], int index, int n) {
        while(index < n) {
            int temp = arr[index];
            arr[index] = arr[n];
            arr[n] = temp;
            index++;
            n--;
        }
    }
}
```