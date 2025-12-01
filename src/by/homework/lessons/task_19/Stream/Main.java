package by.homework.lessons.task_19.Stream;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = List.of(
                new City(1, "Moscow", 13500000, Continent.EUROPE),
                new City(2, "Pekin", 21900000, Continent.ASIA),
                new City(3, "Frankfurt", 731848, Continent.EUROPE),
                new City(4, "KAIR", 23000000, Continent.AFRICA),
                new City(5, "Smolensk", 310000, Continent.ASIA),
                new City(6, "New York", 8800000, Continent.NORTH_AMERICA),
                new City(7, "Minsk", 1996730, Continent.EUROPE)
        );


        cities.stream()
                .filter(c -> c.getContinent() == Continent.EUROPE)
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Самый густонаселённый город в Европе: " + city));



                cities.stream()
                .filter(c -> c.getContinent() == Continent.EUROPE)
                .min(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Город с наименьшим населением в Европе: " + city));




        cities.stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Самый густонаселённый город в мире: " + city));




        cities.stream()
                .min(Comparator.comparingInt(City::getPopulation))
                .ifPresent(city -> System.out.println("Город с самым маленьким населением: " + city));




        cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst()
                .ifPresent(city -> System.out.println("Первый город с населением > 1 млн: " + city));




        System.out.println("Города с населением больше 1 млн:");
        cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .forEach(System.out::println);




        List<String> cityNames = cities.stream()
                .map(City::getName)
                .toList();
        System.out.println("Названия городов: " + cityNames);


    }
}
