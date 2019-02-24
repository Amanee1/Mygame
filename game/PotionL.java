
package game;


public class PotionL extends Item{
    private String name;    
    private int restore;

    public PotionL(){
        super(20);
        this.name = "Potion L";
        this.restore = 20;
    }
    
    public void detail(){
        System.out.println("----------------------");
        System.out.println("Item : " + this.name );
        System.out.println("Restore : " + this.restore);
        System.out.println("----------------------");
    }
}

