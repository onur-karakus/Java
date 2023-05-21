public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;
    double noteWeight;
    double oralNoteWeight;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;
        this.noteWeight = 0.8; // Varsayılan olarak notun etkisi %80
        this.oralNoteWeight = 0.2; // Varsayılan olarak sözlü notun etkisi %20
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double getWeightedNote() {
        return (this.note * this.noteWeight) + (this.oralNote * this.oralNoteWeight);
    }
}

