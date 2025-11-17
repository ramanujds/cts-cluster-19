package lists;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();

        items.add(10);
        items.add(50);
        items.add(100);

        int item = 50;

       int num =items.stream().filter(e->e==item).findFirst().get();


    }


}
