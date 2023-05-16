# Patika.Dev - Java Eğitimi
Recursive Power Calculator

Bu Java programı, taban ve üs değerlerini kullanıcıdan alarak üs alma işlemini recursive (özyineli) bir metot kullanarak gerçekleştirir.

## Nasıl Çalışır?

Programın çalışma mantığı aşağıdaki adımlarla gerçekleştirilir:

1. Kullanıcıdan taban değeri istenir.
2. Kullanıcıdan üs değeri istenir.
3. `power` metodu, taban ve üs değerlerini alarak üs alma işlemini gerçekleştirir.
4. `power` metodu, üssün 0 olduğu durumu kontrol eder. Eğer üs 0 ise, 1 döndürülür. Bu durumda herhangi bir sayının 0. üssünün her zaman 1 olduğu ifade edilir.
5. Eğer üs 0 değilse, `power` metodu `base` değerini üssü bir azaltılarak kendisine recursive olarak çağırır. Bu şekilde üs değeri 1 azaltılarak bir önceki adımda elde edilen sonuç üzerinden tekrar hesaplama yapılır.
6. Sonuç, `base` değeri ile recursive çağrı sonucu çarpılarak elde edilir ve döndürülür.
7. Sonuç ekrana yazdırılır.

## Kullanım

1. Java çalışma ortamınızda programı derleyin.
2. Programı çalıştırın.
3. Program, taban ve üs değerlerini kullanıcıdan isteyecektir.
4. Girilen taban ve üs değerlerine göre üs alma işlemi gerçekleştirilip sonuç ekrana yazdırılacaktır.
