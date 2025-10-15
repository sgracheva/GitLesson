package by.homework.lessons.task_9;

import by.homework.task_9.Animal;

public class Dog extends Animal {
    //  В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
    // При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).

    private String name;
    private String breed;
    private double weight;

    public Dog(String name, String breed, double weight, String color, int maxlife, String food) {
        super(color, maxlife, food);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void bark() {
        System.out.println("Собака по имени " + name + " лает");
    }

    public void bide() {
        System.out.println("Собака по имени " + name + " кусает");
    }

    public void run() {
        System.out.println("Собака по имени " + name + " бегает");
    }

    public void playDog() {
        System.out.println("Собака по имени " + name + " играет");
    }

    public void jump() {
        System.out.println("Собака по имени " + name + " прыгает");
    }
    //Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классе Собака

    @Override
    public void sound() {
        System.out.println(name + " громко лает");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    @Override
    public String toString() {
        String result = super.toString();
        result = result + "Имя: " + name + ", Порода: " + breed + ", Вес: " + weight + " кг";
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
