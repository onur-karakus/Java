# Patika.Dev - Java Eğitimi
# Employee Class

Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf.

## Sınıfın Nitelikleri

- `name` : Çalışanın adı ve soyadı
- `salary` : Çalışanın maaşı
- `workHours` : Haftalık çalışma saati
- `hireYear` : İşe başlangıç yılı

## Sınıfın Metotları

- `Employee(name, salary, workHours, hireYear)` : Kurucu metot olup 4 parametre alacaktır.
- `tax()` : Maaşa uygulanan vergiyi hesaplayacaktır.
  - Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
  - Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
- `bonus()` : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
- `raiseSalary()` : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şu anki yıl 2021 olarak kabul edilmektedir.
  - Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
  - Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
  - Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
- `calculateTotalSalary()` : Vergi, bonus ve maaş artışıyla birlikte toplam maaşı hesaplayacaktır.
- `toString()` : Çalışana ait bilgileri metin formatında döndürecektir.

## Örnek

```java
Employee employee = new Employee("kemal", 2000.0, 45, 1985);
System.out.println(employee);
