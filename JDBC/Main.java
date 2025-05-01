package jdbc_wamp_example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO.addStudent("Alice", "Math");
        StudentDAO.addStudent("Bob", "Physics");

        StudentDAO.updateStudent(1, "Alice Updated", "Computer Science");

        List<Student> students = StudentDAO.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }

        StudentDAO.deleteStudent(2);
    }
}