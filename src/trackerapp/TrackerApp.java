/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trackerapp;

import trackerapp.Lists.ActivityList;
import trackerapp.Lists.WorkoutPlanList;
import java.util.ArrayList;
import trackerapp.enums.WorkoutExperience;
import trackerapp.enums.WorkoutType;
import trackerapp.forms.MenuForm;

/**
 *
 * @author micle
 */
public class TrackerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ActivityList list = ActivityList.getInstance();
        
        WorkoutPlanList workoutList = WorkoutPlanList.getInstance();
        
        
        ArrayList<Workout> workouts1 = new ArrayList<Workout>();
        ArrayList<Exercise> exercises1 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises2 = new ArrayList<Exercise>();
//        ArrayList<Exercise> exercises3 = new ArrayList<Exercise>();
//        ArrayList<Exercise> exercises4 = new ArrayList<Exercise>();
        
        exercises1.add(new Exercise("Shoulder Press",5,6));
        exercises1.add(new Exercise("Lateral Raises",4,14));
        exercises1.add(new Exercise("Dumbell Kickback",4,12));
        exercises1.add(new Exercise("Skull Crushers",5,14));
        exercises1.add(new Exercise("Squats",6,6));
        
        
        exercises2.add(new Exercise("Bench Press",5,6));
        
        exercises2.add(new Exercise("Cable Flys",3,20));
        
        exercises2.add(new Exercise("Dumbell Curls",4,12));
        
        exercises2.add(new Exercise("Cable Curls",4,12));
        exercises2.add(new Exercise("T-bar rows",4,10));
        
       
        
        workouts1.add(new Workout(0,exercises1));
        workouts1.add(new Workout(1,exercises2));
        workouts1.add(new Workout(2,exercises1));
        
        
        workoutList.addPlan(new WorkoutPlan(workouts1,WorkoutExperience.INTERMEDIATE,WorkoutType.CALITHENICS));
        workoutList.addPlan(new WorkoutPlan(workouts1,WorkoutExperience.BEGINNER,WorkoutType.CALITHENICS));
        
        
        
        
        // TODO code application logic here
//        ActivityLogsForm activitiesForm = new ActivityLogsForm();
//        
//        activitiesForm.setLocationRelativeTo(null);
//        
//        activitiesForm.setVisible(true);

        MenuForm menuForm = new MenuForm();
        
        menuForm.setLocationRelativeTo(null);
       
        menuForm.setVisible(true);
        
        
    }  
}
