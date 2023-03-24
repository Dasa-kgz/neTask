package servive.impl;

import ENUM.Gender;
import model.Group;
import model.Student;
import servive.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudenServiceImpl implements StudentService {


    @Override
    public String addStudent(Student student) {
       List<Student>student1=new ArrayList<>();
       student1 = (List<Student>) new Student("Dasa",31, Gender.MALE);
        System.out.println(student);
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return getAllStudents();
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
