package by.homework.lessons.task_18;

public class Avto extends Thread {
    //.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки.
    // Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле

    private String name;
    private String number;
    private int stopTime;

    public Avto(String name, String number, int stopTime) {
        this.name = name;
        this.number = number;
        this.stopTime = stopTime;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++);
            {
                System.out.println("Машина " + name + " с номером " + number + " едет. Круг " +stopTime);
                Thread.sleep(stopTime);
            }
            System.out.println("Машина " + name + " с номером " + number + " не едет. " );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
