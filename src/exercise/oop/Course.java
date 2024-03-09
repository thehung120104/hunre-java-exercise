package exercise.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ThanhBuiNguyen
 * @since 09/03/2024
 */
public class Course {

    private Input input = new Input();
    private List<Student> studentList;
    private int studentQuantity;

    public void setStudentQuantity(int quantity) { // thiet lap so luong sinh vien
        this.studentQuantity = quantity;
    }

    public Student inputStudent() {
        System.out.println("Nhap ho va ten:");
        String hoTen = input.inputString();

        System.out.println("Nhap ngay sinh:");
        String ngaySinh = input.inputString();

        System.out.println("Nhap mon hoc 1:");
        String monHoc1 = input.inputString();

        System.out.println("Nhap mon hoc 2:");
        String monHoc2 = input.inputString();

        System.out.println("Nhap diem mon hoc 1:");
        float diemMon1 = input.inputfloat();

        System.out.println("Nhap diem mon hoc 2:");
        float diemMon2 = input.inputfloat();

        Student student = new Student(hoTen, ngaySinh, monHoc1, monHoc2, diemMon2, diemMon2);

        return student;
    }

    public void inputListStudent() {
        studentList = new ArrayList<>();
        System.out.println("Nhap vao so luong sinh vien cua lop hoc");
        int studentQuantity = input.inputInteger();// nhap so luong sinh vien tu ban phim

        setStudentQuantity(studentQuantity); // thieet lap so luong sinh vien
        // da co so luong sinh vien trong doi tuong 'course'

        for (int i = 0; i < this.studentQuantity; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            Student student = inputStudent();
            studentList.add(student);
        }
    }

    public void displayStudentList() {
        /*for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            student.hienthi();
        }*/

        for (Student student : studentList) {
            String thongTin = student.hienthi();
            System.out.println("Thong tin sinh vien " + (studentList.indexOf(student) + 1) + ":" + thongTin);
        }
    }
}


