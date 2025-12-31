
/**
 * Write a description of class squareofnum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class squareofnum
{
    
    public int square(int num)
    {
        System.out.println(num*num);
        return (num*num);
    }
    public static void main(String[] args)
    {
        squareofnum s1=new squareofnum();
        int result=s1.square(5);
        System.out.println("Square is" + result);
        
    }
}