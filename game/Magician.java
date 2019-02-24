package game;


    public class Magician extends Novice {
    private String mgName;
    private String mgSkill;
    
    public Magician() {
        super("Player","Holy light");
        this.mgName = "Magician";
        this.mgSkill = "Holy light";
    }
    
    public void classlist(){
        System.out.println("----------------------");
        System.out.println("Name :" + getName());
        System.out.println("Class :" + this.mgName);
        System.out.println("Class Skill :" + this.mgSkill);
        System.out.println("----------------------");
    }
    
    
}
    

