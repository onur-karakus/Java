import java.time.Year;

public class Employee {
    private final String name;        // Çalışanın adı ve soyadı
    private final double salary;      // Çalışanın maaşı
    private final int workHours;      // Haftalık çalışma saati
    private final int hireYear;       // İşe başlangıç yılı

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Maaşa uygulanan vergiyi hesaplayan metot
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Fazla çalışma bonusunu hesaplayan metot
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışını işe başlangıç yılına göre hesaplayan metot
    public double raiseSalary() {
        int yearsWorked = Year.now().getValue() - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        return salary * raisePercentage;
    }

    // Vergi, bonus ve maaş artışıyla birlikte toplam maaşı hesaplayan metot
    public double calculateTotalSalary() {
        double tax = tax();
        double bonus = bonus();
        double salaryIncrease = raiseSalary();

        return salary + bonus - tax + salaryIncrease;
    }

    // Çalışana ait bilgileri metin formatında döndüren metot
    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double salaryIncrease = raiseSalary();
        double totalSalary = calculateTotalSalary();

        return "Adı: " + name +
                "\nMaaşı: " + salary + " TL"+
                "\nÇalışma Saati: " + workHours + " saat" +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax + " TL" +
                "\nBonus: " + bonus + " TL " +
                "\nMaaş Artışı: " + salaryIncrease + " TL" +
                "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary + " TL " +
                "\nToplam Maaş: " + (totalSalary + bonus) + " TL";
    }

    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(employee);
    }
}
