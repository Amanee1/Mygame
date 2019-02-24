
package game;


public class PotionM extends Item{
    private String name;    
    private int restore;

    public PotionM(){
        super(20);
        this.name = "Potion M";
        this.restore = 10;
    }
    
    public void detail(){
        System.out.println("----------------------");
        System.out.println("Item : " + this.name );
        System.out.println("Restore : +" + this.restore);
        System.out.println("----------------------");
    }
}

