package by.homework.lessons.task_9;


public class Main {
    public static void main(String[] args) {
    //1.1 Создать по объекту соответствующих классов продемонстрировать поведение собак и птиц.
    // (вызвать соответствующие методы в классах собака и птица)
    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)

    Dog dog= new Dog("Мухтар", "Немецкая овчарка", 50, "Черный", 30, "Мясо");
    System.out.println(dog.toString());
    dog.sound();
    dog.play();
    dog.bide();
    dog.run();
    dog.playDog();
    dog.jump();

    System.out.println();

    Bird bird= new Bird("Черный", 15, "Зерно","Во́роновые", 500);
    System.out.println(bird.toString());
    bird.sound();
    bird.play();
    bird.hatchСhicks();
    bird.peck();
    bird.sing();

    System.out.println();

}
}
