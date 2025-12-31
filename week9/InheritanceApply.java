
/**
 * Write a description of class InheritanceApply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InheritanceApply
{
   public static void main(String[] args)
   { 
       CalculationThird Third= new CalculationThird();
       
       Third.num1=10;
           Third.num2=5;
       
       Third.add();
       Third.subract();
       Third.multiply();
       Third.factorial(5);
       Third.division();
   }
}