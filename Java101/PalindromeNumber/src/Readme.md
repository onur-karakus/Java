# Patika.Dev - Java Eğitmi
Palindrome Number

Bu basit Java programı, bir sayının palindrom sayı olup olmadığını kontrol etmek için kullanılır. Palindromik sayılar, iki taraftan okunduğunda aynı olan sayılardır.

## Nasıl Çalışır?

1. `number` değişkenini kontrol etmek istediğiniz sayıyla değiştirin.
2. Program, `isPalindrome` metodu aracılığıyla sayının palindrom olup olmadığını kontrol eder.
3. Sonuç ekrana yazdırılır.

## Örnek

```java
public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321; // Palindrom sayıyı kontrol etmek istediğiniz sayıyı burada değiştirebilirsiniz

        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }
}
