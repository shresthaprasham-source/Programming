package week7;


/**
 * Write a description of class mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mobile
{
    String brand;
    double price;
    public void isAffordable()
    {
        if(price<200000)
        {
            System.out.println("brand: " + brand + "price: " + price);
        }
    }
}