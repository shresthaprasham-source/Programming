
/**
 * Write a description of class number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number
{
    public static void check(int num)
    {
        if(num>0)
        {
            System.out.println("positive" + num);

        }
        else if(num<0)
        {
            System.out.println("negative" + num);

        }
        else
        {
            System.out.println("zero" + num);

        }
    }
    public static void check( long n)
    {
        if(n%2==0)
        {
            System.out.println("even" + n);

        }
        else
        {
            System.out.println("odd" + n);

        }
    }
    public static void main(String[] args)
    {
        int num=2;
        long n=5;
        check(num);
        check(n);
        
        
    }
    
}