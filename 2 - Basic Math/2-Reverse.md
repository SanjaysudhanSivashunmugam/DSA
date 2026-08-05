# Count Digit
```
Input: 1234
output: 4321
```
```java
class Math {
    public static void main(String[] args) {
        int number = 1234;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
```