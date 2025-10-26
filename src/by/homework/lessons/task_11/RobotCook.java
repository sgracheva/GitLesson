package by.homework.lessons.task_11;

public class RobotCook implements Robot {
    //РоботПовар поля: модель, потребляемая мощность, страна производитель,
    // агрегат для приготовления, включение робота (boolean isOn).

    private String model;
    private int power;
    private String country;
    private String cook;
    private boolean isOn;

    public RobotCook(String model, int power, String country, String cook, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cook = cook;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        System.out.println(model + " включен");
    }

    @Override
    public void turnOff() {
        System.out.println(model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " из " + country + " готовит еду с помощью " + cook + ".");
    }
}
