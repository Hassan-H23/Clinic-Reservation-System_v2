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
public class Clinic {
    
    
  public  static  ArrayList<Doctor> Doctor_arr = new ArrayList<>();
     //ArrayList for Patient 
  public static  ArrayList<Patient> Patient_arr = new ArrayList<>();;
     //ArrayList for Orders 
  public static  ArrayList<Orders> orders_arr = new ArrayList<>();
    //ArrayList for Reservations 
  public static  ArrayList<Reservation> Reservation_arr = new ArrayList<>();
       //ArrayList for Admins 
   protected  ArrayList<Admin> Admin_arr = new ArrayList<>();
   
//
//public Clinic(){
//
//Doctor_arr.add(new Doctor("Hassan","ass", 12.7, "12/12/2022", 1234, "123"));
//Doctor_arr.add(new Doctor("Ali","ass", 12.7, "12/12/2022", 1234, "1234"));
//
//}

   
    public Patient P_login (String name, String pass)
            
    {
        
        Patient p = null;
        for (int i=0; i<Patient_arr.size(); i++)
        { 
            p = (Patient) Patient_arr.get(i);
            if (p.getPatient_Name().equals(name) && p.getP_Password().equals(pass))
                return p;
        }
        return null;
    }
    
     public Doctor D_login (String name, String pass)
    {
        Doctor d = null;
        for (int i=0; i<Doctor_arr.size(); i++)
        { 
            d = (Doctor) Doctor_arr.get(i);
            if (d.getDoctor_Name().equals(name) && d.getD_Password().equals(pass))
                return d;
        }
        return null;
    }
     
         public Admin A_login (String name, String pass)
    {
        Admin a = null;
        for (int i=0; i<Admin_arr.size(); i++)
        { 
            a = (Admin) Admin_arr.get(i);
            if (a.getAdmin_Name().equals(name) && a.getA_Password().equals(pass))
                return a;
        }
        return null;
    }
      
   
         
         
 
         
 
  
  
  
  
  }
    

