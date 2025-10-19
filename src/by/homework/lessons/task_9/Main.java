package by.homework.lessons.task_9;


public class Main {
    public static void main(String[] args) {
        //1.1 Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц.
        // (вызвать соответствующие методы в классах собака и птица)
        //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)

        Dog dog = new Dog("Мухтар", "Немецкая овчарка", 50, "Черный", 30, "Мясо");
        System.out.println(dog.toString());
        dog.sound();
        dog.play();
        dog.bide();
        dog.run();
        dog.playDog();
        dog.jump();

        System.out.println();

        Bird bird = new Bird("Черный", 15, "Зерно", "Во́роновые", 500);
        System.out.println(bird.toString());
        bird.sound();
        bird.play();
        bird.hatchСhicks();
        bird.peck();
        bird.sing();

        System.out.println();

        Zoo zoo = new Zoo();


        // Задание 1.3-1.7

        zoo.addAnimal(new Dog("Белла", "Лабрадор", 30, "Белый", 25, "Мясо"));
        zoo.addAnimal(new Dog("Шарик", "Дворняга", 10, "Серый", 15, "Мясо и корм"));
        zoo.addAnimal(new Dog("Маша", "Такса", 6, "Коричневый", 14, "Мясо"));

        zoo.addAnimal(new Bird("Серый ", 95, "Насекомые и зерно", "Вооробьиные", 500));
        zoo.addAnimal(new Bird("Черный", 55, "Насекомые и зерно", "Врановые", 3000));
        zoo.addAnimal(new Bird("Белый ", 30, "Насекомые,зерно, черви", "Аистовые", 1500));

        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal);
            animal.sound();
            animal.play();
            System.out.println();
        }
    }
}

