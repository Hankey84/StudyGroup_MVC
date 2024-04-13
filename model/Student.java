
package model;

public class Student extends User{
    private static int number;
    private static int number2;

    private int studentId;

    static {
        number = 100;
        number2 = 0;
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
        int ordinalNumber = ++number2;
        return "Студент" + ordinalNumber + " {" +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                ", ID=" + studentId + "}";
    }
}
