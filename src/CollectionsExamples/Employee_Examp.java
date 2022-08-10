package CollectionsExamples;

import model.Employee;

import java.util.*;
import java.util.stream.Collectors;


public class Employee_Examp {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Sudheer",35,150000.00));
        list.add(new Employee("Som Chand",45,146000.00));
        list.add(new Employee("Shantanu",25,118000.00));
        list.add(new Employee("Lokesh",36,189000.00));
        list.add(new Employee("Ravi Gupta",31,90000.00));
        list.add(new Employee("Samod",29,158000.00));
        list.add(new Employee("Shantanu",25,118000.00));
        list.add(new Employee("Mahendra Singh",30,163000.00));
        list.add(new Employee("Rakesh Agarawal",31,175000.00));
        list.add(new Employee("Amit Agarawal",33,98000.50));

        System.out.println("Print All Employee ******************************************");
        List<Employee> list1 = list.stream().distinct().collect(Collectors.toList());
        for (Employee var : list1){
            System.out.println("Emp_Name:: "+var.getEmp_name()+"  Emp_Age:: "+ var.getEmp_age()+" Emp_Salary::"+ var.getEmp_salary());
        }

        System.out.println("Print Duplicate Employee ******************************************");
        List<Employee> list2=list.stream().filter(i-> Collections.frequency(list,i)>1).collect(Collectors.toList());
        for (Employee var1 : list2){
            System.out.println("Emp_Name:: "+var1.getEmp_name()+"  Emp_Age:: "+ var1.getEmp_age()+" Emp_Salary::"+ var1.getEmp_salary());
        }

        System.out.println("Print 1Lk Lessthan Employee ******************************************");
        List<Employee> list3=list.stream().filter(i-> i.getEmp_salary()<100000.00).collect(Collectors.toList());
        for (Employee var2:list3){
            System.out.println("Emp_Name:: "+var2.getEmp_name()+"  Emp_Age:: "+ var2.getEmp_age()+" Emp_Salary::"+ var2.getEmp_salary());
        }

        System.out.println("Print Highest Salary ******************************************");
        List<Employee> list4 = list.stream()
                .sorted(Comparator.comparingDouble(Employee::getEmp_salary).reversed()).collect(Collectors.toList());
        for (Employee var3:list4){
            System.out.println("Emp_Name:: "+var3.getEmp_name()+"  Emp_Age:: "+ var3.getEmp_age()+" Emp_Salary::"+ var3.getEmp_salary());
        }

        System.out.println("Print Highest Salary Only One Person");
        Optional<Employee> maxSalaryEmp =
                list.stream()
                        .collect(Collectors.maxBy(Comparator.comparing(Employee::getEmp_salary)));
        System.out.println("Employee with max salary: "
                + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));

    }
}
