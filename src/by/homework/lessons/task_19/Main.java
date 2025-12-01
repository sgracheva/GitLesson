package by.homework.lessons.task_19;

public class Main {
    public static void main(String[] args) {
        //1.1 лямбда выражение, которое будет возвращать строку с большими буквами

        StringProcessor toUpperCase = input -> input.toUpperCase();

        String original = "hello java";
        String result = toUpperCase.process(original);

        System.out.println("Исходная строка: " +original);
        System.out.println("Измененная строка: " +result);

    }
}
