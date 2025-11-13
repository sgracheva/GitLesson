package by.homework.lessons.task_15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Иван", "Иванов", 25, 3500);
        Employee e2 = new Employee(2, "Иванна", "Иванова", 27, 2700);
        Employee e3 = new Employee(3, "Петр", "Петров", 30, 3000);
        Employee e4 = new Employee(4, "Сидр", "Сидоров", 32, 4200);
        Employee e5 = new Employee(5, "Михаил", "Михайлов", 29, 3900);
        Employee e6 = new Employee(6, "Светлана", "Грачева", 35, 3200);
        Employee e7 = new Employee(7, "Анна", "Иванкова", 22, 2500);
        Employee e8 = new Employee(8, "Андрей", "Андреев", 39, 5500);

        //1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.

        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "Экономист");
        employeeMap.put(e2, "Главный экономист");
        employeeMap.put(e3, "Начальник отдела");
        employeeMap.put(e4, "Ведущий экономист");
        employeeMap.put(e5, "Экономист");
        employeeMap.put(e6, "Главный экономист");
        employeeMap.put(e7, "Экономист");
        employeeMap.put(e8, "Директор");

        System.out.println("ЗП до повышения: ");
        printEmployees(employeeMap);

        raiseSalary(employeeMap, "Экономист", 200);


        System.out.println("ЗП после повышения: ");
        printEmployees(employeeMap);


    }

    private static void raiseSalary(Map<Employee, String> employees, String profession, int amount) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee emp = entry.getKey();
            String prof = entry.getValue();

            if (prof.equals(profession)) {
                int currentSalary = emp.getSalary();
                emp.setSalary(currentSalary + amount); // увеличиваем зарплату
            }
        }
    }

    private static void printEmployees(Map<Employee, String> map) {
        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " / Профессия: " + entry.getValue());
        }
    }
}