# Patika.Dev - Java Eğitimi
# Öğrenci Bilgi Sistemi

Bu Java modülü, öğrencilerin ders notlarını hesaplamak ve sınıf geçme durumlarını kontrol etmek için kullanılan bir öğrenci bilgi sistemi sunar.

## Course (Ders) Sınıfı

`Course` sınıfı, bir dersi temsil eder. Her dersin bir adı, kodu ve öğretmeni bulunur. Ayrıca, notlar ve sözlü notlar için ağırlık değerleri de tutar.

### Özellikler

- `Teacher courseTeacher`: Dersin öğretmeni
- `String name`: Dersin adı
- `String code`: Dersin kodu
- `String prefix`: Dersin kodunun ön eki
- `int note`: Dersin yazılı notu
- `int oralNote`: Dersin sözlü notu
- `double noteWeight`: Yazılı notun ağırlık değeri
- `double oralNoteWeight`: Sözlü notun ağırlık değeri

### Metotlar

- `Course(String name, String code, String prefix)`: Dersin adı, kodu ve ön ekiyle birlikte yeni bir `Course` nesnesi oluşturur.
- `void addTeacher(Teacher t)`: Dersin öğretmenini atar.
- `void printTeacher()`: Dersin öğretmenini ekrana yazdırır.
- `double getWeightedNote()`: Dersin ağırlıklı notunu hesaplar.

## Main Sınıfı

`Main` sınıfı, örnek dersler, öğretmenler ve öğrenciler oluşturarak sistem üzerinde işlemler yapar.

### Metotlar

- `main(String[] args)`: Örnek dersler, öğretmenler ve öğrenciler oluşturarak sistemde işlemler yapar.

## Student (Öğrenci) Sınıfı

`Student` sınıfı, bir öğrenciyi temsil eder. Her öğrencinin adı, sınıfı, numarası ve aldığı dersler bulunur. Ayrıca, notların ortalaması ve sınıf geçme durumu tutulur.

### Özellikler

- `String name`: Öğrencinin adı
- `String stuNo`: Öğrencinin numarası
- `int classes`: Öğrencinin sınıfı
- `Course math`: Matematik dersi
- `Course physics`: Fizik dersi
- `Course chemistry`: Kimya dersi
- `double average`: Notların ortalaması
- `boolean isPass`: Sınıf geçme durumu

### Metotlar

- `Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry)`: Öğrencinin adı, sınıfı, numarası ve aldığı derslerle birlikte yeni bir `Student` nesnesi oluşturur.
- `void addBulkExamNote(int math, int physics
- `void addBulkExamNote(int math, int physics, int chemistry, int mathOral, int physicsOral, int chemistryOral)`: Öğrencinin ders notlarını toplu olarak ekler.
- `void isPass()`: Öğrencinin sınıf geçme durumunu kontrol eder.
- `void calcAvarage()`: Öğrencinin not ortalamasını hesaplar.
- `boolean isCheckPass()`: Öğrencinin sınıf geçme durumunu kontrol eder.
- `void printNote()`: Öğrencinin notlarını ekrana yazdırır.

## Teacher (Öğretmen) Sınıfı

`Teacher` sınıfı, bir öğretmeni temsil eder. Her öğretmenin adı, telefon numarası ve branşı bulunur.

### Özellikler

- `String name`: Öğretmenin adı
- `String mpno`: Öğretmenin telefon numarası
- `String branch`: Öğretmenin branşı

### Metotlar

- `Teacher(String name, String mpno, String branch)`: Öğretmenin adı, telefon numarası ve branşıyla birlikte yeni bir `Teacher` nesnesi oluşturur.

---

Bu örnek öğrenci bilgi sistemi, derslerin öğretmenlerle ilişkilendirilmesini, öğrencilerin ders notlarını eklemesini ve sınıf geçme durumlarını kontrol etmesini sağlar. Ayrıca, derslerin ağırlıklı notlarını hesaplayabilir ve öğrencilerin notlarını ekrana yazdırabilir.

Bu örnek, Java programlama dilinde sınıflar arasındaki ilişkileri göstermek için basit bir yapı sunmaktadır. Kendi projenizde kullanabilir, geliştirebilir veya üzerinde değişiklikler yapabilirsiniz.

--- 

**Not**: Bu örnek kodu çalıştırmak için Java geliştirme ortamınızın (IDE) yüklü olduğundan emin olun ve `Main` sınıfındaki `main` metotunu çalıştırarak sonuçları gözlemleyebilirsiniz.

