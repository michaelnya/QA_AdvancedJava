/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.integration.pkg31.pkg10.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DatabaseIntegration3110Tutorial {

    private static Connection con;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        initialiseDb();
    }

    private static void initialiseDb() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://INSTRUCTOR\\SQLEXPRESS:1433;databaseName=events;integratedSecurity=true;";
            con = DriverManager.getConnection(connectionUrl);

            PreparedStatement ps = con.prepareStatement("select * from event;");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id  =  rs.getInt("id");
                String name =  rs.getString("name");
                String description  = rs.getString("description");
                System.out.println(id + ", Event name:" + name + " , Description: " + description);
            }

        }
    }

}
