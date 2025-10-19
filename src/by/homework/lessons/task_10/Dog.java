package by.homework.lessons.task_10;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double weight;

    public Dog(String name, String breed, double weight, String color, int maxlife, String food) {
        super(color, maxlife, food);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
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

    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if (name.equals(dog.getName())
                && breed.equals(dog.getBreed())
                && weight == dog.getWeight()) {
            return true;
        }
        return false;
    }

    public int hashCode (){
        int result = (int) (name.hashCode() + breed.hashCode() + weight);
        return result;

    }
}
