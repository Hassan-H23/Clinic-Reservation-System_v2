/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms2;

/**
 *
 * @author Hassan
 */
import java.util.ArrayList;

public class Doctor extends Clinic {
public ArrayList<Slots> Doc_Time_Slots = new ArrayList<>();
private static int ID = 0;
final int D_ID;
private String Doctor_Name;
private String D_Password;
private String specialization;
private  double fees;
private String Day;
private  String Time_Slot;
private  int Time_s;
private int Patients;
//Constructor
 public Doctor(String Doc_Name, String specialization, double fees, String Day, int Time_s, String D_Password) {
        this.Doctor_Name = Doc_Name;
        this.D_Password = D_Password;
        this.specialization = specialization;
        this.fees = fees;
        this.Day = Day;
        D_ID = ++ID; //Auto-ID Genarator
        Patients = 0;
        this.Time_s = Time_s;
        for(int i = 0; i < 4;i++){
        this.Time_Slot = Time_Format_Conversion(Time_s);
        Slots s = new Slots(Time_Slot, "Available");
        Doc_Time_Slots.add(s);
        Time_s = Time_s + 1800; // 30 min
        }
    }

//Setters & Getters

    public int getID() {
        return D_ID;
    }


    public String getDoctor_Name() {
        return Doctor_Name;
    }

    public void setDoctor_Name(String Doctor_Name) {
        this.Doctor_Name = Doctor_Name;
    }

    public String getD_Password() {
        return D_Password;
    }

    public void setD_Password(String D_Password) {
        this.D_Password = D_Password;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public int getPatients() {
        return Patients;
    }

    public void setPatients(int Patients) {
        this.Patients = Patients;
    }
//Methods
 
 
 //Function that converts seconds to hours:minutes.
  private String Time_Format_Conversion(int seconds){
          String minutes;
         int m = seconds/60;
             if(m%60 == 0){
         minutes = "00";
         }
             else{
             minutes = Integer.toString(m%60);
             }
         String hours = Integer.toString(m/60);
        return hours + ":" + minutes;
          }
  
  
  

  public void Update_Schdule(String day, int time_s){
  Doc_Time_Slots.clear();
  Day = day; 
for(int i = 0; i < 4;i++){
    
    String Time_Slot1;
        Time_Slot1 = Time_Format_Conversion(time_s);
        Slots s = new Slots(Time_Slot1, "Available");
        Doc_Time_Slots.add(s);
        time_s = time_s + 1800; // 30 min
        }
  
  }
   
  public void Update_Fees(double fees)
  {
     setFees(fees);
  }
 //useless 
//  public String[] View_Doctor_Schdule(int counter){
// String data[] = new String[4];
// Slots s = Doc_Time_Slots.get(counter);
// data[0] = s.getTime_Slot();
// data[1] = s.getAvailability();
// data[2] = s.getPatient_Name();
// 
// return data; 
// 
//
//  }
  
    @Override
    public String toString() {
        return "Doctor{" + "Doc_Time_Slots=" + Doc_Time_Slots + ", D_ID=" + D_ID + ", Doctor_Name=" + Doctor_Name + ", D_Password=" + D_Password + ", specialization=" + specialization + ", fees=" + fees + ", Day=" + Day + ", Patients=" + Patients + '}';
    }
 
 
}
