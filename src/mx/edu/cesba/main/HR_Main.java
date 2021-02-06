/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

/**
 *
 * @author Samsung
 */
public class HR_Main {
   
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.id = Integer.parseInt(OptionPane.showInputDialog("Ingrese numero de empleado"));
        e1.firstName = JOptionPane.showInputDialog("Ingrese el nombre");
        e1.lastName = JOptionPane.showInputDialog("Ingrese el apellido");
        e1.age = Integer.parseInt(OptionPane.showInputDialog("Ingrese la edad"));
        e1.email = JOptionPane.showInputDialog("Ingrese el correo");
        e1.phoneNumber = Integer.parseInt(OptionPane.showInputDialog("Ingrese numero de telefono"));
        e1.salary = Double.parseDouble(OptionPane.showInputDialog("Ingrese la edad"));
        e1.hiredate = JOptionPane.showInputDialog("Ingrese fecha de contratacion");
        
        
        e2.id = Integer.parseInt(OptionPane.showInputDialog("Ingrese numero de empleado"));
        e2.firstName = JOptionPane.showInputDialog("Ingrese el nombre");
        e2.lastName = JOptionPane.showInputDialog("Ingrese el apellido");
        e2.age = Integer.parseInt(OptionPane.showInputDialog("Ingrese la edad"));
        e2.email = JOptionPane.showInputDialog("Ingrese el correo");
        e2.phoneNumber = Integer.parseInt(OptionPane.showInputDialog("Ingrese numero de telefono"));
        e2.salary = Double.parseDouble(OptionPane.showInputDialog("Ingrese la edad"));
        e2.hiredate = JOptionPane.showInputDialog("Ingrese fecha de contratacion");
        
        e1.getDetails();
        System.out.println("------------------------------------");
        e2.getDetails();
        
        
        
        
    }
    
}
