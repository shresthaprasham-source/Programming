package week7;


/**
 * Write a description of class main5 here.price
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main5
{
        
    public static void main(String[] args)
    {
        mobile m1=new mobile();
         mobile m2=new mobile();
          mobile m3=new mobile();
          
          m1.brand="Iphone";
          m1.price=200000;
          m2.brand="Samsung";
          m2.price=150000;
          m3.brand="Vivo";
          m3.price=100000;
          
          m1.isAffordable();
          m2.isAffordable();
          m3.isAffordable();
    }
}