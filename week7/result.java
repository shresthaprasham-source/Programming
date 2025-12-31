package week7;


/**
 * Write a description of class result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class result
{
    int subject1;
    int subject2;
    int subject3;
    int total;
    int per;
    void totalmarks()
    {
        total=subject1+subject2+subject3;        
    }
    void percentage()
    {
         per=(total /300)*100;
         
    }
    void display()
    {
    System.out.println("Total Marks: " + total);
    System.out.println("Percentage: " + per);    
    }
}