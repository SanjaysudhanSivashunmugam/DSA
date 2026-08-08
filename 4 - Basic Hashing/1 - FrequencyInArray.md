# frequency in array
```
1 - > 2
3 - > 2
9 - > 1
12 - > 2
```
```java
class Hashing {
    public static void main(String[] args) {
        int arr[] = {1,3,1,4,3,7,9,8,12,12};
        int hash[] = new int[13]; // This will work for only array size of 10^6
        for(int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("1 - > " + hash[1]);
        System.out.println("3 - > " + hash[3]);
        System.out.println("9 - > " + hash[9]);
        System.out.println("12 - > " + hash[12]);
    }
}
```
```java
import java.util.HashMap;
import java.util.Map;

class Hashing {
    public static void main(String[] args) {
        int arr[] = {1,3,1,4,3,7,9,8,12,12};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i  = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i],  1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
```