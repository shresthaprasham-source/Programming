
/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    public static int add(int a, int b)
    {
       
        System.out.println(a+b);
        return (a+b);
    }
    public static int subract(int a, int b)
    {
        
        System.out.println(a-b);
        return(a-b);
    }
    public static int multiply(int a, int b)
    {
        
        System.out.println(a*b);
        return(a*b);
    }
    public static int remainder(int a, int b)
    {
        
        System.out.println(a%b);
        return(a%b);
        
    }
    public static int quotient(int a, int b)
    {
        
        System.out.println(a/b);
        return(a/b);
        
    }
   public static void main(String[] args)
    {
        add(2,3);
        subract(5,2);
        multiply(2,2);
        remainder(10,2);
        quotient(4,2);
    }
    
}