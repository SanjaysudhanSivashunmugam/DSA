# HCF
```
Input: 20 40
output: 20 
```
```java
class Main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 40;
        int min = Math.min(number1, number2);
        
        for(int i = min; i >= 1; i--) {
            if(number1 % i == 0 && number2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
```