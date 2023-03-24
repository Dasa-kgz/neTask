package servive;

import model.Student;

import java.util.List;

public interface StudentService {
    String addStudent(Student student);

    Student getStudentById(int id);
    List<Student> getAllStudents();

    String updateStudentFullName(int id, String fullName);
    List<Student> filterByGender();

    void deleteStudentById(int id) ;


}
