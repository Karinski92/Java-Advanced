package Advanced.DefiningClasses.Exercises.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    List <Employee> depEmployees = new ArrayList<>();
    double averageSalary = 0;
    double allSalary = 0;


    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getDepEmployees() {
        return depEmployees;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public double getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(double salary) {
        this.allSalary += salary;
    }

    public void salaryNew(Department holder, double salary, Employee singleEmployee) {
        holder.getDepEmployees().add(singleEmployee);
        holder.setAllSalary(salary);
        double averageSalary = holder.getAllSalary()/holder.getDepEmployees().size();
        holder.setAverageSalary(averageSalary);
    }
}
