package by.homework.lessons.task_19;

public class Main {
    public static void main(String[] args) {

        StringProcessor toUpperCase = input -> input.toUpperCase();

        String original = "hello java";
        String result = toUpperCase.process(original);


        System.out.println("Исходная строка: " + original);
        System.out.println("После обработки: " + result);
    }
}

