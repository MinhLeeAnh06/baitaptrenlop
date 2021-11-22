/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B12;

/**
 *
 * @author Minhleeanh06
 */


abstract class shape {
    Double x,y;
    // contructors;
    public shape(double x, double y ){
        this.x=x;
        this.y=y;
    }
    public shape(double x){
        this.x=x;
    }
    
    void show(){
        System.out.println("shape");
}
   abstract double area();
    
}

 class Rectangle extends shape{
     public Rectangle (double x , double y ){
         super(x,y);
           
     }
    
     @Override
     void show (){
         System.out.println("rectangle");
          
     }
     @Override
     double area(){
         return x*y;
     }
}
class Square extends shape{
    public Square(double x ){
        super (x);
}
    @Override
    double area(){
        return x*x;
    }
    @Override
    void show(){
    System.out.println("square");}
}

public class abtruction_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5,10);
        rectangle.show();
        System.out.println(rectangle.area());
        
        Square square = new Square (10);
        square.show();
        System.out.println(square.area());
        
        
        // TODO code application logic here
    }
    
}
