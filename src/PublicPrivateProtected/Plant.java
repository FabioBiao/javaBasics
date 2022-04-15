package PublicPrivateProtected;

class Something {
    
}

public class Plant {
    // Bad practice, variables can be accessed everywhere
	// ideally we need to create a method that returns this
    public String name;
    
    // Accepetable practice --- it's final.
    public final static int ID = 8;
    
    private String type;
    
    protected String size;
    
    // by default is package level
    int height;
    
    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}

