package Advanced.DefiningClasses.Exercises.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentList = new HashMap<>();
        while (line-- > 0){
            String[] token = scanner.nextLine().split("\\s+");
            Employee person = null;
            String name = token[0];
            double salary = Double.parseDouble(token[1]);
            String position = token[2];
            String department = token[3];

            if(token.length==4) {
                person = new Employee(name, salary, position, department);

            }
            if(token.length==6) {
                person = new Employee(name, salary, position, department, token[4], Integer.parseInt(token[5]));

            }
            if(token.length==5) {
                if(token[4].chars().allMatch(Character::isDigit)){
                    person = new Employee(name, salary, position, department, Integer.parseInt(token[4]));
                } else {
                    person = new Employee(name, salary, position, department, token[4]);
                }
            }

            departmentList.putIfAbsent(department, new Department(department));
            Department holder = departmentList.get(department);
            holder.salaryNew(holder, salary, person);
        }
        Optional<Department> holder = departmentList.values().stream().max(Comparator.comparing(Department::getAverageSalary));
        System.out.println("Highest Average Salary: " + holder.get().getName());
        holder.get().getDepEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
    }
}