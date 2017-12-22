package collect;

import java.util.*;


abstract class Collect {
    /*
   static void print(List list){
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    static void print(Set set){
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    */
    static void print(Collection set){
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
