package game;
import java.util.Scanner;

public class Game {
            
    public static void main(String[] args) {
        int sl,cp;
        boolean status = true;
        Scanner sc = new Scanner(System.in);
        Novice player = new Novice("Player","Class");
        Bag playerBag = new Bag();
        
        System.out.println("select class");
        System.out.println("Press 1 : Warrior ");
        System.out.println("Press 2 : Magician ");
        System.out.print(">>>> ");
        String job = sc.next();
        if(job.equals("1")){
            Warrior myWar = new Warrior();
            myWar.classlist();
        }else if(job.equals("2")){
            Magician myMag = new Magician();
            myMag.classlist();
        }
                
        System.out.println("select Potion");
        System.out.println("Press 1 : Potion L");
        System.out.println("Press 2 : Potion M ");
        System.out.print(">>>> ");
        String potion = sc.next();
            if(potion.equals("1")){
                PotionL giftL = new PotionL();
                giftL.detail();
            }else if(potion.equals("2")){
                PotionM giftM = new PotionM();
                giftM.detail();
            }
        //System.out.print(">>>> ");
                     
        
        while(status){
            
            System.out.println("What do you want to do");
            System.out.println("Press 1 to add item");
            System.out.println("Press 2 to open bag");
            System.out.println("Press 3 to quit");
            System.out.println("----------------------");
            sl = sc.nextInt();
            if(sl == 2){
                playerBag.showItem();
            }else if(sl == 1){
                playerBag.addItem();
            }else if(sl == 3){
                status = false;
            }
                
            }
           
        }                        
    }
    
