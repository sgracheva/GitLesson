package by.homework.lessons.task_11;

public class RobotBuilder implements RobotEngener{

    //РоботСтроитель. Поля: модель, потребляемая мощность, страна производитель,
    // агрегат для строительства, материал, включение робота (boolean isOn.

    private String model;
    private int power;
    private String country;
    private String construction;
    private String material;
    boolean isOn;

    public RobotBuilder(String model, int power, String country, String construction, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.construction = construction;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void turnOn() {
        System.out.println(model+ " включен");
    }

    @Override
    public void turnOff() {
        System.out.println(model+ " выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model+ " из "+ country+ " работает с помощью " +construction);
    }

    @Override
    public void createItem() {
        System.out.println("Робот строитель создаёт бетон");
    }
}
