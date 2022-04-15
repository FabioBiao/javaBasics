package udemy;

class MachineAnomymous {
    public void start() {
        System.out.println("Starting machine ...");
    }
}

interface Plant {
    public void grow();
}

public class AnomymousClass {

    public static void main(String[] args) {
        
        // This is equivalent to creating a class that "extends"
        // Machine and overrides the start method.
    	MachineAnomymous machine1 = new MachineAnomymous() {
            @Override public void start() {
                System.out.println("Camera snapping ....");
            }
        };
        
        machine1.start();
        
        // this retuns error because you can't implement a interface
        // Plant plant12 = new Plant();
        
        // This is equivalent to creating a class that "implements"
        // the Plant interface
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
                
            }
        };
        
        plant1.grow();
    }
}