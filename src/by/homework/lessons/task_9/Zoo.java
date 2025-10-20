package by.homework.lessons.task_9;

public class Zoo {
    //1.3..Создать класс Зоопарк в котором будут жить наши животные.
    // В качестве поля в новом классе будет массив из животных (private Animal[]animals).
    //1.4 Реализовать метод в классе зоопарк по добавлению нового животного.
    // Сигнатура метода будет такая: public void addAnimal(Animal animal);
    // Данный метод должен будет скопировать текущий массив с животными в новый массив с животными.
    // Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное.
    // Полученный массив нужно перезаписать в поле animals в классе Зоопарк.

    private Animal[] animals;

    public Zoo() {
        animals = new Animal[0];
    }

    //  добавление нового животного
    public void addAnimal(Animal animal) {
        animals = copyAnimals(animals, animal);
    }

    public Animal[] getAnimals() {
        return animals;
    }
    private Animal[] copyAnimals(Animal[] oldAnimals, Animal newAnimal) {
        Animal[] newAnimals = new Animal[oldAnimals.length + 1];

        for (int i = 0; i < oldAnimals.length; i++) {
            newAnimals[i] = oldAnimals[i];
        }
        newAnimals[oldAnimals.length] = newAnimal;
        return newAnimals;
    }

}
