/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author Mobile App Develop
 */
public class Javabasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
       ArrayList <New> students = new ArrayList <New>();
       
       New s1 = new New("aaa","111");
       New s2 = new New("bbb","222");
       New s3 = new New("ccc","333");
       
       
       students.add(s1);
       students.add(s2);
       students.add(s3);
       
       for(New student : students) {
           
           System.out.println(student.toString());
           
       }
       
       System.out.println(students.get(1).getName());
       
       
       
       
    }
    
    public static int getRandom(){
        
        Random random = new Random();
        
        return 10 + random.nextInt(90);
    }
              
    
   
        
    
    
    
}
