import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map hashmap = new HashMap<>();
        hashmap.put(5,"lolzzz");
        hashmap.put(6,"megalollzzzz");
        hashmap.size();
        MyHashMap kekMy = new MyHashMap();


        kekMy.put(44,"fsdfs");
        kekMy.put(49,"4354354353");
        kekMy.put(97,"dsadas");
        kekMy.put("a","megaman");
        kekMy.put("a","trapikbabik");
        kekMy.put(97,"alalalalla");
        kekMy.put(105,"wtffff");
        kekMy.put("AA",432);

        kekMy.put(50,hashmap);

        kekMy.printMyHashMap();
        String keysik = (String) kekMy.get(97);
        String keysik2 = (String) kekMy.get("a");
        System.out.println(keysik);
        System.out.println(keysik2);

        System.out.println("___________");

        kekMy.remove("a");
        kekMy.printMyHashMap();
        System.out.println("Size: ");
        System.out.println(kekMy.entryCount());
        System.out.println(kekMy.isEmpty());

        System.out.println(2088%7);

//        String Str1 = "a";
//        String Str2 = Str1;
//        String Str3 ="a";
//        boolean retVal;
//
//        retVal = Str1.equals(Str3);
//        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );
    }
}