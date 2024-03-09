package exercise.oop;

/**
 * @author ThanhBuiNguyen
 * @since 09/03/2024
 */
public class Student {
    // Doi tuong sinh vien:
    // Thuoc tinh: ho ten, ngay sinh, mon hoc 1,2,3 diem mon 1,2,3
    // phuong thuc: nhap, hien, tinh diem trung binh

    // Cu phap khai bao thuoc tinh: access modifier: public,private,..
    // Data type - Kieu du lieu
    //
    private String name;
    private String birthDate;

    private String subject1;

    private String subject2;

    private float subject1Grade;

    private float subject2Grade;

    /*public Student() { // Constructor - ham khoi tao
    }*/


    /*    public Student(String name, String birthDate, String subject1, String subject2, float subject1Grade, float subject2Grade) {
        this.name = name;
        this.birthDate = birthDate;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject1Grade = subject1Grade;
        this.subject2Grade = subject2Grade;

    }*/

    /*    @Override // Ghi de
    public String toString() { // Ham instance - Ham cua Doi tuong
        return "Ten:" + name + "-Ngay sinh:" + birthDate + "\nmon 1:" + "diem mon 1: " + subject1Grade + subject1 + "\nmon2: " + subject2 + "- diem mon 2: " + subject2Grade;
    }*/

    public Student(String name, String birthDate, String subject1, String subject2, float subject1Grade, float subject2Grade) {
        this.name = name;
        this.birthDate = birthDate;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject1Grade = subject1Grade;
        this.subject2Grade = subject2Grade;
    }

    public Student() {
    }

    public String hienthi() {
        return "Student{" +
            "name='" + name + '\'' +
            ", birthDate='" + birthDate + '\'' +
            ", subject1='" + subject1 + '\'' +
            ", subject2='" + subject2 + '\'' +
            ", subject1Grade=" + subject1Grade +
            ", subject2Grade=" + subject2Grade +
            '}';
    }

    public static void main(String[] args) {
        //Student hung = new Student();
        Student hung = new Student("Nguyen The Hung", "12/01/2004", "toan", "van", 10, 9);
        char c = 'c';
        System.out.println("1:" + hung.hienthi());
    }


}
