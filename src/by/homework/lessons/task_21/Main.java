package by.homework.lessons.task_21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********Задача 1************");

        //1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
        LocalDate date= LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));

        String formatDate= date.format(formatter);

        System.out.println("Текущая дата: " +formatDate);
        System.out.println("*********Задача 2************");

        //Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM).

        ZonedDateTime now =ZonedDateTime.now();

        DateTimeFormatter formatter1= DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("en"));

        String formatDate1 = now.format(formatter1);

        System.out.println("Текущая дата и время: " +formatDate1);

        System.out.println("*********Задача 3************");
        //Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
        String input = "2023-03-19 : 10:12:24 AM";

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");

        LocalDateTime dateTime = LocalDateTime.parse(input, formatter3);

        System.out.println(dateTime);
        System.out.println("*********Задача 4************");
//Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию
        String input1 = "пн 20.03.23 г. время: 15:07:28";

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEE dd.MM.yy 'г. время:' HH:mm:ss", new Locale("ru"));

        LocalDateTime dateTime1 = LocalDateTime.parse(input1, formatter4);

        System.out.println(dateTime1);
    }
}

