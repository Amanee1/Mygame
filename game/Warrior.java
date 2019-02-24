package game;


public class Warrior extends Novice {
    private String wrName;
    private String wrSkill;
    
    public Warrior() {
        super("Player","Dash" );
        this.wrName = "Warrior";
        this.wrSkill = "Dash";
    }
    
    public void classlist(){
        System.out.println("----------------------");
        System.out.println("Name :" + getName());
        System.out.println("Class :" + this.wrName);
        System.out.println("Class Skill :" + this.wrSkill);
        System.out.println("----------------------");
    }
    
    
}
