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
import java.text.DecimalFormat;

/**
 *
 * @author 59160929
 */
public class ReviewPostService {

    RestaurantDao reviewPostDao = new RestaurantDao();

    public static String avgPoint(int IDRestaurant) throws SQLException {
        float count = 0;
        float point = 0;

        String keepIDrestaurant = "" + IDRestaurant;
        String totalavarage;
        RestaurantDao reviewPostDao = new RestaurantDao();

        count = reviewPostDao.getCount(keepIDrestaurant) + count;
        point = reviewPostDao.getPoint(keepIDrestaurant) + point;
        if (count == 0) {
            totalavarage = "no point";
        } else {
            float average = point / count;
            DecimalFormat changeformat = new DecimalFormat("#.##");
            totalavarage = changeformat.format(average);

        }

        return totalavarage;

    }

    public static boolean sumPointAndCountToDB(int IDRestaurant, int count, int point) throws SQLException {

        String keepIDrestaurant = "" + IDRestaurant;
        int getcount = RestaurantDao.getCount(keepIDrestaurant);
        count = getcount + count;
        int getpoint = RestaurantDao.getPoint(keepIDrestaurant);
        point = getpoint + point;

        RestaurantDao.updatePointAndCount(keepIDrestaurant, count, point);

        return true;

    }
    
    public static String getDescribtion(int IDRestaurant) throws SQLException {
        String info;
        

        String keepIDrestaurant = "" + IDRestaurant;
        String DescribtionRestaurant;
        RestaurantDao reviewPostDao = new RestaurantDao();

        DescribtionRestaurant = reviewPostDao.getDescribtionRestaurant(keepIDrestaurant);
        
       
        return DescribtionRestaurant;

    }
    
    
    public static String getAddressRestaurant(int IDRestaurant) throws SQLException {
        String info;
        

        String keepIDrestaurant = "" + IDRestaurant;
        String AddressRestaurant;
        RestaurantDao reviewPostDao = new RestaurantDao();

        AddressRestaurant = reviewPostDao.getAddressRestaurant(keepIDrestaurant);
        
       
        return AddressRestaurant;

    }
    
    
      public static String getNameRestaurant(int IDRestaurant) throws SQLException {
        String info;
        

        String keepIDrestaurant = "" + IDRestaurant;
        String NameRestaurant;
        RestaurantDao reviewPostDao = new RestaurantDao();

        NameRestaurant = reviewPostDao.getNameRestaurantDao(keepIDrestaurant);
        
       
        return NameRestaurant;

    }
    
    
}
