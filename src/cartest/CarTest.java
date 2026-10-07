/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartest;


public class CarTest {


    public static void main(String[] args) {
        Car car1 = new Car("38 AB 467", "Volvo XC90", 15.0, 60.0);

        car1.checkStatus();
        System.out.println("---------------------------------");

        
        car1.drive(120);
        car1.checkStatus();
        System.out.println("---------------------------------");

        
        car1.refuel(100);
        car1.checkStatus();
        System.out.println("---------------------------------");

        
        car1.drive(700);
        System.out.println("---------------------------------");

        
        car1.checkStatus();
 

        
    }
    
}
