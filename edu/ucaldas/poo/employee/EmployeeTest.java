package edu.caldas.poo.employee;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {
    public static void main(String[] args) {
        Map<String, Employee> employedMap = new HashMap<>();

        Employee employee1 = new Employee("Antioquia", "Jorge", 4000000);
        Employee employee2 = new Employee("Caldas", "Julian", 10000000);

        employedMap.put("employed1", employee1);
        employedMap.put("employed2", employee2);


        for (String employeeName : employedMap.keySet()) {
            Employee employee = employedMap.get(employeeName);
            double salary = employee.getSalary();
            double salaryA = employee.methodSalaryA(salary);

            DecimalFormat formatter = new DecimalFormat("#,###.##");
            String salaryFormattedA = formatter.format(salaryA);
            String salaryFormattedM = formatter.format(salary);

            String responseName = "Su nombre es " + employee.getNameEmployed();
            String responseDepartment = "Vive en el departamento de " + employee.getDepartment();
            String responseSalary = "Su salario mensual es " + "$ " + salaryFormattedM + " de pesos";
            String responseSalaryA = "y su salario anual es de " + "$ " + salaryFormattedA + " pesos";
            String responseID = "y su ID de registro es " + employee.getID();

            System.out.println(responseName + " " + responseID);
            System.out.println(responseDepartment);
            System.out.println(responseSalary + " " + responseSalaryA);
            System.out.println();
        }
    }
}
