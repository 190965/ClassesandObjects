public class HelloWorld{
    public static void main(String[] args)
    {
        Gundam sausage = new Gundam("sausage","red",170); // datatype is gundam. "new" triggers the constructor. 
        Gundam jack = new Gundam("in the box","carbon",120);// jack is the name of the object
        
        //no do something with the objects
        System.out.println(jack.getName()); //get and print the value of name in the jack object    
        jack.setName("Steven");
        System.out.println(jack.getName());
        System.out.println(jack.getColor());
        System.out.println(jack.getHeight());
    }
}