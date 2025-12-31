
/**
 * Write a description of class Husky here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Husky extends Dogs
{
    int id;
    public static void main(String[] args)
    {
        Husky obj = new Husky();
        obj.name="Snow";
        obj.color="white";
        obj.id=1;   
        
        obj.bark();
    }
}