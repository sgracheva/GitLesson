package by.homework.lessons.task_10;

public class Main {

    public static void main(String[] args) {

        Dog dog1= new Dog("Белла", "Лабрадор", 30, "Белый", 25, "Мясо");
        //Dog dog2 = new Dog("Шарик", "Дворняга", 10, "Серый", 15, "Мясо и корм");
        Dog dog2= new Dog("Белла", "Лабрадор", 30, "Белый", 25, "Мясо");

        Bird bird1= new Bird("Серый ", 95, "Насекомые и зерно", "Вооробьиные", 500);
        Bird bird2 = new Bird("Черный", 55, "Насекомые и зерно", "Врановые", 3000);

        System.out.println(dog1.equals(dog2));
        System.out.println(bird1.equals(bird2));


        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(bird1.hashCode());
        System.out.println(bird2.hashCode());

    }


}
