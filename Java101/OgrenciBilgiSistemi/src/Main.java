public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MATH101", "MATH");
        Course physics = new Course("Physics", "PHYS101", "PHYS");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Evelyn Ingram", "90550000000", "MATH");
        Teacher t2 = new Teacher("David Saltzberg", "90550000001", "PHYS");
        Teacher t3 = new Teacher("Frances H. Arnold", "90550000002", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Penelope Hofstadter", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50, 20, 40, 70, 50, 60); // Matematik: 50 (Not), 70 (Sözlü); Fizik: 20 (Not), 50 (Sözlü); Kimya: 40 (Not), 60 (Sözlü)
        s1.isPass();

        Student s2 = new Student("Sheldon Cooper", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100, 99, 85, 95, 90, 95); // Matematik: 100 (Not), 80 (Sözlü); Fizik: 50 (Not), 70 (Sözlü); Kimya: 40 (Not), 90 (Sözlü)
        s2.isPass();

        Student s3 = new Student("Leonard Hofstadter", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50, 20, 40, 60, 70,80); // Matematik: 50 (Not), 60 (Sözlü); Fizik: 20 (Not), 70 (Sözlü); Kimya: 40 (Not), 80 (Sözlü)
        s3.isPass();

        Student s4 = new Student("Howard Wolowitz", 4, "221121312", math, physics, chemistry);
        s4.addBulkExamNote(60, 50, 40, 60, 70,80); // Matematik: 50 (Not), 60 (Sözlü); Fizik: 20 (Not), 70 (Sözlü); Kimya: 40 (Not), 80 (Sözlü)
        s4.isPass();
    }

}