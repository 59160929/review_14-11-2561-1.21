/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 59160929
 */
public class RestaurantDao {

    
   
    
    
    public static boolean addPointAndCount(int IDrestaurant, int count, int point) throws SQLException {
        PreparedStatement pst;
        Connection connection;

        connection = DriverManager.getConnection(db.url, db.username, db.password);
        connection.createStatement();
        pst = connection.prepareStatement("Select * from Restaurant where IDrestaurant = ? ");
        //pst.setString(1, IDrestaurantChange);

        //String IDrestaurantChange = Integer.toString(IDrestaurant);
        ResultSet rs = pst.executeQuery();
        boolean result = rs.next();
        connection.close();
        return result;

    }

    public static boolean updatePointAndCount(String IDRestaurant, int count, int point) throws SQLException {
        PreparedStatement pst;
        Connection connection;

        String keepIDrestaurant = "" + IDRestaurant;
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        connection.createStatement();

        String sql = "update Restaurant SET count = ? , point= ? WHERE idRestaurant = " + keepIDrestaurant;
        pst = connection.prepareStatement(sql);

        pst.setInt(1, count);
        pst.setInt(2, point);
        pst.executeUpdate();

        return true;

    }

    //get count from restaurant
    public static int getCount(String IDRestaurant) throws SQLException {

        PreparedStatement pst;
        Connection connection;
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        int countdatabase = 0;
        Statement st = connection.createStatement();

        String keepIDrestaurant = "" + IDRestaurant;
        String countfromdatabase = "Select count From Restaurant WHERE idRestaurant= " + keepIDrestaurant;
        ResultSet rs = st.executeQuery(countfromdatabase);
        if (rs.next()) {

            countdatabase = rs.getInt("count");

        }
        return countdatabase;
    }

    //get point from restaurant
    public static int getPoint(String IDRestaurant) throws SQLException {

        PreparedStatement pst;
        Connection connection;
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        int pointdatabase = 0;
        Statement st = connection.createStatement();

        String keepIDrestaurant = "" + IDRestaurant;
        String countfromdatabase = "Select point From Restaurant WHERE idRestaurant= " + keepIDrestaurant;
        ResultSet rs = st.executeQuery(countfromdatabase);
        if (rs.next()) {

            pointdatabase = rs.getInt("point");

        }
        return pointdatabase;
    }

    public ArrayList<Restaurant> getAllRestaurant() throws SQLException {

        Restaurant restaurant;
        PreparedStatement pst;
        Connection connection;
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        ArrayList<Restaurant> res = new ArrayList<>();
        Statement st = connection.createStatement();

        String countfromdatabase = "Select * From Restaurant";
        ResultSet rs = st.executeQuery(countfromdatabase);
        if (rs.next()) {

            res.add(new Restaurant(rs.getInt("idRestaurant"), rs.getString("NameRestaurant"), rs.getString("AddressRestaurant"), rs.getString("DescribtionRestaurant"), rs.getFloat("Longtitude"), rs.getFloat("Latitude"), rs.getInt("Point"), rs.getInt("Count")));

        }
        return res;
    }

    public static String getDescribtionRestaurant(String IDRestaurant) throws SQLException {

        PreparedStatement pst;
        Connection connection;
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        String DescribtionRestaurantdatabase = null;
        Statement st = connection.createStatement();

        String keepIDrestaurant = "" + IDRestaurant;
        String countfromdatabase = "Select DescribtionRestaurant From Restaurant WHERE idRestaurant= " + keepIDrestaurant;
        ResultSet rs = st.executeQuery(countfromdatabase);
        if (rs.next()) {

            DescribtionRestaurantdatabase = rs.getString("DescribtionRestaurant");

        }
        return DescribtionRestaurantdatabase;
    }

    
    
    
    public static String getAddressRestaurant(String IDRestaurant) throws SQLException {

        PreparedStatement pst;
        Connection connection;
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        String AddressRestaurantdatabase = null;
        Statement st = connection.createStatement();

        String keepIDrestaurant = "" + IDRestaurant;
        String countfromdatabase = "Select AddressRestaurant From Restaurant WHERE idRestaurant= " + keepIDrestaurant;
        ResultSet rs = st.executeQuery(countfromdatabase);
        if (rs.next()) {

            AddressRestaurantdatabase = rs.getString("AddressRestaurant");

        }
        return AddressRestaurantdatabase;
    }
    
    
     public static String getNameRestaurantDao(String IDRestaurant) throws SQLException {

        PreparedStatement pst;
        Connection connection;
        connection = DriverManager.getConnection(db.url, db.username, db.password);
        String NameRestaurantdatabase = null;
        Statement st = connection.createStatement();

        String keepIDrestaurant = "" + IDRestaurant;
        String countfromdatabase = "Select NameRestaurant From Restaurant WHERE idRestaurant= " + keepIDrestaurant;
        ResultSet rs = st.executeQuery(countfromdatabase);
        if (rs.next()) {

            NameRestaurantdatabase = rs.getString("NameRestaurant");

        }
        return NameRestaurantdatabase;
    }
    
    
    
    
}
