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
import java.util.ArrayList;

/**
 *
 * @author 59160929
 */

public class ReviewPostService {

        private static DaoReview restaurantDao;
        private static DaoReview restaurant;

         
        public static ArrayList<Restaurant> getLinkImage(){
            
            restaurantDao = new  RestaurantDao();
            
            
            
            return restaurantDao.getRestaurant();
        }
        
        public static String getLink(int IDRestaurant){
           ArrayList<Restaurant> restaurant = getLinkImage();
           
           for(int i=0 ;i<restaurant.size();i++){
               return restaurant.get(IDRestaurant).getlinkImage();
           }
           return "";
        }
        public static double avgPoint(int IDRestaurant){
           ArrayList<Restaurant> restaurant = getLinkImage();
           
           for(int i=0 ;i<restaurant.size();i++){
               
               double count = restaurant.get(IDRestaurant).getCount();
                double point = restaurant.get(IDRestaurant).getPoint();
                double average = point/count;
               return average;
               
           }
           return 0.00 ;
           
        }
        public static String getNameRestaurant(int IDRestaurant){
           ArrayList<Restaurant> restaurant = getLinkImage();
           
           for(int i=0 ;i<restaurant.size();i++){
               
               String name = restaurant.get(IDRestaurant).getNameRestaurant();
               
               return name;
               
           }
           return "";

            }
        public static String getDescribtionRestaurant(int IDRestaurant){
           ArrayList<Restaurant> restaurant = getLinkImage();
           
           for(int i=0 ;i<restaurant.size();i++){
               
               String describtion = restaurant.get(IDRestaurant).getDescribtionRestaurant();
               
               return describtion;
               
           }
           return "";

            }
            
         public static String getAddressRestaurant(int IDRestaurant){
           ArrayList<Restaurant> restaurant = getLinkImage();
           
           for(int i=0 ;i<restaurant.size();i++){
               
               String addressRestaurant = restaurant.get(IDRestaurant).getAddressRestaurant();
               
               return addressRestaurant;
               
           }
           return "";

            }
       public static boolean sumPointAndCountToDB(int IDRestaurant, int count, int point) throws SQLException{
         
       ArrayList<Restaurant> restaurant = getLinkImage();
           
           for(int i=0 ;i<restaurant.size();i++){
               
               int getcount = restaurant.get(IDRestaurant).getCount();
               count = count+getcount;
                int getpoint = restaurant.get(IDRestaurant).getPoint();
                point = point+getpoint;
                double average = point/count;
                String ID = IDRestaurant+"";
                    RestaurantDao.updatePointAndCount(ID, count, point);
               return true;
               
           }
            return false;

            }      
            
            
    
   
                    
        
        public static void main(String [] args){
            ArrayList<Restaurant> restaurant = getLinkImage();
            
            
            for(int i=0;i<restaurant.size();i++){
                System.out.println( getLink(2));
            }
            
        }
        
         
         /**
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
    
        public static String getLinkRestaurant(int IDRestaurant) throws SQLException {

        String keepIDRestaurant = "" + IDRestaurant;
        Restaurant restaurant = new Restaurant();
        String link=null;
        
        restaurant = reviewPostDao.getRestaurant(keepIDRestaurant);
        
        return link;

    }

    public static boolean sumPointAndCountToDB(int IDRestaurant, int count, int point) throws SQLException {
       
        String keepIDrestaurant = "" + IDRestaurant;
        RestaurantDao reviewPostDao = new RestaurantDao();
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
      public static String getLinkRestaurant(int IDRestaurant) throws SQLException {
        

        String keepIDrestaurant = "" + IDRestaurant;
        String linkImage;
        RestaurantDao reviewPostDao = new RestaurantDao();

        linkImage = reviewPostDao.getLinkRestaurant(keepIDrestaurant);
        
       
        return linkImage;

    }
    
      public static String getNameRestaurant(int IDRestaurant) throws SQLException {
        String info;
        

        String keepIDrestaurant = "" + IDRestaurant;
        String NameRestaurant;
        RestaurantDao reviewPostDao = new RestaurantDao();

        NameRestaurant = reviewPostDao.getNameRestaurantDao(keepIDrestaurant);
        
       
        return NameRestaurant;

    }
    
    */
}
