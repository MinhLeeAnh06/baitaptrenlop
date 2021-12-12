/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b10;

/**
 *
 * @author Minhleeanh06
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LTV my = new LTV();my.in4();
        System.out.println("ten cua LTV la "+my.tenLTV );
        System.out.println("muc luong cua LTV la " +my.a );
        System.out.println("duoc thuong them la "+ my.bonus);
        System.out.println("ngon ngu LTV su dung la " + my.NN  );
        System.out.println("gio lam viec la "+ my.TGl);
        Testter myy = new Testter();
        myy.in4();
        System.out.println("ten cua Tester la  "+my.tentestter );
        System.out.println("muc luong cua Tester la " +my.a );
        System.out.println("duoc thuong hang thang la " + myy.bonus);
        System.out.println("thoi gian la viec la  " + myy.TGL);
        System.out.println("ngon ngu ma tester su dung la "+ myy.NN);
        // TODO code application logic here
    }
    // tao ra lap trinh vien 
   
}
 class NV{ 
     public void in4 (){
         System.out.println("day la thong tin nhan vien trong cong ty");
     }
      String tenLTV    = " Le anh minh ";
      String tentestter    = " NNN";
       int a = 50000;
    }
class LTV extends NV{
    String NN = " JAva";
    String TGl = " 8h/d";
    int bonus = 10000;
}
class Testter extends NV {
    String NN = " C";
    String TGL = "9h/d";
    int bonus = 15000;
    
} 