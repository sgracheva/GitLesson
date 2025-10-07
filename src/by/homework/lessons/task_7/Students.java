package by.homework.lessons.task_7;

public class Students {
    // создание класса студентов
    public int id;
    public String name;
    public String surname;
    public String faculty;
    public int course;
    public String group;
    public int grade;

    // Конструктор с параметрами
    public Students(int id, String name, String surname, String faculty, int course, String group, int grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.grade = grade;
    }

    // Конструктор без параметров
    public Students() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.faculty = "";
        this.course = 0;
        this.group = "";
        this.grade = 0;
    }

    // 2. Метод для вывода информации о студенте
    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + grade);
        System.out.println();
    }

    //3. Метод для изменения группы
    public void changeGroup(String newGroup) {
        group = newGroup;
    }

    // 4. Метод для получения текущей группы студента
    public String getGroup() {
        return group;

    }

    // 5. Метод для изменения оценки и группы
    public void changeGradeGroup(int newGrade, String newGroup) {
        grade = newGrade;
        group = newGroup;
    }

    // Метод для студентов с оценкой выше переданного значения
    //PublicStudent[]getStudents(Students[] students, int mark
    public static Students[] getStudents(Students[] students, int mark) {
        // Считаем количество студентов, у которых оценка выше переданного порога
        int count = 0;
        for (Students student : students) {
            if (student.grade > mark) {
                count++;
            }
        }
        // новый массив
        Students[] result = new Students[count];
        int index = 0;
        for (Students student : students) {
            if (student.grade > mark) {
                result[index++] = student;
            }
        }
        return result;
    }
}