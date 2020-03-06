package org.example.model;

public class Employee {
    private int empId;
    private String empName;
    private String empCity;
    private int empAge;
    private String empDept;
    public Employee(int empId, String empName, String empCity, int empAge, String empDept)
    {
         this.empId=empId;
         this.empName=empName;
         this.empCity=empCity;
         this.empAge=empAge;
         this.empDept=empDept;
    }

    public int getEmpId() {
        return empId;
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
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", empAge=" + empAge +
                ", empDept='" + empDept + '\'' +
                '}';
    }
}
