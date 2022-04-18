package Inheritance;

public class Machine {
    
	// can be accessed anywhere inside the package and from any child class
    protected String name = "Machine Type 1";
    
    public void start() {
        System.out.println("Machine started.");
    }
    
    public void stop() {
        System.out.println("Machine stopped.");
    }
}