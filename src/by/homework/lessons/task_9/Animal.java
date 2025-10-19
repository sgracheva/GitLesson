package by.homework.lessons.task_9;

public class Animal {
    //Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).

    String color;
    int maxlife;
    String food;

    public Animal(String color, int maxlife, String food) {
    }

    // Определить методы в классе животное: (издание звуков, животное играет)

    public void sound() {
        System.out.println("Животное издает звук: ");
    }

    public void play() {
        System.out.println("Животное играет: ");
    }
}


