
/**
 * Write a description of class multiplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class multiplication
{
    public int multiply(int num1, int num2)
    {
        System.out.println(num1*num2);
        return(num1*num2);
    }
   public static void main(String[] args)
   {
       Scanner sc =new Scanner(System.in);
       multiplication m1=new multiplication();
       System.out.println("enter two numbers");
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int result=m1.multiply(num1,num2);
       
       
   }
}