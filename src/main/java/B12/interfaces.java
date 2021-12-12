/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B12;



/**
 *
 * @author Minhleeanh06
 */

interface secure{
char a();}
abstract class Customer{
    abstract void show ();
}


interface bank {
    double RateOfitn();
}
class Mb extends Customer implements secure{

    @Override
    void show() {
        System.out.println("security"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char a() {
        return 1;//To change body of generated methods, choose Tools | Templates.
    }
}
class VCB extends Customer implements bank{
    @Override
    void show(){
        System.out.println("bank");
    }

    @Override
    public double RateOfitn() {
        return 5.5; //To change body of generated methods, choose Tools | Templates.
    }
}
public class interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VCB vcb = new VCB();
        vcb.show();
        
        System.out.println(vcb.RateOfitn());
        Mb mb = new Mb();
        mb.show();
        System.out.println(mb.a());
        
        System.out.println("snf")
        
                // TODO code application logic here
;
    }
    
}
