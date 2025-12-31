
/**
 * Write a description of class Pigeon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pigeon extends Bird
{
void steerinnature()
{
  System.out.println("Pigeon steers in nature.");
}
public static void main(String[] args)
{
    Pigeon obj=new Pigeon();
    obj.fly();
    obj.eat();
obj.steerinnature();
    
    
}
    
}