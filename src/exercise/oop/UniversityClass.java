package exercise.oop;

public class UniversityClass {

    private String name;

    public UniversityClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniversityClass(String name) { // Alt + Insert -> Constructor: tao ham khoi tao nhanh
        this.name = name;
    }

    public static void main(String[] args) {
        Course course = new Course();// dong lenh de khai bao 1 doi tuong Course co ten la 'course'

        Student hung = new Student(); // khai bao nhanh Alt + Enter -> Introduce local variables
        // Xoa dong -> Ctrl+ D

        course.inputListStudent(); // goi den ham nhap thong tin sinh vien cua doi tuong 'course'

        course.displayStudentList(); // goi den ham hien thi thong tin sinh vien cua doi tuong 'course'

    }
}

