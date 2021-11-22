/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B11;

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
        Employee employee = new Employee("mm", "sjfsfjsd", " 1221");
        employee.dowork();
        Programer programer = new Programer ("java","ss", "sfsdf", "5544");
        programer.dowork();
        programer.setProgramerlang("python"); 
        System.out.println(programer.programerlang);
        
    }

}
        