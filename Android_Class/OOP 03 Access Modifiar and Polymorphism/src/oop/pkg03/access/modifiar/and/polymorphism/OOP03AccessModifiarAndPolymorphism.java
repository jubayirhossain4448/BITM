
package oop.pkg03.access.modifiar.and.polymorphism;

public class OOP03AccessModifiarAndPolymorphism {

    public static void main(String[] args) {
       PythonDev pythonDev = new PythonDev();
        System.out.println(pythonDev.getSalary());
        Developer dev = new PythonDev();
        PythonDev pDev = (PythonDev)dev;
        pDev.getChange();
      
    }
    
}
