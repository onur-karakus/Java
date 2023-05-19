# Patika.Dev - Java Eğitimi 
# Boxing Game

Bu, Java ile geliştirilmiş basit bir boks oyunu projesidir. Oyunda iki dövüşçü arasında dövüş gerçekleşir ve sağlık puanlarına göre kazanan belirlenir.

## Özellikler

- İki dövüşçü arasında dövüş gerçekleştirilir.
- Her dövüşçünün saldırı hasarı ve sağlık puanı bulunur.
- Dövüşçülerin ağırlığı kontrol edilir.
- Dövüşçüler arasında sırayla saldırı yapılır.
- Saldırıyı savunma mekanizması eklenir.

## Nasıl Kullanılır

1. Java'nın yüklü olduğundan emin olun.
2. Proje dosyalarını indirin veya klonlayın.
3. Proje klasörüne gidin.
4. Terminali açın ve aşağıdaki komutu çalıştırın:
    
    javac Main.java
    java Main
5. Oyunu oynamak için konsoldaki talimatları izleyin.

## Örnek Kod

```java
public class Fighter {
 // Fighter sınıfının kodu burada yer alır
}

public class Ring {
 // Ring sınıfının kodu burada yer alır
}

public class Main {
 public static void main(String[] args) {
     Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
     Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
     Ring r = new Ring(marc, alex, 90, 100);
     r.run();
 }
}
    


