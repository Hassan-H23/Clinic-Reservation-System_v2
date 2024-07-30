/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms2;
import java.util.*;
/**
 *
 * @author Hassan
 */


public class Patient extends Clinic {
private static int ID = 0;
final int P_ID;
private String Patient_Name;
private String P_Password;
private String DOB;
//Constructor
    public Patient(String Patient_Name, String Password, String DOB) {
        this.Patient_Name = Patient_Name;
        this.P_Password = Password;
        this.DOB = DOB;
        P_ID = ++ID; //Auto-ID Genarator
    }
//Setters & Getters
        public int getID() {
        return P_ID;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public String getP_Password() {
        return P_Password;
    }

    public void setPassword(String Password) {
        this.P_Password = Password;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
//Methods
    
    //Method that add's a patient to the Patient ArrayList
    public void Add_Patient(Patient p){
    
    Clinic.Patient_arr.add(p);
    }
    
}
