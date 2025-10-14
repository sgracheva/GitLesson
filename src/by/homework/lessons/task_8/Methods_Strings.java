package by.homework.lessons.task_8;

public class Methods_Strings {
    //Есть 1-ая строка «Я люблю java» и 2-ая строка «java». Так как первая строка оканчивается такой же строкой что и 2-ая строка (java),
    // то метод должен вернуть «Я люблю» иначе метод должен вернуть «Я ЛЮБЛЮ».
    // В этом методе нужно использовать методы для работы со строками: endWith(), indexOf(), substring(), toUpperCase();
    public static void main(String[] args) {
        String str1 = "Я люблю java";
        String str2 = "java";

        if (str1.endsWith(str2)) {
            String result = str1.substring(0, str1.indexOf(str2)); //
            System.out.println(result); // Я люблю
        } else {
            String result2 = str1.toUpperCase();// Приводим строку к верхнему регистру Выведет: Я ЛЮБЛЮ JAVA
            String result3 = result2.substring(0, 7); // Вырезаем последние строки
            System.out.println(result3);
        }
    }
}
