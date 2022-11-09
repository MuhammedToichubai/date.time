package person;

import java.util.Arrays;

public class Staff extends Person{

    private String school;
    private double salary;
    private Student[] students;

    public Staff(String school, double salary, Student[] students) {
        this.school = school;
        this.salary = salary;
        this.students = students;
    }

    public Staff(String fullName, char gender, String email, String school, double salary, Student[] students) {
        super(fullName, gender, email);
        this.school = school;
        this.salary = salary;
        this.students = students;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString()+" "+
                "school='" + school + '\'' +
                ", salary=" + salary +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
