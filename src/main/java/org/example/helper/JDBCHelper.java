package org.example.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCHelper {
    private static Connection connection;
    static
    {
        try
        {
            Class.forName( JDBCConstants.DRIVER_NAME );
        }
        catch ( ClassNotFoundException e )
        {
            System.out.println( "Driver class not found" );
        }
    }
    public static Connection getConnection() throws SQLException
    {
        connection = DriverManager.getConnection( JDBCConstants.URL, JDBCConstants.USERNAME, JDBCConstants.PASSWORD );
        return connection;
    }
    public static void closeConnection( Connection con ) throws SQLException
    {
        if ( con != null )
        {
            con.close();
        }
    }
}
