/*
* Name: Amuba Chidimma
 * Email: stapojmikky@gmail.com
 * Course: Java Programming
 * Venue: Youth Empowerment Centre: 27 Point Road, Apapa(inside St.George's Military Church
 * Question: Area of a Circle   // Area of a circle: A=πr2
 */
package circlearea;

import java.util.Scanner;

/**
 *
 * @author Anthony Ewoma
 */
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        double radius;
        double area;
        
        System.out.println("Enter Radius ");
        radius = keyboard.nextDouble();
        
        area = Math.PI * (radius * radius);
       System.out.println("Area = {0:F2}" + area);
    }
    
}
