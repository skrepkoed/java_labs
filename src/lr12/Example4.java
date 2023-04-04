package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example4 {
    
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>();
        Random random= new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(200)); 
            System.out.println(list.get(i));
        }

        list=squareList(list);
        System.out.println(list);

    }
    public static List<Integer> squareList(List<Integer> list) {
       return list.stream().map(x->x*x).collect(Collectors.toList());
    }
}
