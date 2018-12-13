/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review1;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author KirkThunder
 */
public class allRestaurantService {

    public static ArrayList<Obj_Restaurant> getData() {
        allRestaurantDao data = new allRestaurantDao();

        return data.getAll();
    }

}
