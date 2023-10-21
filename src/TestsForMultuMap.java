import java.util.LinkedList;

public class TestsForMultuMap {
    public static void main(String[] args) {
        MyHashMultiMap myHashMultiMap = new MyHashMultiMap();
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        myHashMultiMap.put(1,intList);
        System.out.println(myHashMultiMap.get(1));
        myHashMultiMap.remove(1);
        System.out.println(myHashMultiMap.get(1));



    }
}
