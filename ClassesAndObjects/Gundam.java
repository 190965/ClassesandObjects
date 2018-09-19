
/**
 * Write a description of class Gundam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gundam
{
    // instance variables -fields describing this robot
    private int height;
    private String color;
    private String name;

    /**
     * Constructor for objects of class Gundam
     */
    public Gundam(String theName, String theColor, int theHeight)
    {
        // initialise instance variables
        height = theHeight;//assign the value of theHeight to height
        color = theColor;
        name = theName;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()// get name for the name field
    {
        //System.out.println(name);
        return name;
    }
    
      public String getColor()// get name for the name field
    {
        return color;
    }
    
    public int getHeight()// get name for the name field
    {
        return height;
    }
    
    public void setName(String theName)
    {
        name = theName;
    }
    
    public void setColor(String theColor)
    {
        color = theColor;
    }
    
    public void setHeight(int theHeight)
    {
        height = theHeight;
    }
    
    // sets name for the name field. can reuse "theName" b/c the previous one is local
}
