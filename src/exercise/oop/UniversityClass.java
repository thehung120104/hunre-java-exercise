package exercise.oop;

/**
 * @author ThanhBuiNguyen
 * @since 09/03/2024
 */
public class UniversityClass {
    public static void main(String[] args) {
        Course course = new Course();// dong lenh de khai bao 1 doi tuong Course co ten la 'course'

        course.inputListStudent(); // goi den ham nhap thong tin sinh vien cua doi tuong 'course'

        course.displayStudentList(); // goi den ham hien thi thong tin sinh vien cua doi tuong 'course'

    }
}

