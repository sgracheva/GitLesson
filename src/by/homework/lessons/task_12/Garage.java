package by.homework.lessons.task_12;

public class Garage <T extends Vehicle> {
    //Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle
//Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости
// от количество выбросов транспортного средства. (Boolean isEntryPermitted());
// Реализовать этот метод: если количество выбросов больше 1

    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }


    public boolean AmountOfEmissions(){
        return vehicle.getEmissions()<100;
    }

}