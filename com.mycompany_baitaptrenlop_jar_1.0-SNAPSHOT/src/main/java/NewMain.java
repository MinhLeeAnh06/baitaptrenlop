/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Minhleeanh06
 */
class Example {
    // day la method overloadding : trung ten , roi khac tat ca , chi can cung te n
    
    int add (int a , int b ){
    return a+b;}
    int add(int a , int b, int c ){
    return a+b+c;}
    double add (double a, double b){return a+b;}
}

// mieu ta method overrding 
// base class 
class Vehicle{
    void ShowIn4(){
        System.out.println("day la cac loai xe");
    }
    void other (){
    System.out.println("other method ");}
}
// sub class 
class Oto  extends Vehicle{
    void ShowIn4(){
    System.out.println("day la xe oto");}
    
}
class Xemay extends Vehicle{
void ShowIn4(){
System.out.println("day la xe may");}
}
class Xedap extends Vehicle{
    void ShowIn4(){
    System.out.println("day la xe dap");}
}

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Vehicle M [] = new Vehicle[3];
         M[0] = new Oto();
         M[1] = new Xemay();
         M[2] = new Xedap();
        // TODO code application logic here
        //Example example = new Example();
        //System.out.println(example.add(10, 20));
        //System.out.println(example.add(10.0,20.0));
        for(int i = 0; i < 3 ; i ++){
            M[i].ShowIn4();
        }
      
        
                
    }
    
}
