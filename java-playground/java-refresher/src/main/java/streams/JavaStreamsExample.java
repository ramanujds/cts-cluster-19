package streams;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamsExample {

    public static void main(String[] args) {

        List<Integer> list = List.of(3,6,4,7,9);

        // find all the even numbers from the list

//        List<Integer> evens = new ArrayList<>();
//
//        for (int num:list){
//            if (num%2==0){
//                evens.add(num);
//            }
//        }



        List<Integer> evens = list.stream()
                                    .filter(n->n%2==0)
                                    .map(n->n*n)
                                    .sorted()
                                    .toList();


        System.out.println(list);
        System.out.println(evens);



    }

}
