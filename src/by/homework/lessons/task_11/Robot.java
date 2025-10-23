package by.homework.lessons.task_11;

public interface Robot {
    //Создать интерфейс Робот. В нём определены методы: Дефолтный метод:  Отремонтировать робота
    // и абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).

    default void repairRobot () {
        System.out.println("Отремонтировать робота");
    }

    void turnOn ();
    void turnOff();
    void uniquePossibility();


}
