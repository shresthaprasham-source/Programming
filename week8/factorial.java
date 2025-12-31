
/**
 * Write a description of class factorial here.
 *
 * @a uthor (your name)
 * @version (a version number or a date)
 */
public class factorial
{
    public static void displayfactorial(int num)
    {
        int fact=1;
    for(int i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    System.out.println("Factorial of" + num + "is:" + fact);
    }
    
}