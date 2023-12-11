/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp.Lists;

import java.util.ArrayList;
import trackerapp.Activity;

/**
 *
 * @author micle
 */
public class ActivityList {
    ArrayList<Activity> activities;
    //File file;
    
    private ActivityList(){
        activities = new ArrayList<Activity>();
      //  file = new File("cars.txt");
    }
    
    
    private static ActivityList INSTANCE = new ActivityList();
    
    public static ActivityList getInstance(){
        return INSTANCE;
    }
    
    public void addActivity(Activity activity){
        activities.add(activity);
    }
    
    public ArrayList<Activity> getActivities(){
        return activities;
    }
}
