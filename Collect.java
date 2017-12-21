package collect;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


abstract class Collect {
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

}
