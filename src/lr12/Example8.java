package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>();
        Random random= new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(200)); 
        }
        System.out.println(list);
        list=lessThan(list,100);
        System.out.println(list);
    }
    public static List<Integer> lessThan(List<Integer> list,int number) {
        return list.stream().filter(x->(x<number)).collect(Collectors.toList());
    }
}
