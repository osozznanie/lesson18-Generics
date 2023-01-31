package Ex2;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        Map<Integer,String> map = new Map<>(1,"Bred");
        map.addNew(2,"Milk");
        map.addNew(3,"RedBull");
        map.addNew(4,"Coffee");
        map.addNew(5,"Tea");
        map.addNew(6,"Chips");

        map.showMap();

        System.out.println();
        map.showKey();

        System.out.println();
        map.showValue();

        System.out.println();
        map.addNew(23,"Baka");
        map.showMap();

        map.removeByKey(5);
        map.showMap();

        map.removeByValue(3);
        map.showMap();
    }
}
