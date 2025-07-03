# Pascal's Triangle
```java
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j < i + 1; j++) {
                arr.add(ncr(i,j));
            }
            res.add(arr);
        }
        return res;
    }
    int ncr(int n, int r) {
        int res = 1;
        for(int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
```