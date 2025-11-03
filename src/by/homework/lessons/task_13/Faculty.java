package by.homework.lessons.task_13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    //У факультета: наименование факультета, список групп (List<Group> groups. )

    private String nameFacultaty;
    private List<Group> groups;

    public Faculty(String nameFacultaty) {
        this.nameFacultaty = nameFacultaty;
        this.groups = new ArrayList<>();
    }

    public String getNameFacultaty() {
        return nameFacultaty;
    }

    public void setNameFacultaty(String nameFacultaty) {
        this.nameFacultaty = nameFacultaty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group){
        groups.add(group);
    }
}

