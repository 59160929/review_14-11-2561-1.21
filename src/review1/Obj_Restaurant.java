/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

/**
 *
 * @author moojeen
 */
public class Obj_Restaurant {

    private String nameRestaurant;
    private double RatingRestaurant;
    private String Province;

    public Obj_Restaurant(String nameRestaurant, double RatingRestaurant, String Province) {
        this.nameRestaurant = nameRestaurant;
        this.RatingRestaurant = RatingRestaurant;
        this.Province = Province;

    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public double getRating() {
        return RatingRestaurant;
    }

    public String getProvince() {
        return Province;
    }
    
    public void setIDRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }
    public void setNameRestaurant(double RatingRestaurant) {
        this.RatingRestaurant = RatingRestaurant;
    }
     public void setlinkImage(String Province) {
        this.Province = Province;
    }

    public String toString() {
        return nameRestaurant + " " + RatingRestaurant + " " + Province;
    }
}
