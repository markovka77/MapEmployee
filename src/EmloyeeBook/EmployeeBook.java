package EmloyeeBook;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    public static Map<String, Employee> employee = new HashMap<>(Map.of(
            "0",
            new Employee("Andy", "Warhol"),
            "1",
            new Employee("Jean-Michel", "Basquiat"),
            "2",
            new Employee("Kurt", "Cobain"),
            "3",
            new Employee("Jared", "Leto"),
            "4",
            new Employee("Johnny", "Depp"),
            "5",
            new Employee("Angelina", "Jolie"),
            "6",
            new Employee("Mike", "Tyson"),
            "7",
            new Employee("Muhammed", "Ali"),
            "8",
            new Employee("Lionel", "Messi"),
            "9",
            new Employee("Kylian", "Mbappe")

    ));


}
