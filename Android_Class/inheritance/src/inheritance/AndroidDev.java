package inheritance;

public class AndroidDev extends Developer{
   int bonus = 1000;

   @Override
    public int getSalary(){
    return super.getSalary() +bonus;
    }
    
   @Override
    public int getTotal(){
    return super.getTotal() + bonus;
    }
}
