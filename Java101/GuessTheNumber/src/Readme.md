# Patika.Dev - Java Eğitimi
# Guess the Number

Guess the Number oyunu, kullanıcının 0 ile 99 arasında rastgele seçilen bir sayıyı tahmin etmeye çalıştığı basit bir Java oyunudur.

## Nasıl Oynanır

1. Program, 0 ile 99 arasında rastgele bir sayı seçer.
2. Kullanıcıdan tahminini girmesi istenir.
3. Eğer tahmin geçerli aralık dışında bir sayı ise, bir hata mesajı görüntülenir.
   - Kullanıcı geçerli olmayan girişler yapmaya devam ederse, bir tahmini kaybeder.
   - Ardışık olarak belirli bir sayıda geçersiz giriş yaptıktan sonra, program kullanıcıya gelecekteki hatalı girişler için bir tahmin kaybedeceğini bildirir.
4. Eğer tahmin doğruysa, program kullanıcıya tebrikler mesajı verir ve oyunu sonlandırır.
5. Eğer tahmin yanlışsa, program kullanıcıya yanlış bir tahmin yaptığını ve seçilen sayının daha büyük veya daha küçük olduğunu bildirir.
   - Yanlış tahminler bir diziye kaydedilir.
   - Kalan tahmin sayısı kullanıcıya gösterilir.
6. Kullanıcı 5 tahmin hakkını kullanana veya doğru tahmini yapana kadar adımlar 2-5 tekrarlanır.
7. Eğer kullanıcı doğru tahmini yapamazsa, program kullanıcıya oyunu kaybettiğini ve seçilen sayıyı gösterir.
   - Yanlış tahminler kullanıcıya gösterilir.

İyi eğlenceler!
