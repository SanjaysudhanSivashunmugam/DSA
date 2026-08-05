# Palindrome Number
```
Input: 121
output: true
```
```java
class Math {
    public static void main(String[] args) {
        int number = 121;
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }
        System.out.println(number == reverse);
    }
}
```