package by.homework.lessons.task_11;

public class Main {
    public static void main(String[] args) {
        RobotCook cook = new RobotCook("Робот -повар", 250, "Китай", "Плита", false);
        RobotSapper sapper = new RobotSapper("Робот -сапер", 700, "FR123", "Алюминий", false);
        RobotBuilder builder = new RobotBuilder("Робот-cтроитель", 800, "Беларусь", "Погрузчик", "Железо", false);

        cook.repairRobot();
        sapper.repairRobot();
        builder.repairRobot();

        cook.turnOn();
        cook.turnOff();
        sapper.turnOn();
        sapper.turnOff();
        builder.turnOn();
        builder.turnOff();

        cook.uniquePossibility();
        sapper.uniquePossibility();
        builder.uniquePossibility();

        System.out.println("*****************Выставки******************");

        Robot[] allRobots = {cook,sapper,builder};
        RobotEngener[] engineerRobots= {sapper,builder};
        RobotSapper[] sapperRobots = {sapper};

        System.out.println("*****Все роботы****");
        for (Robot robot: allRobots)
            robot.uniquePossibility();

        System.out.println("****Инженерные роботы*****");
        for (RobotEngener engineer: engineerRobots)
            engineer.uniquePossibility();

        System.out.println("***Демонстрация создания предметов роботами-инженерами:******");
        for (RobotEngener engineer : engineerRobots) {
            engineer.createItem();
        }

        System.out.println("******Саперные роботы*******");
        for (RobotSapper sapper1: sapperRobots){
            sapper1.uniquePossibility();
        }
    }
}
