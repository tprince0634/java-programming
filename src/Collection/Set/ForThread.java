package Collection.Set;

import java.util.concurrent.ConcurrentSkipListSet;

public class ForThread {
    ConcurrentSkipListSet<Integer> a = new ConcurrentSkipListSet<>();


/**
 *  CopyOnWriteArraySet<Integer> csk = new CopyOnWriteArraySet<>();
 *         ConcurrentSkipListSet<Integer> mi = new ConcurrentSkipListSet<>();
 *
 *         for (int i = 1; i <= 5; i++) {
 *             cpyonwarray.add(i);
 *             cskipset.add(i);
 *         }
 *
 *         System.out.println("CopyOnWriteArraySet" + cpyonwarray);
 *         System.out.println("ConcurrentSkipListSet" + cskipset);
 *
 *         for(Integer num : cpyonwarray){
 *             System.out.println(num);
 *             //attempt to modify the set during execution
 *             cpyonwarray.add(6);
 *
 *         }
 *         System.out.println("After the loop on a execute on a new copy " + cpyonwarray);
 *
 * //-----------------------------------------------------------------------------------------------------------
 *
 *         for(Integer num : cskipset){
 *             System.out.println("ConcurrentSkipListSet"+ num);
 *             cskipset.add(6);
 *         }*/



}
