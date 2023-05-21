public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course physics,Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry, int mathOral, int physicsOral, int chemistryOral) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
            this.math.oralNote = mathOral;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
            this.physics.oralNote = physicsOral;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
            this.chemistry.oralNote = chemistryOral;
        }
    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.average = (this.physics.note + this.chemistry.note + this.math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.math.note);
        System.out.println("Fizik Notu : " + this.physics.note);
        System.out.println("Kimya Notu : " + this.chemistry.note);
    }

}

