package Service;

import EmloyeeBook.Employee;

import static EmloyeeBook.EmployeeBook.employee;

public class Service {
    public static void addEmployee(String key, String firstName, String lastName) {
        if (!employee.containsValue(new Employee(firstName, lastName))) {
            employee.put(key, new Employee(firstName, lastName));
            System.out.println(employee.get(key) + " added");
        } else {
            throw new RuntimeException("such employee already exists");
        }


    }

    public static void removeEmployee(String key, String firstName, String lastName) {
        if (employee.containsValue(new Employee(firstName, lastName))) {
            employee.remove(key, new Employee(firstName, lastName));
            System.out.println(firstName + " " + lastName + " " + "was remove");
        } else {
            throw new RuntimeException("no such employee");
        }
    }

    public static void findEmployee(String key) {
        if (!(employee.get(key) == null)) {
            System.out.println(employee.get(key));
        } else {
            throw new RuntimeException("not found!");
        }
    }


}








