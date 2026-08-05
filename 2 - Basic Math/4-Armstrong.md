# Armstrong Number
```
Input: 371
Output: true
```
```java
class Math {
    public static void main(String[] args) {
        int number = 371;
        int temp = number;
        int armstrongNumber = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            armstrongNumber += (lastDigit * lastDigit * lastDigit);
            temp = temp / 10;
        }
        System.out.println(number == armstrongNumber);
    }
}
```