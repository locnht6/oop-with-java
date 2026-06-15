package amazingrace;

import data.Cat;
import data.Dog;
import data.Pet;

public class AmazingRace {

    public static void main(String[] args) {
        
        register();
        
    }
    
    public static void register() {
        
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        kitty.showRecord();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2021, 50.0);
        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
        ngaoDa.showRecord();
        beTo.showRecord();
        
    }
    
}
