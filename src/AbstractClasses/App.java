package AbstractClasses;

public class App {

    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);
        
        Car car1 = new Car();
        car1.setId(4);
        
        car1.run();
        
        //Machine machine1 = new Machine();
    }

}
 
// Abstract classes can be extended
// interfaces are implemented 

//Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
//Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.


