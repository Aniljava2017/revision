package model;

import java.text.DecimalFormat;
import java.util.Objects;

public class Employee {

     String emp_name;
     Integer emp_age;
     Double emp_salary;

    public Employee(String emp_name, Integer emp_age, Double emp_salary) {

        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_salary = emp_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", emp_name='" + emp_name + '\'' +
                ", emp_age=" + emp_age +
                ", emp_salary=" + emp_salary +
                '}';
    }





    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(Integer emp_age) {
        this.emp_age = emp_age;
    }

    public Double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(Double emp_salary) {
        this.emp_salary = emp_salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(emp_name, employee.emp_name) && Objects.equals(emp_age, employee.emp_age) && Objects.equals(emp_salary, employee.emp_salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_name, emp_age, emp_salary);
    }
}