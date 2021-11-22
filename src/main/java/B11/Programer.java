/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B11;

/**
 *
 * @author Minhleeanh06
 */
public class Programer extends Employee{

String programerlang;
public Programer (String programerlang, String name, String email , String phone ){
    super (name,email,phone );
    this.programerlang= programerlang;
}


    void dowrok () {
        System.out.println("i'm writing");
        // TODO code application logic here
        
        
    }
    public void setProgramerlang(String programerlang){
    this.programerlang=programerlang;}
    public String getProgramerlang(){
       return this.programerlang;
    }      
    
    }

