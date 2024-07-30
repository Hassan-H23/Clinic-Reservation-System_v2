/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms2;

/**
 *
 * @author Hassan
 */
public class Admin extends Clinic {
private static int ID = 0;
final int A_ID;
private String Admin_Name;
private String A_Password;
//Constructor
    public Admin(String Admin_Name, String A_Password ){
        this.Admin_Name = Admin_Name;
        this.A_Password = A_Password;
        A_ID = ++ID; //Auto-ID Genarator
    }
//Setters & Getters

    public int getID() {
        return A_ID;
    }

    public String getAdmin_Name() {
        return Admin_Name;
    }

    public void setAdmin_Name(String Admin_Name) {
        this.Admin_Name = Admin_Name;
    }

    public String getA_Password() {
        return A_Password;
    }

    public void setA_Password(String A_Password) {
        this.A_Password = A_Password;
    }
    
    
    


    
}
