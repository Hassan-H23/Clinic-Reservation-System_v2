/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms2;

/**
 *
 * @author Hassan
 */
public class Reservation {
    private static int ID = 0;
    final int R_ID; 
    int Doc_ID;
    String D_Name;
    String P_Name;
    String D_Slot;
    String Day;
    double D_fee;
//Constructor
    public Reservation(int Doc_ID, String D_Name, String P_Name, String D_Slot, String Day, double D_fee) {
        this.Doc_ID = Doc_ID;
        this.D_Name = D_Name;
        this.P_Name = P_Name;
        this.D_Slot = D_Slot;
        this.Day = Day;
        this.D_fee = D_fee;
        R_ID = ++ID;
    }
//Accessors & Mutators

    public int getDoc_ID() {
        return Doc_ID;
    }

    public void setD_ID(int Doc_ID) {
        this.Doc_ID = Doc_ID;
    }

    public String getD_Name() {
        return D_Name;
    }

    public void setD_Name(String D_Name) {
        this.D_Name = D_Name;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String P_Name) {
        this.P_Name = P_Name;
    }

    public String getD_Slot() {
        return D_Slot;
    }

    public void setD_Slot(String D_Slot) {
        this.D_Slot = D_Slot;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public double getD_fee() {
        return D_fee;
    }

    public void setD_fee(double D_fee) {
        this.D_fee = D_fee;
    }
    
}
