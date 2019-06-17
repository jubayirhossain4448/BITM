
public class OOPexample { 
    
    
    public static void main(String[] args) {
        Person person1 = new Person ();
        person1.firstName ="Mr";
        person1.middleName ="Robiul";
        person1.lasttName ="Islam";
         Person person3 = person1;
        person3.lasttName ="fiz";
        
        String fullname = person1.getFullName();
        System.out.println(fullname);
        
       
        
        
         Person person2 = new Person ();
        person2.firstName ="Md";
        person2.middleName ="Islam";
        person2.lasttName ="Haider";
       
        person2 = person1;
       
        
        person2 = person1;
        fullname=person2.getFullName();
        System.out.println("fullName");
        
      
    }
    
      
 
    
            

    
    
}
