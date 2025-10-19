package by.homework.lessons.task_10;

public class Animal {
    String color;
    int maxlife;
    String food;

    public Animal(String color, int maxlife, String food) {
    }

    public void sound() {
        System.out.println("Животное издает звук: ");
    }

    public void play() {
        System.out.println("Животное играет: ");
    }

    public String toString() {
        String result = " ";
        result = result + "Окрас: " + color + " Максимальная продолжительность жизни: " + maxlife + " Тип еды: " + food;  //окрас, максимальная продолжительность жизни, тип еды
        return result;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxlife() {
        return maxlife;
    }

    public void setMaxlife(int maxlife) {
        this.maxlife = maxlife;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
