/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp.Lists;

import java.util.ArrayList;
import trackerapp.WorkoutPlan;
import trackerapp.WorkoutPlanFilters;

/**
 *
 * @author micle
 */
public class WorkoutPlanList {
     ArrayList<WorkoutPlan> plans;
    //File file;
    
    private WorkoutPlanList(){
        plans = new ArrayList<WorkoutPlan>();
        
      //  file = new File("cars.txt");
    }
    
    private static WorkoutPlanList INSTANCE = new WorkoutPlanList();
    
    public static WorkoutPlanList getInstance(){
        return INSTANCE;
    }
    
    public void addPlan(WorkoutPlan plan){
        plans.add(plan);
    }
    
    public ArrayList<WorkoutPlan> getPlans(){
        return plans;
    }
    
    public ArrayList<WorkoutPlan> getPlansByFilters(WorkoutPlanFilters filters){
        ArrayList<WorkoutPlan> results = new ArrayList<WorkoutPlan>();
        
        for(WorkoutPlan wp : plans){
            if(wp.getExperience() == filters.getExperience() 
               && wp.getType() == filters.getWorkoutType()
               && wp.getWorkouts().size() == filters.getDaysAWeek()){
            
                results.add(wp);
                
            } 
        }
        
        return results;
    }
    
    
//    public void loadFile() throws FileNotFoundException{
//        
//        Scanner in = new Scanner(file);
//        
//        while(in.hasNextLine()){
//            cars.add(in.nextLine());
//        }
//        in.close();
//    }
    
//    public void saveFile() throws FileNotFoundException{
//        PrintStream out = new PrintStream(file);
//        
//        for(int i = 0;i < cars.size();i++){
//            out.println(cars.get(i));
//        }
//        
//        out.close();
//    }
    
    
}
