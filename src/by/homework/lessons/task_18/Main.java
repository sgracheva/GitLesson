package by.homework.lessons.task_18;

public class Main {
    public static void main(String[] args) {
        startTwoCars();
        startThreeCars();


    }
    private static void startTwoCars(){
        System.out.println("Запуск двух машин одновременно");

        Avto car1= new Avto("Tesla", "777AA-7", 500);
        Avto car2= new Avto("Audi", "2345WS-5", 700);

        car1.start();
        car2.start();

        try {
            car1.join();
            car2.join();
                    } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

        public static void startThreeCars(){
            System.out.println("Первая машина едет. Потом две другие ");

            Avto car1= new Avto("BYD", "787AA-7", 1000);
            Avto car2= new Avto("Ford", "7745WS-5", 1200);
            Avto car3= new Avto("Volvo", "2377WR-3", 1700);

            car1.start();

            try {
                car1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            car2.start();
            car3.start();
            try {
                car2.join();
                car3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
            }

