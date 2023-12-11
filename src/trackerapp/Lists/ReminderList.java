/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp.Lists;

import java.util.ArrayList;
import trackerapp.Reminder;

/**
 *
 * @author micle
 */
public class ReminderList {
     ArrayList<Reminder> reminders;
    //File file;
    
    private ReminderList(){
        reminders = new ArrayList<Reminder>();
      //  file = new File("cars.txt");
    }
    
    
    private static ReminderList INSTANCE = new ReminderList();
    
    public static ReminderList getInstance(){
        return INSTANCE;
    }
    
    public void addReminder(Reminder reminder){
        reminders.add(reminder);
    }
    
    public ArrayList<Reminder> getReminders(){
        return reminders;
    }
}
