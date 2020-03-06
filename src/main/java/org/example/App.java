package org.example;

import org.example.controller.DBQueries;
import org.example.model.Employee;

import java.util.Scanner;

public class App {
   private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            optionViewer();
            int option = scanner.nextInt();
            optionPerformer(option);
        }
    }
   static private  void optionPerformer(int option)
    {
        if(option==1)
        {
            System.out.println("Write New employee related data");
            System.out.println("Write employee ID");
            int empID= scanner.nextInt();
            System.out.println("Write employee Name");
            String empName= scanner.next();
            System.out.println("Write employee City");
            String empCity= scanner.next();
            System.out.println("Write employee Age");
            int empAge= scanner.nextInt();
            System.out.println("Write employee Department");
            String empDept= scanner.next();
            Employee employee = new Employee(empID,empName,empCity,empAge,empDept);
            DBQueries.insertEmployee(employee);
            System.out.println(employee.toString() + "  data is inserted successfully.....");
        }
        else if(option==2)
        {
            System.out.println("Write New employee related data");
            System.out.println("Write employee ID");
            int empID= scanner.nextInt();
            DBQueries.deleteEmployee(empID);
            System.out.println("data is deleted successfully.....");
        }
        else if(option==3)
        {
            System.out.println("Write New employee related data");
            System.out.println("Write New employee ID");
            int empID= scanner.nextInt();
            System.out.println("Write New name employee");
            String empName= scanner.next();
            DBQueries.updateEmployee(empID,empName);
            System.out.println("data is updated successfully.....");
        }
        else if(option==4)
        {
              DBQueries.retrieveEmployees();
        }
        else
        {
            System.out.println("you choose wrong option");
        }
    }
   static private  void optionViewer()
    {
        System.out.println("select option what you want to do");
        System.out.println("1.Create new Record");
        System.out.println("2.delete particular Record");
        System.out.println("3.Update Name of particular employee Id Record");
        System.out.println("4.Show all employee Record");
    }
}
