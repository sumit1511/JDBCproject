package org.example.controller;

import org.example.helper.JDBCHelper;
import org.example.model.Employee;

import java.sql.*;

public class DBQueries {

    // statement vs ps
    // transaction in jdbc
    // sql injection in jdbc
    // db connection pooling
    public static void insertEmployee(Employee employee)
    {
        try {
            Connection connection = JDBCHelper.getConnection();
            Statement statement= connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement( "INSERT INTO employeetable(empId,empName,empCity,empAge,empDept)VALUES(?,?,?,?,?)");
            preparedStatement.setString(1,Integer.toString(employee.getEmpId()));
            preparedStatement.setString(2,employee.getEmpName());
            preparedStatement.setString(3,employee.getEmpCity());
            preparedStatement.setString(4,Integer.toString(employee.getEmpAge()));
            preparedStatement.setString(5,employee.getEmpDept());
            preparedStatement.executeUpdate();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    public static void retrieveEmployees()
    {
        try {
            Connection connection = JDBCHelper.getConnection();
            PreparedStatement st = connection.prepareStatement("select * from employeeTable");
            ResultSet resultSet=st.executeQuery();
            System.out.println("Employee table data");
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "
                +resultSet.getString(4)+" "+resultSet.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteEmployee(int id )
    {
        try {
            Connection connection = JDBCHelper.getConnection();
            System.out.println("Employee"+id+" "+"data is deleted");
            PreparedStatement preparedStatement = connection.prepareStatement("delete from employeeTable where empId=?");
            preparedStatement.setString(1,Integer.toString(id));
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateEmployee(int id,String empName)
    {
        try {
            Connection connection = JDBCHelper.getConnection();
            System.out.println("Employee"+id+" "+"data is updated");
            PreparedStatement preparedStatement = connection.prepareStatement("update employeeTable set empName=? where empId=?");
            preparedStatement.setString(1,empName);
            preparedStatement.setString(2,Integer.toString(id));
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
