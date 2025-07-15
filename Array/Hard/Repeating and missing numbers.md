# Repeating and missing numbers

```java
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int hash[] = new int [arr.length + 1];
        for(int i = 0 ; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int repeating = -1;
        int missing = -1;
        for(int i = 1; i < hash.length;i++) {
            if(hash[i] == 2) {
                repeating = i;
            }
            else if(hash[i] == 0) {
                missing = i;
            }
            if(repeating != -1 && missing != -1) {
                break;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);
        return res;
    }
}
```