
package model;

public class Student extends User{
    private static int number;
    private int studentId;

    static {
        number = 100;
    }

    public Student(String name, int age) {
        super(name, age);
        this.studentId = ++number;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                ", ID=" + studentId + "}";
    }
}
