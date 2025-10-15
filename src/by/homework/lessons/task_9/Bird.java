package by.homework.lessons.task_9;

public class Bird extends Animal {
    //Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
    //При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
    private String familyBird;
    private int maxflight;


    public Bird(String color, int maxlife, String food, String family, int maxflight) {
        super(color, maxlife, food);
        this.familyBird = family;
        this.maxflight = maxflight;
    }

    public void sing() {
        System.out.println(familyBird + " поет");
    }

    public void peck() {
        System.out.println(familyBird + " клюет");
    }

    public void hatchСhicks() {
        System.out.println(familyBird + " высиживает птенцов");
    }

    @Override
    public void sound() {
        System.out.println(familyBird + " громко поет");
    }

    @Override
    public void play() {
        System.out.println(familyBird + " играет");
    }

    @Override
    public String toString() {
        String result = super.toString();
        result = result + "Семейство: " + familyBird + ", Максимальная высота полёта: " + maxflight + " м. ";
        return result;

    }

    public String getFamilyBird() {
        return familyBird;
    }

    public void setFamilyBird(String familyBird) {
        this.familyBird = familyBird;
    }

    public int getMaxflight() {
        return maxflight;
    }

    public void setMaxflight(int maxflight) {
        this.maxflight = maxflight;
    }
}

