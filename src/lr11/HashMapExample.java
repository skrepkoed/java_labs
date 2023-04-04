package lr11;

import java.util.HashMap;
import java.util.Random;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String>hash=new HashMap<Integer,String>();
        for(int i=0;i<10;i++){
            hash.put(i, randomString(10));
            //System.out.println(i+": "+hash.get(i));
        }

        choice(hash);

    }

    public static String randomString(int length) {
        Random random=new Random();
        String result="";
        int random_length=(int)random.ints(1, length).iterator().next();
        for(int i=0;i<random_length;i++){
            result+=(char)(int)random.ints(1, 256).iterator().next();
        }
        return result;
    }

    public static void choice(HashMap<Integer,String>hash) {
        for(int i=0;i<hash.size();i++){
            if (hash.get(i).length()>=5) {
                System.out.println(i+": "+hash.get(i));
                System.out.println("\n");
            }
            
            if (i>5) {
                System.out.println(i+": "+hash.get(i));
            }
        }
    }
}
