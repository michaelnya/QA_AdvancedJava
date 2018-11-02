/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.events.managment.dbservices;

import acme.events.management.model.Speaker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class PersistenceManager {
    private final static List<Speaker> speakers = new ArrayList<>();
    private static Connection conn;
    String query = "SELECT Id, Name, Rate, ContactNumber from SPEAKERS";

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //must live in a configuration file
        String connectionUrl = "jdbc:sqlserver://STUDENT05\\SQLEXPRESS:1433;databaseName=Event;integratedSecurity=true;";
        if(conn==null){
            conn = DriverManager.getConnection(connectionUrl);
        }
        
    }

    public static void saveToDb(Speaker speaker) throws SQLException, ClassNotFoundException {
        connect();
        PreparedStatement ps = conn.prepareStatement("insert into speaker(name,rate,contactNumber)values(?,?,?)");
        ps.setString(1, speaker.getName());
        ps.setDouble(2, speaker.getRate());
        ps.setString(3, speaker.getContactNumber());

        ps.execute();
    }
    
    //s4
    public static String findSpeakerWithLongestName(){
        // lambda for speaker w highest rate
        String longestName = "";
        for (Speaker speaker : speakers){
            
            if (speaker.getName().length() > longestName.length()){
                longestName = speaker.getName();
            }
        }
        return longestName;
    }
    
    //s4
    public static String findSpeakerWithShortestName(){
        // lambda for speaker w highest rate
        String shortestName = "";
        for (Speaker speaker : speakers){
            
            if (speaker.getName().length() < shortestName.length()){
                shortestName = speaker.getName();
            }
        }
        return shortestName;
    }
    // s3
    public static double getSpeakerWithHighestRate(){
        // lambda for speaker w highest rate
//        speakers.forEach(e->{
//            System.out.println(e.getName());
//        
//        });
        double maxRate = 0.0;
        for (Speaker speaker : speakers){
            
            if (speaker.getRate() > maxRate){
                maxRate = speaker.getRate();
            }
        }
    
    return maxRate;
    }
    //s1
    public static List<Speaker> getSpeakers(){
        try {
            // make a select query to database the populate collection
            connect();
            ResultSet rs = conn.prepareStatement("SELECT Id, Name, Rate, ContactNumber from SPEAKER").executeQuery();
            while(rs.next()){
                speakers.add(new Speaker(rs.getString("Name"), rs.getInt("Id"), rs.getString("ContactNumber"), rs.getDouble("Rate")));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PersistenceManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return speakers;
    }
}
