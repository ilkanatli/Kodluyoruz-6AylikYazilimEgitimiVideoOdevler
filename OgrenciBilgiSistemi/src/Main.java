public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca","TRH","05330555555");
        Teacher t2 = new Teacher("Ali Hoca","FZK","05330444444");
        Teacher t3 = new Teacher("Kulyutmaz","BIO","05330222222");
        // t1.print();

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Biyoloji","103","BIO");
        bio.addTeacher(t3);

        // tarih.addTeacher(t1);
        // tarih.addTeacher(t2);
        // tarih.printTeacherInfo();

        Student s1 = new Student("Inek Saban","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,78,50);
        s1.addBulkExamPerformanceNote(70, 60, 50);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi","124","4",tarih,fizik,bio);
        s2.addBulkExamNote(40,50,50);
        s2.addBulkExamPerformanceNote(30, 70, 40);
        s2.isPass();

        Student s3 = new Student("Damat Ferit","125","4",tarih,fizik,bio);
        s3.addBulkExamNote(90,80,70);
        s3.addBulkExamPerformanceNote(80, 80, 50);
        s3.isPass();
    }
}
