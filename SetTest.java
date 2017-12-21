package collect;

import java.util.List;
import java.util.Set;

/**
 * Created by LIS on 21.12.2017.
 */
public class SetTest extends Collect{


    public static void union(Set set1, Set set2){
        set1.addAll(set2);
        print(set1);
    }


    public static void intersect(Set set1, Set set2){
        set1.retainAll(set2);
        print(set1);
    }

}
