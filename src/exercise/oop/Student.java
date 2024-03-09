package exercise.oop;

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

    public String hienthi() { // Ham instance - Ham Doi tuong
        return "Student{" +
            "name='" + name + '\'' +
            ", birthDate='" + birthDate + '\'' +
            ", subject1='" + subject1 + '\'' +
            ", subject2='" + subject2 + '\'' +
            ", subject1Grade=" + subject1Grade +
            ", subject2Grade=" + subject2Grade +
            '}';
    }

    public void tradiem1() {
        String s = "diem mon thu 1:" + subject1Grade;
        System.out.println(s);
    }

    public void tradiem2() {
        String s = "diem mon thu 2:" + subject2Grade;
        System.out.println(s);
    }

    public void setName(String name, String ngaySInh) { // Ham doi tuong: thiet lap ten cho Student - khong tra ve
        this.name = name;
    }


    public static void main(String[] args) { // Ham Class - Ham static
        /*
        Student hung = new Student("Nguyen The Hung", "12/01/2004", "toan", "van", 10, 9);
        Student khanh = new Student("Nguyen The Khanh", "12/01/2006", "toan", "van", 10, 9);

        System.out.println("1:" + hung.hienthi());
        hung.tradiem1();
        hung.tradiem2();
        System.out.println("2:" + khanh.hienthi());
        khanh.tradiem1();
        khanh.tradiem2();*/


        Input huy = new Input();

        System.out.println("Nhap ho va ten:");
        String hoTen = huy.inputString();

        System.out.println("Nhap ngay sinh:");
        String ngaySinh = huy.inputString();

        System.out.println("Nhap mon hoc 1:");
        String monHoc1 = huy.inputString();

        System.out.println("Nhap mon hoc 2:");
        String monHoc2 = huy.inputString();

        System.out.println("Nhap diem mon hoc 1:");
        Float diemMon1 = huy.inputfloat();

        System.out.println("Nhap diem mon hoc 2:");
        Float diemMon2 = huy.inputfloat();

        Student hung = new Student();
        hung.name = hoTen;
        hung.birthDate = ngaySinh;
        hung.subject1 = monHoc1;
        hung.subject2 = monHoc2;
        hung.subject1Grade = diemMon1;
        hung.subject2Grade = diemMon2;
        System.out.println(hung.hienthi());
        hung.tradiem1();
        hung.tradiem2();

        System.out.println(hung.subject1Grade);
        float diemTB = (hung.subject1Grade + hung.subject2Grade) / 2;
        System.out.println("Diem TB: " + diemTB);
    }

}
