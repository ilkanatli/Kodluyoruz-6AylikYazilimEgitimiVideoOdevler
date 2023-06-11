public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.performanceNote = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacher();
        } else {
            System.out.println("Ogretmen ve Ders bolumleri uyusmuyor!");
        }
    }
    void printTeacher(){
        teacher.print();
    }
}
