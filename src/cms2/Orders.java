/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms2;

/**
 *
 * @author Hassan
 */
public class Orders extends Clinic {
    private static int ID = 0;
    final int O_ID;
    private String Med_Name;
    private double Med_price;
    private int Quantity;
    private String D_name;
    
//Constructor
    public Orders(String Med_Name, double Med_price, int Quantity, String D_name) {
        this.Med_Name = Med_Name;
        this.Med_price = Med_price;
        this.Quantity = Quantity;
        this.D_name = D_name;
        O_ID = ++ID;
    }
//Setters & Getters 

    public int getID() {
        return O_ID;
    }

    public String getMed_Name() {
        return Med_Name;
    }

    public void setMed_Name(String Med_Name) {
        this.Med_Name = Med_Name;
    }

    public double getMed_price() {
        return Med_price;
    }

    public void setMed_price(double Med_price) {
        this.Med_price = Med_price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getD_name() {
        return D_name;
    }

    public void setD_name(String D_name) {
        this.D_name = D_name;
    }
  //Methods
    public double Total_Price(){
     return Med_price * Quantity;
    }
    
}
