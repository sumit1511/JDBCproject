package org.example.model;

public class Employee {
    private String empName;
    private String empCity;
    private int empAge;
    private String empDept;
    public Employee(String empName, String empCity, int empAge, String empDept)
    {

         this.empName=empName;
         this.empCity=empCity;
         this.empAge=empAge;
         this.empDept=empDept;
    }


    public String getEmpName() {
        return empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpDept() {
        return empDept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", empAge=" + empAge +
                ", empDept='" + empDept + '\'' +
                '}';
    }
}
