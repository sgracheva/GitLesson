package by.homework.lessons.task_13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    //У группы: номер группы, коллекция студентов (List<Student> students)

    private int groupNumber;
    private List<Student> students;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    // Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех,
    // у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
    // Сигнатура метода: public void removeStudentsByMark(int mark);

    public void removeStudentsByMark(double mark) {
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverage() < mark) {
                studentsToRemove.add(student);
            }
        }
        students.removeAll(studentsToRemove);

    }
    //Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу.
    // (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            for (Student student : students) {
                newGroup.addStudent(student);
            }
            students.clear();
        }
    }

    //1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.

    public double calculateAverageMark() {
        if (students.isEmpty()) return 0;
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverage();
        }
        return sum / students.size();
    }

}