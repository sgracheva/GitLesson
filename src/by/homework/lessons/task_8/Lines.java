package by.homework.lessons.task_8;

public class Lines {
    public static String combi(String srt1, String str2) {
        return srt1 + " " + str2;
    }


    public static void main(String[] args) {
        System.out.println("**************Задание 1*****************");
        String st1 = "Грачева";
        String st2 = "Светлана";

        String res = combi(st1, st2);
        System.out.println(res);

//        System.out.println(str1 + " " + str2);  //можно ли так выводить результат ?
//        System.out.println(str1.concat(" " + str2));


        System.out.println("**************Задание 2*****************");
        String str1 = "Я люблю java";
        String str2 = "java";

        if (str1.endsWith(str2)){
            String result = str1.substring(0, str1.indexOf(str2)); // Вырезаем строку до начала суффикса
            System.out.println(result); // Выведет: Я люблю
        } else {
            String result2 = str1.toUpperCase();// Приводим строку к верхнему регистру Выведет: Я ЛЮБЛЮ JAVA
            String result3= result2.substring(0,7);
            System.out.println(result3);

        }

    }
}

