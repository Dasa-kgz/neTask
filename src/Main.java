import ENUM.Gender;
import model.Group;
import model.Student;
import servive.impl.GroupServiceImpl;
import servive.impl.StudenServiceImpl;

import java.net.DatagramSocket;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("********AVN OSHGU*********");
        boolean grup = false;
        while (!grup) {
            System.out.println("Выберите действие:");
            System.out.println("1  -> Add new group");
            System.out.println("2  -> Get all groups");
            System.out.println("3  -> Update group name");
            System.out.println("4  -> Filter by year");
            System.out.println("5  -> Sort by year");
            System.out.println("6  ->delete Group  By Id");


            GroupServiceImpl groupService = new GroupServiceImpl();
            StudenServiceImpl studenService = new StudenServiceImpl();
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {

                case 1:
                    System.out.println("Add new group:");
                    groupService.addGroupById();
                    break;
                case 2:
                    System.out.println("Get all grupp");
                    groupService.getAllGroups();
                    break;
                case 3:
                    System.out.println("Update group name");
                    groupService.updateGroupName(1, "dasa");
                    break;
                case 4:
                    groupService.sortGroupByYear(String.valueOf(2023));
                    break;
                case 5:
                    groupService.sortGroupByYear(String.valueOf(2022));
                    break;
                case 6:
                    groupService.deleteGroupById(1);
                default:
                    System.out.println("Нет такого");
                    break;

            }
            boolean stud=false;
            while (!stud){
                System.out.println("1 ->Add new Student");
                System.out.println("2- >Get all student");
                System.out.println("3- > Filter by gender");
                System.out.println("4- > Uppdate students");
                System.out.println("5- >Delete students by id");
            }

            switch (choose){
                case 1:
                    studenService.addStudent(new Student("Dasa",31, Gender.MALE));
                    break;
                case 2:
                    studenService.getAllStudents();
                    break;
                case 3:
                    studenService.filterByGender();
                    break;
                case 4:
                    studenService.updateStudentFullName(1,"dasa");
                    break;
                case 5:
                    studenService.deleteStudentById(1);
                    break;
                case 6:
                    System.out.println("нет такого ");
                    break;

            }

        }
    }
}