package by.homework.lessons.task_12;

public class Main {
    //Класс Main. Создать 2 объекта класса Garage.
    // Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.
    public static void main(String[] args) {


        Car car = new Car("Volvo", 70);
        Motorcycle motorcycle = new Motorcycle("Indian", 150);

        Garage<Car> CarGarage = new Garage<>(car);
        Garage<Motorcycle> MotorcycleGarage = new Garage<>(motorcycle);

        System.out.println(CarGarage.getVehicle().getName() + " - Въезд разрешён: " + CarGarage.AmountOfEmissions());
        System.out.println(MotorcycleGarage.getVehicle().getName() + " - Въезд разрешён: " + MotorcycleGarage.AmountOfEmissions());
    }


    }


