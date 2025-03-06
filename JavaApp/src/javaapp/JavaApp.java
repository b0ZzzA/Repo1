/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String userInputString= JOptionPane.showInputDialog(null,"Enter name");
        JOptionPane.showMessageDialog(null, "hello" + userInputString + ":");
        String ageInput= JOptionPane.showInputDialog(null,"Enter your age: ");
        int age = Integer.parseInt(ageInput);
        int futureage=age+5;
        JOptionPane.showMessageDialog(null, futureage);
    }
    
}
