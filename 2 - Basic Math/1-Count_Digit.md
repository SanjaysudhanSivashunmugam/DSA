# Count Digit
```
Input: 1234
output: 4
```
```java
class Math {
    public static void main(String[] args) {
        int number = 1234;
        int count = 0;
        while (number != 0) {
            count ++;
            number = number / 10;
        }
        System.out.println(count);
    }
}
```