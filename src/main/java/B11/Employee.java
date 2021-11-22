/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B11;

/**
 *
 * @author Minhleeanh06
 */
public class Employee {

private  String name ; 
private  String email; 
private String  phone ;
private double salary ;

        public Employee(String name , String email, String phone ){
            this.name = name ;
            this.email = email ;
            this.phone = phone ;  
            
        }
    void dowork(){
        System.out.println("i'm working");
    }
    public void setName(String name){
    this.name = name; 
    }
    public String getname (){
        return this.name; 
    }
    public void setEmail(String email){
        this.phone=phone;
    }
    public String getPhone(){
        return this.phone;
    }
  

}




