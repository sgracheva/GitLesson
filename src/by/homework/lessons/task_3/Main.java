package by.homework.lessons.task_3;

public class Main {
    public static void main(String[] args){
    System.out.println("*********Задача №1******************");
    // 1.Дано уравнение x/6+25=98. Найти x и вывести его в консоль
    int x1;
    x1= (98-25)*6;
    System.out.println("x1 = " +x1);

    System.out.println("*********Задача №2******************");
    //  2. x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения,
    //  чтобы результат не изменился. x=8; y=9; z=12;
    //  (операции присваивания, нужно просто написать по-другому)

    int x = 3;
    int y = 1;
    int z = 18;

    x += 5;
    y *= 9;
    z -= 6;

    System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    System.out.println("*********Задача №3******************");

    // 3. Даны числа a=35, b=65. Если а>b,
    // то присвоить числу c значение 5 иначе, присвоить числу c значение 10. (тернарный оператор)
    int a1= 35;
    int b1= 65;
    int ab = a1>b1?5:10;

    System.out.println(ab);
}
}
