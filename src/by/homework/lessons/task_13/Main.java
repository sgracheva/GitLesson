package by.homework.lessons.task_13;

import javax.swing.*;

public class Main {

    //1.1. Создать несколько студентов.
    //1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
    //1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", "01.01.2005", "Минск", 8.1);
        Student student2 = new Student("Иванна", "Иванова", "02.02.2006", "Пинск", 9.9);
        Student student3 = new Student("Петр", "Петров", "03.03.2003", "Брест", 7.8);
        Student student4 = new Student("Светлана", "Грачев", "07.07.2007", "Минск", 9.2);
        Student student5 = new Student("Михаил", "Михайлов", "18.08.2008", "Гродно", 9.4);

        Group group1 = new Group(108);
        group1.addStudent(student1);
        group1.addStudent(student2);

        Group group2 = new Group(109);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group2.addStudent(student5);

        Faculty faculty1 = new Faculty("Факультет Финансов");
        Faculty faculty2 = new Faculty("Факультет Информатики");
        faculty1.addGroup(group1);
        faculty2.addGroup(group2);

        //удаление студентов
        group1.removeStudentsByMark(8.2);
        group2.removeStudentsByMark(8.0);

        //если в группе меньше 2 человек, перевести этих студентов в другую группу
        group1.transferToGroup(group2);

        System.out.println("Группа 1 после перевода: ");
        if (group1.getStudents().isEmpty()) {
            System.out.println("Студентов нет в группе");
        } else {
            for (Student s : group1.getStudents()) {
                System.out.println(s.getLastName() + " " + s.getFirstName()+ ", средний бал = " + s.getAverage());
            }
        }


        System.out.println("Группа 2 после перевода: ");
        if (group2.getStudents().isEmpty()) {
            System.out.println("Студентов нет в группе");
        } else {
            for (Student s : group2.getStudents()) {
                System.out.println(s.getLastName() + " " + s.getFirstName() + ", средний бал = " + s.getAverage());
            }
        }

//Cредний бал по группе
        System.out.println("Средний бал по группе1: " + group1.calculateAverageMark());
        System.out.println("Средний бал по группе2: " + group2.calculateAverageMark());
    }


}

