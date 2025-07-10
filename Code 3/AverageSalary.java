// ### 3  Average Salary per Department  *(Medium)*

// class Employee { String dept; double salary; /* … */ }

// For List<Employee> staff, build a Map<String, Double> mapping department → average salary, rounded to two decimals.

// Key concepts  → `groupingBy`, averagingDouble

// ---

import java.util.*;
import java.util.stream.*;

class Employee {
    String dept;
    double salary;
    Employee(String dept, double salary) {
        this.dept = dept;
        this.salary = salary;
    }
}

public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> staff = Arrays.asList(
            new Employee("HR", 5124.232424),
            new Employee("HR", 7423.24232),
            new Employee("IT", 9000),
            new Employee("IT", 11000)
        );
        Map<String, Double> averageSalaries = staff.stream()
            .collect(Collectors.groupingBy(
                e -> e.dept,
                Collectors.averagingDouble(e -> e.salary)
            ));
        averageSalaries.replaceAll((k, v) -> Math.round(v * 100.0) / 100.0);
        System.out.println(averageSalaries);
    }
}

