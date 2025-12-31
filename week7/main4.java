package week7;


/**
 * Write a description of class main4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main4
{
    public static void main(String[] args)
    {
        laptop l1=new laptop();
        laptop l2=new laptop();
        laptop l3=new laptop();
        
        l1.brand="ASUS";
        l1.ramstorage=4;
        l1.price=50000;
        
         l2.brand="Lenovo";
        l2.ramstorage=8;
        l2.price=40000;
        
         l3.brand="Dell";
        l3.ramstorage=10;
        l3.price=45000;
        
        int highest=l1.ramstorage;
        if(l2.ramstorage > highest)
        {
            highest=l2.ramstorage;
        }
        if(l3.ramstorage> highest)
        {
            highest=l3.ramstorage;
        }
        System.out.println("the highest ram storage in GB is" + highest);
        
    
        
        
        
    }
}