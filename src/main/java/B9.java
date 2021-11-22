/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Minhleeanh06
 */
public class B9 {

    /**
     * @param args the command line arguments
     */static void minh(){
         System.out.println("hi minh ");
     }
     
    
    public static void main(String[] args) {
        //minh();
      //car mycar = new car ();
       //mycar.color="white";
       
       //mycar.weight=2000;
      //System.out.println(mycar.color);
       //System.out.println(mycar.weight);
       //mycar.run();
       //mycar.brake();
       
       
       
       
      // moto my = new moto();
      // my.color="Blue";
      // my.yearborn=1972;
      // my.place= 5;   
      // my.brand= "Mescedes";
      // my.From="Korea";
       //System.out.println("mau cua xe la "+my.color);
       //System.out.println("nam san xuat cua xe la "+my.yearborn);
      // System.out.println("So cho ngoi cua xe la "+my.place);
      // System.out.println("Thuong hieu cua xe la "+my.brand);
       //my.run();
       //my.hah();
       Car mycar = new Car("white",200);
       System.out.println(mycar.color+" "+mycar.weight);
    }
    
} 
 class Car{
    String color ;
    float weight ;
    public Car(String c, float p){
    color =c;
    weight=p;}

}
//class moto{
    
  //  String color;
    //String brand;
    //int yearborn;   
    //int place;
    //String From;


    
    
   // public void run(){
       // System.out.println("yeahhh ");
    //}
   // public void hah(){
        //System.out.println("hahaa");
   //// }
//}
