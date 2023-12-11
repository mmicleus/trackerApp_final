/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

import trackerapp.enums.ReminderActivity;
import java.time.LocalTime;

/**
 *
 * @author micle
 */
public class Reminder {
    private ReminderActivity activity;
    private LocalTime time;

    public Reminder() {
        this.activity = ReminderActivity.DRINK_WATER;
        time = LocalTime.of(0, 0, 0);	 
    }

    public Reminder(ReminderActivity activity, LocalTime time) {
        this.activity = activity;
        this.time = time;
    }

    public ReminderActivity getActivity() {
        return activity;
    }

    public void setActivity(ReminderActivity activity) {
        this.activity = activity;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    
    
    
    
}
