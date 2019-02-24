package game;
import java.util.ArrayList;
import java.util.Scanner;



public class Bag {
    private ArrayList<Item> items;
    //private Scanner sc;
    
     
     
    public Bag(){
	items = new ArrayList<Item>();
        
    }
        
    public void addItem(){
        int it;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Which item : >>1 for potion, 2 for steak, 3 for scroll<<");
        System.out.println("Press: ");
        it = sc.nextInt();
        Item buff = new Item(it);
        items.add(buff);
    }
        
    public void showItem(){
        System.out.println("------------------------------------------");
        for(Item inbag : items ){
            System.out.println(inbag.getName());
        }
        System.out.println("------------------------------------------");
    }
    
    
    
    
    
    
}
