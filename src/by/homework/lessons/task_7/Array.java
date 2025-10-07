package by.homework.lessons.task_7;

public class Array {
    public static void main(String[] args) {
        Students student1 = new Students(1, "Светлана", "Грачева", "Экономика", 1, "А-101", 87);
        Students student2 = new Students(2, "Кирилл", "Казамиров", "Информатика", 5, "И-501", 99);
        Students student3 = new Students(3, "Иванна", "Иванова", "Финансы", 3, "Ф-303", 78);
        Students student4 = new Students(4, "Петр", "Петров", "Математика", 2,"М-201",86);
        Students student5 = new Students(5, "Анна", "Ковалева", "Медицина", 3,"М-303",90);

        Students[] students = {student1, student2, student3, student4, student5};

        Students[] topStudents = Students.getStudents(students, 90);
        System.out.println("Студенты с грейдом выше 90:");
        for (Students student : topStudents) {
            student.info();
        }

    }
}
