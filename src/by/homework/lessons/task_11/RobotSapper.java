package by.homework.lessons.task_11;

public class RobotSapper implements RobotEngener {

    //РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)

    private String model;
    private int power;
    private String chassisNumber;
    private String material;
    boolean isOn;

    public RobotSapper(String model, int power, String chassisNumber, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.chassisNumber = chassisNumber;
        this.material = material;
        this.isOn = isOn;
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
        System.out.println(model + " разминирует мины с помощью шасси № " + chassisNumber + ".");
    }

    public void repairRobot() {
        System.out.println("Отремонтировать робота " + model);
    }

    public void createItem() {
        System.out.println("РоботСапёр создаёт приспособление для разминирования");
    }
}
