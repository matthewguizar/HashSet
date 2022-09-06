import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //initial capacity = 16(without resizing)
        //hashcode function (hashfunction) transforms the input into an array index
        //O(1) if no collisions but memory heavy
        //with collisions O(logN)
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        //no duplicate values
        set.add("matthew");
        set.add("matte");
        set.add("azul");
        set.add("name");

        
        set2.add("matthew");
        set2.add("name");
        
        System.out.println(set.containsAll(set2));
        
        for(String s : set){
            System.out.println(s);
        }
    }
}