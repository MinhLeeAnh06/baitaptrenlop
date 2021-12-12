/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b7;
import java.io.InputStream;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Minhleeanh06
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner In4 = new Scanner(System.in);
        int n = In4.nextInt();
        int [] so = new int[n];
        int tong = 0;
        int giaithua =1;
        long tonggt = 0;
        
        int m;
        for(int i =0 ; i<n;i++){
            so[i]=In4.nextInt();
            
            tong = so[i] + tong;
         }
        for(int i = 0; i<n;i++){ giaithua *= so[i];
        tonggt = giaithua ++;
        
         }
        for(int i =0 ; i<n;i++){for (int j =i+1; j<n-1;j++){
                if(so[i]>so[j]){
                    m = so[i];
                    so[i]=so[j];
                    so[j]=m;
                }
            }
        }
        
           System.out.println("tong cac so trong mang la " + tong);
           System.out.println("tong giai thua la " + giaithua);     }
    
}
