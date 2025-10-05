package by.homework.lessons.task_7;


public class Main {
    public static void main(String[] args) {
        Students student1 = new Students(1, "Светлана", "Грачева", "Экономика", 1, "А-101", 87);
        Students student2= new Students(2, "Кирилл", "Казамиров", "Информатика", 5, "И-501", 99);
        Students student3= new Students(3, "Иванна", "Иванова", "Финансы", 3, "Ф-303", 78);
        Students student4 = new Students(4, "Петр", "Петров", "Математика", 2,"М-201",86);

        System.out.println("Инфо о 1-м студенте: ");
        student1.info();

        System.out.println("Инфо о 2-м студенте: ");
        student2.info();

        System.out.println("Инфо о 3-м студенте: ");
        student3.info();

        System.out.println("Инфо о 4-м студенте: ");
        student4.info();

        System.out.println("*************************************");

        //изменение группы
        student1.changeGroup("А101");
        student2.changeGroup("И501");
        student3.changeGroup("Ф303");
        student4.changeGroup("М201");

        // после изменения группы
        System.out.println("Инфо о студентах после измения группы: ");
        student1.info();
        student2.info();
        student3.info();
        student4.info();

        System.out.println("*************************************");

        // текущая группа студентов
        System.out.println("Текущая группа 1-го студента: " +student1.getGroup());
        System.out.println("Текущая группа 2-го студента: "+student2.getGroup());
        System.out.println("Текущая группа 3-го студента: " +student3.getGroup());
        System.out.println("Текущая группа 4-го студента: " +student4.getGroup());



        //изменение оценки и группы
        student1.changeGradeGroup(88,"А-1011");
        student2.changeGradeGroup(100,"И-5011");
        student3.changeGradeGroup(79, "Ф-3033");
        student4.changeGradeGroup(85, "М-2012");

        System.out.println("************************************");

        // финал: изменение оценки и группы
        System.out.println("Инфо о студентах после изменения оценки и группы: ");
        student1.info();
        student2.info();
        student3.info();
        student4.info();






    }
}

