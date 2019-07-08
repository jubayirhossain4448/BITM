
package oop.pkg03.access.modifiar.and.polymorphism;

public class PythonDev extends Developer{
    private int bonus = 50000;
    private int salary = 60000;
    private String change = "Bangladesh changed to USA";

    @Override
   public int getSalary(){
       return  bonus + salary;
       
   }
   public String getChange(){
       
       return change;
   }

   
}
