/*
Nombre: Castro Pacheco 
Matricula: 2022835
 */
package mx.edu.cesba.model;


public class Employee {
    
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public int phoneNumber;
    public double salary;
    public String hiredate;
    
    
    public void getDetails () {
        
       System.out.println("id:" + id);
       System.out.println("firsName:" + firstName);
       System.out.println("lastName:" + lastName);
       System.out.println("age:" + age);
       System.out.println("email:" + email);
       System.out.println("phoneNumber:" + phoneNumber);
       System.out.println("Salary:" + salary);
       System.out.println("hiredate:" + hiredate);
       
       
       
    }
    
    
} 




