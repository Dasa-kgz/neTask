package servive;

import model.Group;

import java.util.List;

public interface GroupServive {
    String addGroupById();
    List<Group> getAllGroups();

    Group updateGroupName(int id, String groupName);

    List<Group> filterByYear(int year, String ascDesc);

    List<Group> sortGroupByYear(String ascDesc);

    void deleteGroupById(int id);


}
