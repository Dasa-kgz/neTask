package servive.impl;

import model.Group;
import servive.GroupServive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupServiceImpl implements GroupServive {
    List<Group>groups=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
static int id;
    @Override
        public String addGroupById(){
        System.out.println("Жаны группага ат жазыныз!");
        String name=new Scanner(System.in).nextLine();
        System.out.println("Группанын суроттомосун жазыныз!");
        String description=new Scanner(System.in).nextLine();
        List<Group> group= (List<Group>) new Group();
        groups.add((Group) group);
        System.out.println(group.toString());
        return name+" аттуу группа ийгиликтуу ишке ашырылды!";    }

    @Override
    public List<Group> getAllGroups() {
        return groups;
    }

    @Override
    public Group updateGroupName(int id, String groupName) {
        Group group= null;
        int counter=0;
        try{
            System.out.println("Группанын атын жазыныз ");
            String name=new Scanner(System.in).nextLine();
            for (Group g:groups){
                if (g.getName().toUpperCase().equals(name.toUpperCase())){
                    counter++;
                    group=g;
                }
            }
            if (counter>0) {
                System.out.println("Жаны ат жазыныз!");
                String newName = new Scanner(System.in).nextLine();
                group.setName(newName);
                System.out.println("Группанын аты ийгиликтуу озгортулду!");
                return group;
            }else {
                throw new Exception("Мындай группа табылган жок!");
            }}catch (Exception e){
            System.out.println(e.getMessage());
        return null;
    }

    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }

}
