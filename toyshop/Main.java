package toyshop;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(00, "Вертолет", 10);
        Toy toy2 = new Toy(01, "Машинка", 50);
        Toy toy3 = new Toy(02, "Кукла", 8);
        Toy toy4 = new Toy(03, "Пазлы", 23);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyShop toyStore = new ToyShop(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }
    
    
}
