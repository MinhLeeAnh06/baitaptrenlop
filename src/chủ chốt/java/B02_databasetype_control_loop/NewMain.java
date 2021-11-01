package B3_string_useinput;

import java.util.Scanner;import java.util.DoubleSummaryStatistics;

/**
 *
 * @author Minhleeanh06
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner In4 = new Scanner (System.in);
        String ten = In4.nextLine();
        int tuoi = In4.nextInt();
        String lop  = In4.nextLine();
        System.out.println("nhap diem toan vao day\n");
        Double toan;
        toan = In4.nextDouble();
        Double ly = In4.nextDouble();
        System.out.println("nhap diem so ly vao day\n");
        Double hoa;
        System.out.println("nhap diem so hoa vao day \n");
        hoa = In4.nextDouble();
        System.out.println("ten toi la :"+ten );
        System.out.println("tuoi toi la : "  + tuoi );
        System.out.println("lop la : " +  lop);
        // TODO code application logic here
        // nhap diem
    }
    
}
