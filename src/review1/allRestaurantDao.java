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
import java.util.ArrayList;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author KirkThunder
 */
public class allRestaurantDao {

    //selectnam
    public ArrayList<Restaurant> getAllRestarant() {
        ArrayList<Restaurant> list = new ArrayList<>();
        try {
            PreparedStatement pst;
            Connection connection;
            connection = DriverManager.getConnection(db.url, db.username, db.password);
            Statement st = connection.createStatement();
            String countfromdatabase = "Select idRestaurant,NameRestaurant,Rating,Province From Restaurant";
            ResultSet rs = st.executeQuery(countfromdatabase);

            while (rs.next()) {
                list.add(new Restaurant(rs.getInt("idRestaurant"),rs.getString("NameRestaurant"), rs.getDouble("Rating"), rs.getString("Province")));
               
            }

        } catch (SQLException ex) {

        }
        return list;
    }

   

}
