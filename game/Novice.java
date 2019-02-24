package game;

public class Novice {
    private String name;
    private int hp;
    private int exp;
    private int atk;
    private String skill;
    
    public Novice(String name,String skill){
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.atk = atk;
        this.skill = "Dagger";
     
    }
        
    public String getName(){
        return this.name;
    }
    
    public String getSkill(){
        return this.skill;
    }
    
}
