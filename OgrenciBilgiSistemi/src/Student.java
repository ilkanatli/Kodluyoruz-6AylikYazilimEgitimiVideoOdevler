public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stdno;
    String classes;
    double average;
    boolean isPass;

    public Student(String name, String stdno, String classes,Course c1, Course c2, Course c3) {

        this.name = name;
        this.stdno = stdno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamPerformanceNote(int performanceNote1, int performanceNote2, int performanceNote3) {

        if (performanceNote1 >= 0 && performanceNote1 <= 100) {
            this.c1.performanceNote = performanceNote1;
        }
        if (performanceNote2 >= 0 && performanceNote2 <= 100) {
            this.c2.performanceNote = performanceNote2;
        }
        if (performanceNote3 >= 0 && performanceNote3 <= 100) {
            this.c3.performanceNote = performanceNote3;
        }
    }

    void addBulkExamNote(int note1, int note2, int note3){
        System.out.println("===========================");
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
    }

    void isPass(){
        this.average = ((this.c1.note * 0.8 + this.c1.performanceNote * 0.2) + (this.c2.note * 0.8 + this.c2.performanceNote * 0.2) +  (this.c3.note * 0.8 + this.c3.performanceNote * 0.2)) / 3.0;

        if (this.average > 55) {
            System.out.println("Tebrikler sinifi gectiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sinifta kaldiniz !");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu:" + this.c1.note + "\n" + this.c1.name + " Sozlu Notu:" + this.c1.performanceNote);
        System.out.println(this.c2.name + " Notu:" + this.c2.note + "\n" + this.c2.name + " Sozlu Notu:" + this.c2.performanceNote);
        System.out.println(this.c3.name + " Notu:" + this.c3.note + "\n" + this.c3.name + " Sozlu Notu:" + this.c3.performanceNote);
        System.out.println("Ortalamaniz: " + this.average);
    }
}
