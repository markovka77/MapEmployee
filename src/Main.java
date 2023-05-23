import Service.Service;

import static EmloyeeBook.EmployeeBook.employee;

public class Main {
    public static void main(String[] args) {

        Service.addEmployee("12", "Mark", "Voronkov");
        System.out.println(employee);
        Service.removeEmployee("12", "Mark", "Voronkov");
        Service.findEmployee("1");


    }
}