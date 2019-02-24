package game;


public class Item {
    private int hp;
    private int exp;
    private int atk;
    private String name;
    
    public Item(int type){
        if(type == 1){
            potion();
        }else if(type == 2){
            steak();
        }else if(type == 3){
            scroll();
        }
    }
    
    public void potion(){
        this.name = "potion";
        this.hp = 50;
    }
    
    public void steak(){
        this.name = "steak";
        this.atk = 10;
    }
    
    public void scroll(){
        this.name = "scroll";
        this.exp = 20;
    }
    
    public String getName(){
        return this.name;       
    }
    
    
    public int getHp(){
        return this.hp;
    }
    
       
          
}

