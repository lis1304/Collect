package collect;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by LIS on 21.12.2017.
 */
public class RaceCollect {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static LinkedList<Integer> linkedList = new LinkedList<>();
    public static final int Count = 1000;
    public static long start=0;
    public static long end = 0;

    public static long insertStartArray(){
        start = System.nanoTime();
        for (int i = 0; i < Count; i++) {
            arrayList.add(0,i);
        }
        end = System.nanoTime();
        return end - start;

    }
    public static long insertEndArray(){
        start = System.nanoTime();
        for (int i = 0; i < Count; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        return end - start;

    }
    public static long insertCenterArray(){
        start = System.nanoTime();
        for (int i = 0; i < Count; i++) {
            arrayList.add(arrayList.size()/2  ,i);
        }
        end = System.nanoTime();
        return end - start;

    }


    public static long insertStartLinked(){
        start = System.nanoTime();
        for (int i = 0; i < Count; i++) {
            linkedList.add(0,i);
        }
        end = System.nanoTime();
        return end - start;

    }
    public static long insertEndLinked(){
        start = System.nanoTime();
        for (int i = 0; i < Count; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        return end - start;

    }
    public static long insertCenterLinked(){
        start = System.nanoTime();
        for (int i = 0; i < Count; i++) {
            linkedList.add(linkedList.size()/2  ,i);
        }
        end = System.nanoTime();
        return end - start;
    }

}

