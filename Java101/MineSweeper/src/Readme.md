# Patika.Dev - Java Eğitimi
# Mine Sweeper

Bu, Java dilinde metin tabanlı bir Mayın Tarlası oyununu temsil eden basit bir uygulamadır.

## Nasıl Çalışır

Oyun, kullanıcıdan satır ve sütun girişleri alır ve seçilen hücreleri kontrol ederek sonucu ekrana yansıtır. Oyun, Mayın Tarlası oyununun kurallarına uygun olarak işler. Aşağıda oyunun çalışma mantığı anlatılmıştır:

1. Oyun başladığında, kullanıcıdan mayın tarlasının boyutunu (satır ve sütun sayısı) girmesi istenir.
2. Mayın tarlası oluşturulur ve içerisine belirli sayıda mayın yerleştirilir.
3. Oyun alanı kullanıcıya gösterilir ve kullanıcıdan satır ve sütun seçmesi istenir.
4. Seçilen hücre kontrol edilir:
   - Eğer seçilen hücrede mayın varsa, oyun biter ve "Game Over!!" mesajı görüntülenir.
   - Eğer seçilen hücrede mayın yoksa, etrafındaki hücreler kontrol edilir ve her bir hücredeki mayın sayısı belirlenir.
     - Eğer etrafında hiç mayın yoksa, etrafındaki tüm boş hücreler açılır.
5. Kullanıcı hücreleri seçmeye devam ederken, her seçim sonrası oyun alanı güncellenir ve kullanıcıya gösterilir.
6. Oyun alanında tüm boş hücreler açıldığında veya tüm mayınlar doğru bir şekilde işaretlendiğinde, oyun kazanılır ve "Oyunu Kazandınız!" mesajı görüntülenir.

## Nasıl Kullanılır

1. Java çalıştırma ortamınızı kurun.
2. Bu projeyi klonlayın veya ZIP dosyası olarak indirin.
3. Kodu Java derleyicisi veya geliştirme ortamında açın.
4. Kodu derleyin ve çalıştırın.
5. Oyun, konsol ekranında çalışacak ve size talimatlar verecektir. Talimatları izleyin ve oyunu oynayın.

## Örnek Kod

```java
import java.util.Scanner;

public class MineSweeper {
    // ...
    // Kodun geri kalanı
    // ...
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayın Tarlası Boyutunu Giriniz\nSatır Sayısı: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun Sayısı: ");
        int cols = scanner.nextInt();

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}
