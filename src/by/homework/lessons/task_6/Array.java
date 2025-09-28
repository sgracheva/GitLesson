package by.homework.lessons.task_6;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("******Задача 1*********");
        //Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
        // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each

        int[] massive = {8, 7, 9, 7, 5, 8, 3, 4, 8, 10};
       // {System.out.println("Созданный массив " + Arrays.toString(massive)); }
        System.out.print("Созданный массив ");
        for (int mas : massive) {
            System.out.print(mas+ " ");
        }
        System.out.println();

        for (int i = 1; i < massive.length; i +=2) { //замена на 0, нечетный индекс начинается с 1
            massive[i] = 0;
        }
               System.out.println("Массив после замены нечётного индекса на ноль " +Arrays.toString(massive) );

        System.out.println("******Задача 2*********");
        //Создать массив из 5 чисел и заполните этот массив вручную.
        // Создайте второй массив с размерностью больше на 1 чем первый массив.
        // Необходимо скопировать первый массив со всеми значениями во второй массив.
        // Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
        int[] array1 = {8,3,4,9,1};
        {
            System.out.println("Массив из 5 чисел: " +Arrays.toString(array1));
        }

        int [] array2 =  new int [array1.length + 1]; //второй массив
        for (int i = 0; i < array1.length; i++){
            array2 [i] = array1 [i];
        }

        array2 [array2.length - 1] = 0;
        System.out.print("Массив из 6 чисел: ");
        for (int num : array2) {
            System.out.print(num+ " ");
        }
        System.out.println();

        System.out.println("******Задача 4*********");
        //Создать массив (вручную).
        // Отсортировать элементы массива в порядке возрастания. Вывести полученный массив. Выполнить с помощью цикла for

        int[] massive3 = {8,3,4,9,1,8,0,7};
        {
            System.out.println("Массив без сортировки " +Arrays.toString(array1));
        }

        Arrays.sort(massive3);// сортировка

        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < massive3.length; i++) {
            System.out.print(massive3[i] + " ");
        }

    }

               }







