/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author KirkThunder
 */
public class allRestaurantDao {
    
    //selectnam
    public static void getname(){
        String name01 = "";
        try {
            db db = new db();

            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement stmt = connection.createStatement();
            String countfromdatabase = "Select NameRestaurant From Restaurant ";
            ResultSet rs = stmt.executeQuery(countfromdatabase);
            
            
        } catch (SQLException ex) {

        }

        
    }
    
}

