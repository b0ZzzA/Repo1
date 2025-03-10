/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp1;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class JavaApp1 {

    public static double calcRectangleArea(double length, double width)
    {
        return length*width;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double rectangleLength;
        String l=JOptionPane.showInputDialog("Enter length");
        rectangleLength=Double.parseDouble(l);
        Double rectangleWidth;
        String w=JOptionPane.showInputDialog("Enter width");
        rectangleWidth=Double.parseDouble(w);
        Double rectangleArea=calcRectangleArea(rectangleLength,rectangleWidth);
        System.out.println("Area of rectangle length : " + rectangleLength + "width : " + rectangleWidth + "area of rectangle is : "+ rectangleArea);
        
        // TODO code application logic here
    }
    
}
