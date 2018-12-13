/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

/**
 *
 * @author 59160929
 */
public final class Restaurant {

    private int idRestaurant;
    private String NameRestaurant;
    private String AddressRestaurant;
    private String DescribtionRestaurant;
    private int Restarantnearby1;
    private int Restarantnearby2;
    private int Restarantnearby3;
    private String Province;
    private int Count;
    private int Point;
    private double Rating;
    private String linkImage;
    private long Restaurantcol;
    public Restaurant(){
    
    }
     public Restaurant(int idRestaurant, String NameRestaurant,String AddressRestaurant,String DescribtionRestaurant,int Count,int Point,int Restarantnearby1,int Restarantnearby2,int Restarantnearby3,String Province,double rating,String linkImage) {
        this.idRestaurant = idRestaurant;
        this.NameRestaurant = NameRestaurant;
        this.AddressRestaurant = AddressRestaurant;
        this.DescribtionRestaurant = DescribtionRestaurant;
        this.Count = Count;
        this.Point = Point;
        this.Restarantnearby1 = Restarantnearby1;
        this.Restarantnearby2 = Restarantnearby2;
        this.Restarantnearby3 = Restarantnearby3;
        this.Province = Province;
        this.Rating = Rating;
        this.linkImage = linkImage;

        
    }

    public void setidRestaurant(int idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public void setNameRestaurant(String NameRestaurant) {
        this.NameRestaurant = NameRestaurant;
    }

    public void setAddressRestaurant(String AddressRestaurant) {
        this.AddressRestaurant = AddressRestaurant;
    }

    public void setDescribtionRestaurant(String DescribtionRestaurant) {
        this.DescribtionRestaurant = DescribtionRestaurant;
    }
    
    public void setCount(int Count) {
        this.Count = Count;
    }
    public void setPoint(int Point) {
        this.Point = Point;
    }
    
    public void setRestarantnearby1(int Restarantnearby1) {
        this.Restarantnearby1 = Restarantnearby1;
    }

    public void setRestarantnearby2(int Restarantnearby2) {
        this.Restarantnearby2 = Restarantnearby2;
    }

    public void setRestarantnearby3(int Restarantnearby3) {
        this.Restarantnearby3 = Restarantnearby3;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }
    public void setRating(int Rating) {
        this.Rating = Rating;
    }
   public void setlinkImage(String linkImage) {
        this.linkImage = linkImage;
    }
   
   public void setRestaurantcol(long Restaurantcol) {
        this.Restaurantcol = Restaurantcol;
    }
   
    Restaurant(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIDRestaurant() {
        return idRestaurant;
    }

    public String getNameRestaurant() {
        return NameRestaurant;
    }

   public String getAddressRestaurant() {
        return AddressRestaurant;
    }

    public String getDescribtionRestaurant() {
       return DescribtionRestaurant;
    }
    
   public int getCount() {
       return Count;
    }
    public int getPoint() {
         return Point;
    }
    
    public int getRestarantnearby1() {
        return Restarantnearby1 ;
    }

    public int getRestarantnearby2() {
        return Restarantnearby2;
    }

    public int getRestarantnearby3() {
        return Restarantnearby3;
    }

    public String getProvince() {
        return Province;
    }
    public double getRating() {
        return Rating;
    }
   public String getlinkImage() {
        return linkImage;
    }
  
    
    
    
    
    
    

}
