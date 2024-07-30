/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms2;

import java.io.Serializable;

/**
 *
 * @author Hassan
 */
public class Slots implements Serializable {
    private String Time_Slot;
    private String availability;
    private String Patient_Name;

    public String getTime_Slot() {
        return Time_Slot;
    }

    public void setTime_Slot(String Time_Slot) {
        this.Time_Slot = Time_Slot;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }
    
    public Slots(String Time_Slot, String availability, String Patient_Name) {
        this.Time_Slot = Time_Slot;
        this.availability = availability;
        if(this.availability == "unavailable"){
        }
        else {
        
        this.availability = "Available";
        this.Patient_Name = " ";
        
        }
    }
 public Slots(String Time_Slot, String availability) {
        this.Time_Slot = Time_Slot;
        this.availability = availability;
    }
 public Slots(String Time_Slot) {
        this.Time_Slot = Time_Slot;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return Time_Slot;
    }
 
}
