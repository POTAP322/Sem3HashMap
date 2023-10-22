import java.util.LinkedList;

public class TestsForMultuMap {
    public static void main(String[] args) {
        MyHashMultiMap myHashMultiMap = new MyHashMultiMap();
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        myHashMultiMap.put(1,intList);

        LinkedList<Integer> intList2 = new LinkedList<>();
        intList2.add(40);
        intList2.add(50);
        intList2.add(60);
        myHashMultiMap.put("lol",intList2);


        System.out.println(myHashMultiMap.get(1));
        //myHashMultiMap.remove(1);
        //System.out.println(myHashMultiMap.get(1));
        System.out.println("----------");
        System.out.println(myHashMultiMap.entryCount());
        System.out.println(myHashMultiMap.keySet());
        MyHashMultiMap.print(myHashMultiMap);



    }

}
