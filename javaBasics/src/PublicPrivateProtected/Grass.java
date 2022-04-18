package PublicPrivateProtected;

public class Grass extends Plant {
    public Grass() {
        
    	// imagining this is in a package only with app.java and this class
    	
        // Won't work --- Grass not in same package as plant, even though it's a subclass
        // System.out.println(this.height);
    }
}

