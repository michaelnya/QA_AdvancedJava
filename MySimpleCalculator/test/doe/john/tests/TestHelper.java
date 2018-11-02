/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doe.john.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestHelper {
        public static void testDbConnection() {
        // TODO code application logic here
        //Connect to database
        String connectionUrl  = "";
        try {
            Class.forName("mySQL.jdbc.driver.blahaha");//whats the jdbc driver
            Connection conn  = DriverManager.getConnection(connectionUrl);//whats the connection
            //Display the data in product table
            PreparedStatement ps  = conn.prepareStatement("SELECT ProductId, ProductName FROM PRODUCT");
            ResultSet rs  =  ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("ProductName");
                System.out.println(name);
                //
            }
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Supermarkettestharness.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(Supermarkettestharness.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
