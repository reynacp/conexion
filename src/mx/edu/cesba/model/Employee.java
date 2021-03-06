/*
Nombre: Castro Pacheco 
Matricula: 2022835
 */
package mx.edu.cesba.model;


public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private double salary;
    private String hiredate;
    public int setId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    
    
    
    
    
    
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




