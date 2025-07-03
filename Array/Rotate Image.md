# Rotate Image
```java
class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        // transpose
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }   
    }
}
```